package curso.java.logica;

public class Principal07 {
	public static void main(String[] args) {
		
		int numero1 = 0;
		
		while(numero1 <= 5) {
			System.out.println("O Número Atual é: " + numero1);
			numero1++;
		}
		
		System.out.println("####################################");
		
		int numero2 = 0;
		do {
			System.out.println("O Número Atual é: " + numero2);
			numero2++;
		}while(numero2 <= 5);
	}
}
