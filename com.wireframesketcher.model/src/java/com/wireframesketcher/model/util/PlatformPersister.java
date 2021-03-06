package com.wireframesketcher.model.util;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Extends the persister with method that handle workspace resources
 */
public class PlatformPersister extends Persister {
	public EObject load(IFile file) {
		URI uri = createFileURI(file);
		return (EObject) getResourceSet().getResource(uri, true).getContents()
				.get(0);
	}

	public void saveAs(EObject o, IFile file) throws IOException {
		URI uri = createFileURI(file);
		if (o.eResource() != null) {
			o.eResource().setURI(uri);
		} else {
			Resource resource = getResourceSet().createResource(
					createFileURI(file));
			resource.getContents().add(o);
		}
		save(o);
	}

	private static URI createFileURI(IFile file) {
		return URI.createPlatformResourceURI(file.getFullPath().toString(),
				true);
	}
}
