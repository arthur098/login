package br.com.log.dao;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.log.entidade.Usuario;
import br.com.log.persistence.PersistenceUnit;

public class UsuarioDAO {

	@Inject
	private PersistenceUnit dao;

	public Usuario autentica(String usuario, String password) {
		StringBuilder hql = new StringBuilder();

		hql.append("FROM Usuario u ");
		hql.append("WHERE u.username = :usuario ");
		hql.append("AND u.password = :senha");

		Query typedQuery = this.dao.createTypedQuery(hql.toString(), Usuario.class);
		typedQuery.setParameter("usuario", usuario);
		typedQuery.setParameter("senha", password);

		try {
			return (Usuario) typedQuery.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	public Usuario salvar(Usuario usuario) {
		return (Usuario) this.dao.persist(usuario);
	}

	public Usuario update(Usuario usuario) {
		return (Usuario) this.dao.merge(usuario);
	}

	public Usuario registrar(Usuario usuario) {
		return (Usuario) this.dao.persist(usuario);
	}

	public Usuario getUsuarioByUsername(String usuario) {
		StringBuilder hql = new StringBuilder();

		hql.append("FROM Usuario u ");
		hql.append("WHERE lower(u.username) = lower(:usuario)");

		Query typedQuery = this.dao.createTypedQuery(hql.toString(), Usuario.class);
		typedQuery.setParameter("usuario", usuario);
		try {
			return (Usuario) typedQuery.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
