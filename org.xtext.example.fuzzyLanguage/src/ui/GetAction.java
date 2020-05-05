package ui;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.AbstractAction;

import user_interface.CompilerView;

public class GetAction extends AbstractAction {
	private AbstractView fenetre;
 
	public GetAction(AbstractView fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
	}
 
	public void actionPerformed(ActionEvent e) { 
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
				((CompilerView)this.fenetre).setResultat(output.toString());
				this.fenetre.repaint();
			} else {
				//abnormal...
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}