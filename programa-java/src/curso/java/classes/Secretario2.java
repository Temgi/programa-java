package curso.java.classes;

import curso.java.interfaces.PermitirAcesso;

public class Secretario2 extends Pessoa implements PermitirAcesso{
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
