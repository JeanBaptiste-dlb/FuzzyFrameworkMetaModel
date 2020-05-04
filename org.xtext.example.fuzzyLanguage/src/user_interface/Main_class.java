package user_interface;

import org.apache.log4j.chainsaw.Main;

import ui.AbstractDocument;
import ui.AbstractView;

public class Main_class {
	private AbstractView view;
	private AbstractDocument document;
	
	public Main_class() {
		document = new CompilerDocument ();
		view = new CompilerView (document);
		document.setView(view);
	}
	
	public static void main (String argv []) {
		Main_class app = new Main_class();
	    app.show();
	}

    public void show () {
    	view.setVisible(true);
    }
}