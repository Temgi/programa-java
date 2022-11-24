package curso.java.logica;

import javax.swing.JOptionPane;

public class Principal13 {
	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a Nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a Nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a Nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a Nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "O Aluno Está Aprovado com Média de: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "O Aluno Está em Recuperação com Média de: " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "O Aluno Está Reprovado com Média de: " + media);
		}

	}
}
