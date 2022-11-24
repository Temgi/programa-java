package curso.java.tipovariaveis;

public class Principal02 {
	
	public static int maiorIdadeGlobal = 30;
	
	public static void main(String[] args) {
		
		int maiorIdade = 18;
		System.out.println("Valor da Variável Local: " + maiorIdade);
		System.out.println("Valor da Variável Local Global: " + maiorIdadeGlobal);
		metodo2();
	}
	
	public static void metodo2() {
		int mediaAno = 50;
		System.out.println("Valor da Variável Global: " + maiorIdadeGlobal);
	}
}
