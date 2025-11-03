package poketeam.test;

import poketeam.model.Joueur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import poketeam.context.Singleton;

public class testDB {

	public static void main(String[] args) {
		
		//System.out.println(Singleton.getInstance().getDaoPokemon().findById(2));
		
		Joueur joueur1 = new Joueur("salomall");
		Joueur joueur2 = new Joueur("martinouch");
		Joueur joueur3 = new Joueur("aly_baba");
		Joueur joueur4 = new Joueur("matteWoW");
		Joueur joueur5 = new Joueur("1000_ian");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("configJPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); 
		
		em.persist(joueur1);
		em.persist(joueur2);
		em.persist(joueur3);
		em.persist(joueur4);
		em.persist(joueur5);
		System.out.println(Singleton.getInstance().getDaoPokemon().findById(150));


	}
}
