package br.com.log.entidade;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.log.enums.SexoEnum;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@Column(name = "ID_PESSOA", nullable = false)
	@SequenceGenerator(name = "PESSOA_GENERATOR", sequenceName = "pessoa_id_pessoa_seq")
	@GeneratedValue(generator = "PESSOA_GENERATOR", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "NOME", nullable = false, length = 255)
	private String nome;
	
	@Column(name = "SOBRENOME", nullable = false, length = 255)
	private String sobrenome;
	
	@Column(name = "CPF_CNPJ", nullable = false, length = 14)
	private String cpfCnpj;
	
	@Enumerated
	@Column(name = "SEXO", nullable = false, length = 1)
	private SexoEnum sexo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
