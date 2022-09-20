package bibliotecadao;

import javax.persistence.EntityManager;

import biblioteca.jpa.util.Jpautil;
import biblioteca.user.Prestito;

public class PrestitoDao {
	public void inserisci(Prestito l) {
    	EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public void modificare(Prestito l) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(l);
		em.getTransaction().commit();
		em.close();
	}
	
	public void elimina (int l) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recupera(l));
		em.getTransaction().commit();
		em.close();
	}
	
	public Prestito recupera(int l) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		return em.find(Prestito.class, l);
		
		
	}
}
