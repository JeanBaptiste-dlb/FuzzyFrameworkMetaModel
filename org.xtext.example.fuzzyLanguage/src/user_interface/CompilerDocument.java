package user_interface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JFileChooser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.FuzzyLanguageStandaloneSetup;
import org.xtext.example.mydsl.fuzzyLanguage.FuzzyModel;
import org.xtext.example.mydsl.generator.FuzzyLanguageGenerator;

import ui.AbstractDocument;

public class CompilerDocument extends AbstractDocument {
	
	String resultat;
	
	public CompilerDocument() {
		super();
		this.resultat="";
	}

	@Override
	public void onOpenDocument() {
		int state = getView().getJFileChooser().showOpenDialog(getView());
		if (state == JFileChooser.APPROVE_OPTION) {
			File f = getView().getJFileChooser().getSelectedFile();
			String filename = f.getPath();
			setFilename (filename);
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("./");
			com.google.inject.Injector injector = new FuzzyLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
			XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			Resource resource = resourceSet.getResource(URI.createURI(f.toURI().toString()), true);
			FuzzyModel model = (FuzzyModel) resource.getContents().get(0);
			FuzzyLanguageGenerator flg = new FuzzyLanguageGenerator();
			resultat+= flg.compile(resource);
		}
		super.onOpenDocument();
	}
	
	public String getResultat() {
		return this.resultat;
	}	
}

