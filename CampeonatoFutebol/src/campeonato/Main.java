package campeonato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	 
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD2");
        EntityManager em = emf.createEntityManager();
 
        try {
            em.getTransaction().begin();
             
            
             
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        finally{
            emf.close();
        }
         
    }
}