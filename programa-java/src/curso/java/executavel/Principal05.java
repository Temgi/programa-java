package curso.java.executavel;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;
import curso.java.classes.Disciplina2;

public class Principal05 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o Nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("Qual � a Idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual � a Data de Nascimento ?");
		String rg = JOptionPane.showInputDialog("Qual � a Registro Geral ?");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da M�e ?");
		String pai = JOptionPane.showInputDialog("Nome do Pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual � a Data de Matr�cula ?");
		String serie = JOptionPane.showInputDialog("Qual � a S�rie de Matr�cula ?");
		String escola = JOptionPane.showInputDialog("Nome da Escola ?");
		

		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		Disciplina2 disciplina1= new Disciplina2();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina2 disciplina2= new Disciplina2();
		disciplina2.setDisciplina("Matem�tica");
		disciplina2.setNota(80);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina2 disciplina3= new Disciplina2();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina2 disciplina4= new Disciplina2();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		aluno1.getDisciplinas().add(disciplina4);
		
		
		
		System.out.println(aluno1);
		System.out.println("M�dia da Nota �: " + aluno1.getMediaNotas());
		System.out.println("Resultado : " + aluno1.getAlunoAprovado2());
	}
}
