package br.com.log.dao;

import javax.inject.Inject;

import br.com.log.entidade.Pessoa;
import br.com.log.persistence.PersistenceUnit;

public class PessoaDAO {

	@Inject
	private PersistenceUnit dao;

	public Pessoa salvar(Pessoa pessoa) {
		return (Pessoa) this.dao.persist(pessoa);
	}

	public Pessoa update(Pessoa pessoa) {
		return (Pessoa) this.dao.merge(pessoa);
	}
	
	public Pessoa find(Long id) {
		return (Pessoa) this.dao.find(Pessoa.class, id);
	}
}
