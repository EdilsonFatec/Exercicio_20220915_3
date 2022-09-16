package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) throws Exception {
		int valor = 0;
		
		FatController fat = new FatController();
		
		do {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe valor"));
		} while (valor < 0 || valor > 20);
		
		System.out.println("O fatorial de "+valor+" = "+fat.fatorial(valor));
	}

}
