package com.wireframesketcher.model.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.wireframesketcher.model.Master;
import com.wireframesketcher.model.NameSupport;
import com.wireframesketcher.model.Screen;
import com.wireframesketcher.model.Widget;
import com.wireframesketcher.model.util.WidgetTreeIterator;

public class ModelXMLResourceImpl extends XMLResourceImpl {
	private long nextId;

	public ModelXMLResourceImpl() {
		super();
	}

	public ModelXMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void init() {
		super.init();
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new ModelXMLHelperImpl(this);
	}

	@Override
	public String getURIFragment(EObject object) {
		if (object instanceof NameSupport) {
			String name = ((NameSupport) object).getName();
			if (name != null)
				return name;
		}

		return super.getURIFragment(object);
	}

	public String getDefaultURIFragment(EObject object) {
		return super.getURIFragment(object);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		EList<EObject> contents = getContents();
		for (int i = 0; i < contents.size(); i++) {
			EObject root = contents.get(i);

			EList<EObject> children = root.eContents();
			for (int j = 0; j < children.size(); j++) {
				EObject child = children.get(j);

				if (child instanceof NameSupport
						&& uriFragment.equals(((NameSupport) child).getName()))
					return child;
			}
		}

		return super.getEObject(uriFragment);
	}

	@Override
	protected void doUnload() {
		super.doUnload();

		getIntrinsicIDToEObjectMap().clear();
	}

	@Override
	protected void attachedHelper(EObject eObject) {
		if (eObject instanceof Widget) {
			Widget widget = (Widget) eObject;
			Long id = widget.getId();

			if (id == null && !isLoading() && isDirectWidget(widget))
				assignId(widget);
		}

		super.attachedHelper(eObject);
	}

	private void assignId(Widget widget) {
		widget.setId(generateNextId());
	}

	private Long generateNextId() {
		return Long.valueOf(++nextId);
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		assignMissingIds();
		super.doSave(outputStream, options);
	}

	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		super.doLoad(inputStream, options);
		computeMaxId();
	}

	private void computeMaxId() {
		for (TreeIterator<Widget> i = getAllDirectWidgets(); i.hasNext();) {
			Widget widget = i.next();
			Long id = widget.getId();
			if (id != null)
				nextId = Math.max(nextId, id.longValue());
		}
	}

	private WidgetTreeIterator getAllDirectWidgets() {
		EList<EObject> contents = getContents();
		return new WidgetTreeIterator(contents.isEmpty() ? null : contents
				.get(0), false);
	}

	private void assignMissingIds() {
		for (TreeIterator<Widget> i = getAllDirectWidgets(); i.hasNext();) {
			Widget widget = i.next();
			if (widget.getId() == null)
				assignId(widget);
		}
	}

	private boolean isDirectWidget(Widget widget) {
		EObject object = widget;

		while (object != null && !(object instanceof Screen)) {
			object = object.eContainer();
			if (object instanceof Master)
				return false;
		}

		return object instanceof Screen && getContents().contains(object);
	}
}
