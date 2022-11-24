package curso.java.logica;

public class Principal03 {
	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 70) {
			System.out.println("Aluno Aprovado " + media);
		}else if(media >= 40 && media <= 69) {
			System.out.println("Aluno em Recuperação: " + media);
		}else {
			System.out.println("Aluno Reprovado: " + media);
		}
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Reprovado";
		
		System.out.println(saidaResultado);
	}
}
