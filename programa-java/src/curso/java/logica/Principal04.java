package curso.java.logica;

public class Principal04 {
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 85;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 50){
			if(media >= 70) {
				if(media > 90) {
					System.out.println("Aluno Está Aprovado Direto - Parábens " + media);
				}else {
					System.out.println("Aluno Está Aprovado Direto " + media);
				}
			}else {
					System.out.println("Aluno Está em Recuperação " + media);
			}
		}else {
			System.out.println("Aluno Reprovado Direto " + media);
		}
	}
}
