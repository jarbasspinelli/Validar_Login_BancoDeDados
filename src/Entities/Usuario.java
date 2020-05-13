package Entities;

public class Usuario {
	
	private String Email;
	private int Senha;
	
	public Usuario() {
	}
	
	public Usuario(String Email, int Senha) {
		this.Email = Email;
		this.Senha = Senha;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getEmail() {
		return Email;
	}

	public int getSenha() {
		return Senha;
	}

	public void setSenha(int senha) {
		Senha = senha;
	}
	

}
