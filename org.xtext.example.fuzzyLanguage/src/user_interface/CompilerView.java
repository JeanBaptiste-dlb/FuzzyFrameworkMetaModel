package user_interface;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import ui.AbstractDocument;
import ui.AbstractView;

public class CompilerView extends AbstractView {
	
	public CompilerView(AbstractDocument document) {
		super(document);
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void onPaint(Graphics g) {
		if (!((CompilerDocument) getDocument()).getResultat().equals("")) {
			File ff=new File(getNameFile()+".cpp");
			try {
				ff.createNewFile();
				FileWriter ffw=new FileWriter(ff);
				ffw.write(((CompilerDocument) getDocument()).getResultat());
				ffw.write("\n");
				ffw.close();
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
						g.drawString(output.toString(), 130, 100);
					} else {
						//abnormal...
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
}