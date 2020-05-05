package user_interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("bash", "-c", "./script.sh");
			try {
				Process process = processBuilder.start();
				StringBuilder output = new StringBuilder();
				
				BufferedReader reader = new BufferedReader(
				new InputStreamReader(process.getInputStream()));
				
				String line;
				while ((line = reader.readLine()) != null) {
					output.append(line + "\n");
				}

				int exitVal = process.waitFor();
				if (exitVal == 0) {
					System.out.println("Success!");
					System.out.println(output);
					((CompilerView)super.getView()).setResultat(output.toString());
					super.getView().repaint();
				} else {
					//abnormal...
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		super.onOpenDocument();
	}
	
	public String getResultat() {
		return this.resultat;
	}	
}

