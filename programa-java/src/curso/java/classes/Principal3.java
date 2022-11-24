package curso.java.classes;

import javax.swing.JOptionPane;

public class Principal3 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o Nome do Aluno ?");
		String idade = JOptionPane.showInputDialog("Qual é a Idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual é a Data de Nascimento ?");
		String rg = JOptionPane.showInputDialog("Qual é a Registro Geral ?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF ?");
		String mae = JOptionPane.showInputDialog("Nome da Mãe ?");
		String pai = JOptionPane.showInputDialog("Nome do Pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual é a Data de Matrícula ?");
		String serie = JOptionPane.showInputDialog("Qual é a Série de Matrícula ?");
		String escola = JOptionPane.showInputDialog("Nome da Escola ?");
		
		String nota1 = JOptionPane.showInputDialog("Digite a Nota 1");
		String nota2 = JOptionPane.showInputDialog("Digite a Nota 2");
		String nota3 = JOptionPane.showInputDialog("Digite a Nota 3");
		String nota4 = JOptionPane.showInputDialog("Digite a Nota 4");
		
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
		
		aluno1.getDisciplina().setNota1(Double.valueOf(nota1));
		aluno1.getDisciplina().setNota2(Double.valueOf(nota2));
		aluno1.getDisciplina().setNota3(Double.valueOf(nota3));
		aluno1.getDisciplina().setNota4(Double.valueOf(nota4));
		
		System.out.println(aluno1.toString());
		System.out.println("Média da Nota é: " + aluno1.getMediaNotas());
		System.out.println("Resultado : " + aluno1.getAlunoAprovado2());
	}
}
