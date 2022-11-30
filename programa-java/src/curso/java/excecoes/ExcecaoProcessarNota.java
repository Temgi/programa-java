package curso.java.excecoes;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Ocorreu um Erro no Processamneto do Arquivo de Notas " + erro);
	}
}
