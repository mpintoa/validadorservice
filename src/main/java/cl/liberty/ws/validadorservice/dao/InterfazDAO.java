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

		// Check database version
		// String sql = "FROM INTERFAZ";

		// EntityManager entityManager =
		// JPAUtil.getEntityManagerFactory().createEntityManager();

		/*
		 * List<Interfaz> retorno = entityManager.createNativeQuery(
		 * "SELECT * FROM INTERFAZ", Interfaz.class ) .getResultList();
		 * 
		 * //List<Interfaz> retorno = (List<Interfaz>)
		 * entityManager.createQuery(sql).getResultList();
		 * 
		 * for(Interfaz obj: retorno) { System.out.println("MPI->"+obj.toString()); }
		 * System.out.println("MPI->"+retorno);
		 * 
		 * entityManager.getTransaction().commit(); entityManager.close();
		 * 
		 * return retorno;
		 */
		CriteriaQuery<Interfaz> criteriaQuery = em.getCriteriaBuilder().createQuery(Interfaz.class);
		@SuppressWarnings("unused")
		Root<Interfaz> root = criteriaQuery.from(Interfaz.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

}
