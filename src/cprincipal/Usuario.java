package cprincipal;

import java.util.Date;

public class Usuario {
	private int id = 000;
	private String nomeCompleto;
	private String dataDeNascimento;
	private String senha;
	private String email;
	private boolean ativo;
	private String perfil;

	public Usuario(int id, String nomeCompleto) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.dataDeNascimento = dataDeNascimento;
		this.senha = senha;
		this.email = email;
		this.ativo = ativo;
		this.perfil = perfil;

	}

	public int getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public String getPerfil() {
		return perfil;
	}

}
