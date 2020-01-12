package br.com.log.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {

	@Id
	private Long id;
	
	private String nome;
	
	private String descricao;
	
	private String descricaoComp;
	
	private Double preco;
	
	private Date lancamento;
	
	private Produtora produtora;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricaoComp() {
		return descricaoComp;
	}

	public void setDescricaoComp(String descricaoComp) {
		this.descricaoComp = descricaoComp;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getLancamento() {
		return lancamento;
	}

	public void setLancamento(Date lancamento) {
		this.lancamento = lancamento;
	}

	public Produtora getProdutora() {
		return produtora;
	}

	public void setProdutora(Produtora produtora) {
		this.produtora = produtora;
	}
}
