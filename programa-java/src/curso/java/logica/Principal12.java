package curso.java.logica;

import javax.swing.JOptionPane;

public class Principal12 {
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a Quantidade de Carros ?");
		String pessoas = JOptionPane.showInputDialog("Informe a Quantidade de Pessoas ?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Desejar Ver o Resultado da Divis�o ?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divis�o Para Pessoas Foi: " + divisao);
		}else {
			System.out.println("N�o Quis Ver o Resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Desejar Ver o Resto da Divis�o ?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O Resto da Divis�o �:  " + resto);
		}else {
			System.out.println("N�o Quis Ver o Resto");			
		}
	}
}
