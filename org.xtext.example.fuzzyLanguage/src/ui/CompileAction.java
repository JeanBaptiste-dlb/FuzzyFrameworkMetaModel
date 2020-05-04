package ui;

import java.awt.event.ActionEvent;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.internal.Model;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl.FuzzyLanguageStandaloneSetup;
import org.xtext.example.mydsl.fuzzyLanguage.FuzzyModel;
import org.xtext.example.mydsl.generator.FuzzyLanguageGenerator;

public class CompileAction extends AbstractAction {
	private AbstractView fenetre;
	private String resultat;
	public CompileAction(AbstractView fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
		this.resultat="";
		
	}
 
	public void actionPerformed(ActionEvent e) { 
		String texteUtilisateur = fenetre.getEditor().getText();
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("./");
		
		com.google.inject.Injector injector = new FuzzyLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.fuzz"));
		InputStream in = new ByteArrayInputStream(texteUtilisateur.getBytes());
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Resource resource = resourceSet.getResource(URI.createURI(f.toURI().toString()), true);
		FuzzyModel model = (FuzzyModel) resource.getContents().get(0);
		FuzzyLanguageGenerator flg = new FuzzyLanguageGenerator();
		resultat+= flg.compile(resource);
	}
	public String getResultat() {
		return this.resultat;
	}
	
}