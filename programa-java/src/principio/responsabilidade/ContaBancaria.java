package principio.responsabilidade;

public class ContaBancaria {
	
	private String descricao;
	private double saldo = 8000.00;
	
	public void soma100Reais() {
		this.saldo += 100;
	}
	
	public void diminui100Reais() {
		this.saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		this.saldo -= saque;
	}
	
	public void depositaDinheiro(double deposito) {
		this.saldo += deposito;
	}

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
}
