package principio.responsabilidade;

public class TesteConta {
	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta Bancaria do Rui");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400.0);
		System.out.println(bancaria);
		
		bancaria.depositaDinheiro(1000.0);
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		System.out.println(bancaria);
		
		
	}
}
