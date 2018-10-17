package cl.liberty.ws.validadorservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import cl.liberty.ws.validadorservice.entity.Interfaz;

@Repository
public class InterfazDAO implements IInterfazDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Interfaz> getAllArticles() {

		
		CriteriaQuery<Interfaz> criteriaQuery = em.getCriteriaBuilder().createQuery(Interfaz.class);
		@SuppressWarnings("unused")
		Root<Interfaz> root = criteriaQuery.from(Interfaz.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

}
