package ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class AbstractView extends javax.swing.JFrame {
	/**
	 * 
	 */
	private AbstractDocument document;
	private static final long serialVersionUID = 1L;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenuItem jMenuItem1 = null;
	private JMenuItem jMenuItem4 = null;
	private JMenu jMenu2 = null;
	private JMenuItem jMenuItem9 = null;
	private JPanel jPanel = null;
	private javax.swing.JFileChooser jFileChooser = null;  //  @jve:decl-index=0:visual-constraint="11,367"
	private JTextField textField;
	private JLabel label;
	private String nameFile;
	private JTextArea editor = null;


	public AbstractView(AbstractDocument document) {
		super();
		this.document = document;
		this.nameFile="resultat";
		initialize();
		getDocument().onNewDocument();
	}

	/**
	 * Initialize the class.
	 */
	private void initialize() {

		this.setName("JFrame1");
		this.setPreferredSize(new Dimension(640, 400));
		this.setContentPane(getJPanel());
		this.setJMenuBar(getJJMenuBar());
		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.setBounds(45, 25, 400, 200);
		this.setTitle("Fuzzy Compiler");
	}
	
	public String getNameFile() {
		return this.nameFile;
	}
	
	public void setNameFile(String s) {
		this.nameFile = s;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu2());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Fichier");
			jMenu.setMnemonic(KeyEvent.VK_UNDEFINED);
			jMenu.add(getJMenuItem1());
			jMenu.addSeparator();
			jMenu.add(getJMenuItem4());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenuItem1	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Ouvrir");
			jMenuItem1.setMnemonic(KeyEvent.VK_O);
			jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					getDocument().onOpenDocument ();
				}
			});
		}
		return jMenuItem1;
	}

	/**
	 * This method initializes jMenuItem4	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem4() {
		if (jMenuItem4 == null) {
			jMenuItem4 = new JMenuItem();
			jMenuItem4.setText("Quitter");
			jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return jMenuItem4;
	}


	/**
	 * This method initializes jMenu2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Aide");
			jMenu2.add(getJMenuItem9());
		}
		return jMenu2;
	}

	/**
	 * This method initializes jMenuItem9	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem9() {
		if (jMenuItem9 == null) {
			jMenuItem9 = new JMenuItem();
			jMenuItem9.setText("A propos de Fuzzy Compiler ...");
		}
		return jMenuItem9;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel() { private static final long serialVersionUID = 1L;
				public void paintComponent (Graphics g) { onPaint (g); }
			};
			jPanel.setLayout(new FlowLayout());
			jPanel.setPreferredSize(new Dimension(600, 400));
			JLabel label = new JLabel("Nom de votre fichier de destination :");
			jPanel.add(label);
			this.textField = new JTextField("resultat", 10);
			this.editor= new JTextArea(30,20);
			jPanel.add(textField);
			JButton bouton = new JButton(new GetAction(this, "Envoyer"));
			jPanel.add(bouton);
			jPanel.add(editor);
			jPanel.add(new JButton(new CompileAction(this, "Compiler")));
		}
		return jPanel;
	}

	/**
	 * This method initializes jFileChooser
	 * 
	 * @return javax.swing.JFileChooser
	 */
	public javax.swing.JFileChooser getJFileChooser() {
		if (jFileChooser == null) {
			jFileChooser = new javax.swing.JFileChooser();
			jFileChooser.setMultiSelectionEnabled(false);
		}
		return jFileChooser;
	}

	protected AbstractDocument getDocument() {
		return document;
	}

	protected abstract void onPaint (Graphics g);

	public JTextField getTextField(){
		return textField;
	}
	public JTextArea getEditor() {
		return editor;
	}
 
	public JLabel getLabel(){
		return label;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
