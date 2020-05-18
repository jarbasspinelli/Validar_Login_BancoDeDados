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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + Senha;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (Senha != other.Senha)
			return false;
		return true;
	}
}
