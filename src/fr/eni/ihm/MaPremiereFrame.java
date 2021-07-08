package fr.eni.ihm;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MaPremiereFrame extends JFrame {

	private JPanel panel;
	private JLabel label;
	private JButton button;
	private JTextField textfield;
	
	public MaPremiereFrame() {
		super("Ma première Frame");
		//Création d'un rectangle pour la forme de la fenêtre ouverte
	//	this.setBounds(100, 200, 800, 600);
		
		gestionComposants();//On initialise les différents paramètres
		
		this.setSize(800,600);//Autre maniere de faire une fenêtre rectangulaire en interface graphique
		this.setLocationRelativeTo(null);//position la fenêtre dans l'écran mettre null la positionne au centre
		this.setResizable(false);//Interdire le redimensionnement de la fenêtre par l'utilisateur
		
		
		//this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//On supprime l'instance de la fenêtre 
	}

	private void gestionComposants() {
		//Création des différents éléments dont le panneau dans lequel tout les autres éléments seront intégré
		panel = new JPanel();
		button = new JButton("Go !");
		label = new JLabel("Hello EveryBody");
		textfield = new JTextField(10);//Champ de saisie avec longueur de 10
		
		//ajou des différents éléments au panneau
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		
		this.getContentPane().add(panel);//Renvoyer le panneau courant pour ensuite rajouter dessus le panneau créé
	}
}
