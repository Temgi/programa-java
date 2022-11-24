package curso.java.logica;

public class Principal09 {
	public static void main(String[] args) {
		
		for(int numero=0; numero <= 10; numero++) {
			System.out.println("O Número Atual é: " + numero);
			if(numero == 8) {
				System.out.println("Encontrado o Número: " + numero);
				System.out.println("Estou Parando de Executar...");
				break;
			}
		}
		System.out.println("###############################");
		
		for(int numero=0; numero <= 10; numero++) {
			System.out.println("O Número Atual é: " + numero);
			if(numero == 8) {
				System.out.println("Encontrado o Número: " + numero);
				continue;
			}
		}
	}
}
