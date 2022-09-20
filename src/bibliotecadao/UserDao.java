package bibliotecadao;

import javax.persistence.EntityManager;

import biblioteca.jpa.util.Jpautil;
import biblioteca.user.User;


public class UserDao {
	
    public void inserisci(User u) {
    	EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}
	
	public void modificare(User u) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		em.close();
	}
	
	public void elimina (int u) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recupera(u));
		em.getTransaction().commit();
		em.close();
	}
	
	public User recupera(int u) {
		EntityManager em = Jpautil.getEntityManagerFactory().createEntityManager();
		return em.find(User.class, u);
		
		
	}

}
