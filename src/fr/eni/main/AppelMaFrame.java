package fr.eni.main;

import javax.swing.SwingUtilities;

import fr.eni.ihm.MaPremiereFrame;

public class AppelMaFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		
			@Override
			public void run() {
				MaPremiereFrame mpf= new MaPremiereFrame();
				mpf.setVisible(true);//nécessaire pour que l'interface graphique soit visible!!!
			}
		
		});
	}
}