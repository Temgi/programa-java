package curso.java.classes;

public class Principal {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Jo�o da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("33.333.333-5");
		aluno1.setNumeroCpf("222.222.222-22");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola JDev Treinamento");
		
		aluno1.getDisciplina().setNota1(90);
		aluno1.getDisciplina().setNota2(80.8);
		aluno1.getDisciplina().setNota3(70.9);
		aluno1.getDisciplina().setNota4(90.7);
		
		System.out.println("Nome � = " + aluno1.getNome());
		System.out.println("Idade �: " + aluno1.getIdade());
		System.out.println("Nascimento: " + aluno1.getDataNascimento());
		System.out.println("M�dia da Nota �: " + aluno1.getMediaNotas());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2: " + aluno1.getAlunoAprovado2());
		
		System.out.println("-------------------------------------------");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/10/1970");
		
		System.out.println("Aluno 2 Nome � = " + aluno2.getNome());
		System.out.println("Aluno 2 Idade �: " + aluno2.getIdade());
		System.out.println("Aluno 2 Nascimento: " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("Jose", 50);
		
		
	}
}
