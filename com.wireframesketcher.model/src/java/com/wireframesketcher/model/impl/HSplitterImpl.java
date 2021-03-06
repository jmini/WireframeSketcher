/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.wireframesketcher.model.impl;

import org.eclipse.emf.ecore.EClass;

import com.wireframesketcher.model.HSplitter;
import com.wireframesketcher.model.ModelPackage;
import com.wireframesketcher.model.ResizeMode;
import com.wireframesketcher.model.WidgetDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSplitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HSplitterImpl extends WidgetImpl implements HSplitter {
	private static final WidgetDescriptor DESCRIPTOR = describe("Horizontal Splitter", ResizeMode.HORIZONTAL_LITERAL, false, false);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected HSplitterImpl() {
		super();
		descriptor = DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.HSPLITTER;
	}

} //HSplitterImpl
