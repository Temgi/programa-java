package curso.java.excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.auxiliares.FuncaoAutenticacao;
import curso.java.classes.Aluno;
import curso.java.classes.Diretor;
import curso.java.classes.Disciplina2;
import curso.java.constantes.StatusAluno;

public class Principal11 {

	public static void main(String[] args) {

		try {
			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o Login");
			String senha = JOptionPane.showInputDialog("Informe a Senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();
				//List<Aluno> alunos = null;

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o Nome do Aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual é a Idade ?");
					// String dataNascimento = JOptionPane.showInputDialog("Qual é a Data de
					// Nascimento ?");
					// String rg = JOptionPane.showInputDialog("Qual é a Registro Geral ?");
					// String cpf = JOptionPane.showInputDialog("Qual é o CPF ?");
					// String mae = JOptionPane.showInputDialog("Nome da Mãe ?");
					// String pai = JOptionPane.showInputDialog("Nome do Pai ?");
					// String dataMatricula = JOptionPane.showInputDialog("Qual é a Data de
					// Matrícula ?");
					// String serie = JOptionPane.showInputDialog("Qual é a Série de Matrícula ?");
					// String escola = JOptionPane.showInputDialog("Nome da Escola ?");

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					// aluno1.setDataNascimento(dataNascimento);
					// aluno1.setRegistroGeral(rg);
					// aluno1.setNumeroCpf(cpf);
					// aluno1.setNomeMae(mae);
					// aluno1.setNomePai(pai);
					// aluno1.setDataMatricula(dataMatricula);
					// aluno1.setSerieMatriculado(serie);
					// aluno1.setNomeEscola(escola);

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

						Disciplina2 disciplina = new Disciplina2();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover Alguma Disciplina ?");

					if (escolha == 0) {
						int continuarRemover = 0;
						int posicao = 1;
						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3, 4 ?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover ?");
						}
					}
					System.out.println("Aqui o Erro");
					alunos.add(aluno1);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				System.out.println("--------------------Lista dos Aprovados--------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + ", Resultado: " + aluno.getAlunoAprovado2()
							+ " com Média de: " + aluno.getMediaNotas());
				}
				System.out.println("--------------------Lista dos Recuperação--------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno: " + aluno.getNome() + ", Resultado: " + aluno.getAlunoAprovado2()
							+ " com Média de: " + aluno.getMediaNotas());
				}
				System.out.println("--------------------Lista dos Reprovados--------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + ", Resultado: " + aluno.getAlunoAprovado2()
							+ " com Média de: " + aluno.getMediaNotas());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso Não Permitido");
			}

		} catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace();
			
			System.out.println("Mensagem: " + e.getMessage());
			
			for(int i=0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de Erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de Erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de Erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class: " + e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de Conversão de Número " + saida.toString());
		
		}finally {
			JOptionPane.showMessageDialog(null, "Obrigado por Aprender Java Comigo");			
		}
	}
	
	public static void lerArquivo() throws FileNotFoundException {
			File file = new File("Arquivo.txt");
			Scanner sc = new Scanner(file);
			sc.close();				

	}
}
