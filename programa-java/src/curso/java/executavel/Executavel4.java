package curso.java.executavel;

import curso.java.classes.Aluno;
import curso.java.classes.Diretor;
import curso.java.classes.Pessoa;
import curso.java.classes.Secretario1;

public class Executavel4 {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setNomeEscola("JDEV - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("234234234");
		diretor.setNome("Egidio");
		diretor.setIdade(40);
		
		Secretario1 secretario = new Secretario1();
		secretario.setExperiencia("Adminstra��o");
		secretario.setNumeroCpf("222.222.222-22");
		secretario.setNome("Jo�o");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " +aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Sal�rio do Aluno �: " + aluno.salario());
		System.out.println("Sal�rio do Diretor �: " + diretor.salario());
		System.out.println("Sal�rio do Secret�rio �: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa Pessoa � Demais: " + pessoa.getNome() + " e o Sal�rio � de: " + pessoa.salario());
	}
	
	
	
	
}
