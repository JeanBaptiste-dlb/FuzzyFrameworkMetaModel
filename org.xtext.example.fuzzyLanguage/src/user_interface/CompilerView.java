package user_interface;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JTextArea;

import ui.AbstractDocument;
import ui.AbstractView;

public class CompilerView extends AbstractView {
	
	private String resultat;
	
	public CompilerView(AbstractDocument document) {
		super(document);
		this.resultat="";
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void onPaint(Graphics g) {
		if(!resultat.equals("")) {
			g.drawString(resultat, 80, 600);
		}
		if(super.getDl()) {
			g.drawString("Votre fichier a été chargé correctement !", 40, 550);
		}
		if(super.getCompile()) {
			g.drawString("Votre fichier a été compilé correctement !", 40, 550);
		}
	}
	
	public void setResultat(String s) {
		this.resultat = s;
	}
}