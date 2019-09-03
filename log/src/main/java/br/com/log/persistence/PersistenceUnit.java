package br.com.log.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class PersistenceUnit {

	private EntityManagerFactory emf;
	private EntityManager em;

	public PersistenceUnit() {
		emf = Persistence.createEntityManagerFactory("login-teste");
		em = emf.createEntityManager();
	}

	public Object persist(Object entity) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(entity);
			this.em.getTransaction().commit();
		} catch (PersistenceException e) {
			this.em.getTransaction().rollback();
		} finally {
			this.em.close();
		}
		return entity;
	}

	public Object merge(Object entity) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(entity);
			this.em.getTransaction().commit();
		} catch (PersistenceException e) {
			this.em.getTransaction().rollback();
		} finally {
			this.em.close();
		}
		return entity;
	}

	public Object delete(Object entity) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(entity);
			this.em.getTransaction().commit();
		} catch (PersistenceException e) {
			this.em.getTransaction().rollback();
		} finally {
			this.em.close();
		}
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
