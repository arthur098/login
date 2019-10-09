package br.com.log.bean;

public class UserBean {

	private String nome;
	private String sobrenome;
	private String token;
	
	public UserBean(String nome, String sobrenome, String token) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.token = "Bearer " + token;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
