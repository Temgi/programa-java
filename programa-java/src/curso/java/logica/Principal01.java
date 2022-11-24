package curso.java.logica;

public class Principal01 {
	public static void main(String[] args) {
		
		int mediaAluno = 50;
		String nome = "Fabio";
		
		if(mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parábens Você está Aprovado");
		}else if(mediaAluno < 70) {
			System.out.println("Você Está Reprovado");
		}else {
			System.out.println("Aluno Não Encontrado");
		}
	}
}
