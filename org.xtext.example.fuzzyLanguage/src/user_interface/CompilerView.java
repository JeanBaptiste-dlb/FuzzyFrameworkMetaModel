package user_interface;

import java.awt.Graphics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
			File ff=new File(getNameFile()+".fuzz");
			try {
				ff.createNewFile();
				FileWriter ffw=new FileWriter(ff);
				ffw.write(((CompilerDocument) getDocument()).getResultat());
				ffw.write("\n");
				ffw.close();
				g.drawString("Votre fichier a été généré", 130, 100);
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}
}