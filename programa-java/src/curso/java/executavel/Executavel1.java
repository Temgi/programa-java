package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Diretor;
import curso.java.classes.Secretario1;

public class Executavel1 {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setNomeEscola("JDEV - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("234234234");
		diretor.setNome("Egidio");
		
		Secretario1 secretario = new Secretario1();
		secretario.setExperiencia("Adminstração");
		secretario.setNumeroCpf("222.222.222-22");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}
}
