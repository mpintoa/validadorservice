package cl.liberty.ws.validadorservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.liberty.ws.validadorservice.dao.hibernate.JPAUtil;
import cl.liberty.ws.validadorservice.entity.Interfaz;

@Transactional
@Repository
public class InterfazDAO implements IInterfazDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Interfaz> getAllArticles() {
		
	    // Check database version
	    String sql = "FROM INTERFAZ";

	    List<Interfaz> retorno = (List<Interfaz>) entityManager.createQuery(sql).getResultList();
	    
	    for(Interfaz obj: retorno) {
	    	System.out.println("MPI->"+obj.toString());
	    }
	    System.out.println("MPI->"+retorno);

	    entityManager.getTransaction().commit();
	    entityManager.close();
	    
	    return retorno;
	}

}
