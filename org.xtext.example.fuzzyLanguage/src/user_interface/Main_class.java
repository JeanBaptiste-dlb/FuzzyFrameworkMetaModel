package user_interface;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.mwe.internal.core.ast.util.Injector;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.FuzzyLanguageStandaloneSetup;
import org.xtext.example.mydsl.fuzzyLanguage.FuzzyModel;
import org.xtext.example.mydsl.generator.FuzzyLanguageGenerator;

public class Main_class {
	public static void main(String[] args){
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		com.google.inject.Injector injector = new FuzzyLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(
	    URI.createURI("platform:/resource/org.xtext.example.fuzzyLanguage/src/example.fuzz"), true);
		FuzzyModel model = (FuzzyModel) resource.getContents().get(0);
		FuzzyLanguageGenerator flg = new FuzzyLanguageGenerator();
		System.out.println(flg.compile(resource));
	}


}