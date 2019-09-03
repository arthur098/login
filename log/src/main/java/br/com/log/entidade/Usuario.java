package br.com.log.entidade;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@SequenceGenerator(name = "SEQUENCE_USUARIO", sequenceName = "usuario_id_user_seq", allocationSize = 1)
	@GeneratedValue(generator = "usuario_id_user_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_USER")
	private Long id;
	
	@Column(name = "USERNAME", length = 255, nullable = false)
	private String username;
	
	@Column(name = "PASSWORD", length = 255, nullable = false)
	private String password;
	
	@Column(name = "SALT_PASSWORD", length = 255, nullable = false)
	private String saltPassword;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSaltPassword() {
		return saltPassword;
	}

	public void setSaltPassword(String saltPassword) {
		this.saltPassword = saltPassword;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}
}
