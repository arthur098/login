package br.com.log.persistence;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class PersistenceUnit {

	@PersistenceContext(name = "login-teste")
	private EntityManager em;
	
	@Transactional
	public Object persist(Object entity) {
		this.em.persist(entity);
		return entity;
	}
	
	@Transactional
	public Object merge(Object entity) {
		this.em.merge(entity);
		return entity;
	}
	
	@Transactional
	public Object delete (Object entity) {
		this.em.remove(entity);
		return entity;
	}
	
	public Object find(Class<?> classe, Long id) {
		return this.em.find(classe, id);
	}
	
	public Query createTypedQuery(String query, Class<?> classe) {
		return this.em.createQuery(query, classe);
	}
	
	public Query createNativeQuery(String query) {
		return this.em.createNativeQuery(query);
	}
}
