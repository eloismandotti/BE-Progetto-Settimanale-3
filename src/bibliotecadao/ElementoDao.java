package bibliotecadao;

import javax.persistence.EntityManager;

import biblioteca.ElementoBiblioteca;
import biblioteca.jpa.util.Jpautil;


public class ElementoDao {

	public void inserisci(ElementoBiblioteca e) {
    	EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public void modificare(ElementoBiblioteca e) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public void elimina (int e) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recupera(e));
		em.getTransaction().commit();
		em.close();
	}
	
	public ElementoBiblioteca recupera(int e) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		return em.find(ElementoBiblioteca.class, e);
		
		
	}
	
	
	
}
