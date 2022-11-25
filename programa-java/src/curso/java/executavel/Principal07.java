package curso.java.executavel;

import javax.swing.JOptionPane;

import curso.java.classes.Aluno;
import curso.java.classes.Disciplina2;

public class Principal07 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o Nome do Aluno ?");
//		String idade = JOptionPane.showInputDialog("Qual é a Idade ?");
//		String dataNascimento = JOptionPane.showInputDialog("Qual é a Data de Nascimento ?");
//		String rg = JOptionPane.showInputDialog("Qual é a Registro Geral ?");
//		String cpf = JOptionPane.showInputDialog("Qual é o CPF ?");
//		String mae = JOptionPane.showInputDialog("Nome da Mãe ?");
//		String pai = JOptionPane.showInputDialog("Nome do Pai ?");
//		String dataMatricula = JOptionPane.showInputDialog("Qual é a Data de Matrícula ?");
//		String serie = JOptionPane.showInputDialog("Qual é a Série de Matrícula ?");
//		String escola = JOptionPane.showInputDialog("Nome da Escola ?");
		

		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
//		aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNascimento(dataNascimento);
//		aluno1.setRegistroGeral(rg);
//		aluno1.setNumeroCpf(cpf);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setDataMatricula(dataMatricula);
//		aluno1.setSerieMatriculado(serie);
//		aluno1.setNomeEscola(escola);
		
		for(int pos=1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " +pos+ "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " +pos+ "?");
			
			Disciplina2 disciplina = new Disciplina2();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover Alguma Disciplina ?");
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3, 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		
		System.out.println(aluno1);
		System.out.println("Média da Nota é: " + aluno1.getMediaNotas());
		System.out.println("Resultado : " + aluno1.getAlunoAprovado2());
	}
}
