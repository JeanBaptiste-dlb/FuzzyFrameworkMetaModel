package ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class GetAction extends AbstractAction {
	private AbstractView fenetre;
 
	public GetAction(AbstractView fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
	}
 
	public void actionPerformed(ActionEvent e) { 
		String texteUtilisateur = fenetre.getTextField().getText();
		fenetre.setNameFile(texteUtilisateur);
	}
}