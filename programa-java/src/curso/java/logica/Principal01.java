package curso.java.logica;

public class Principal01 {
	public static void main(String[] args) {
		
		int mediaAluno = 50;
		String nome = "Fabio";
		
		if(mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Par�bens Voc� est� Aprovado");
		}else if(mediaAluno < 70) {
			System.out.println("Voc� Est� Reprovado");
		}else {
			System.out.println("Aluno N�o Encontrado");
		}
	}
}
