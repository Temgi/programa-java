package curso.java.classes;

public class Principal4 {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Temgi");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Temgi");
		aluno2.setNumeroCpf("123");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos São Iguais");
		}else {
			System.out.println("Alunos Não São Iguais");			
		}
	}
}
