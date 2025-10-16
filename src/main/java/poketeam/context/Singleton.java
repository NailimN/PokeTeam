package poketeam.context;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import poketeam.dao.DAOPokemon;
import poketeam.dao.IDAOPokemon;

public class Singleton {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("configJPA");
	private static Singleton instance=null;
	
	private IDAOPokemon daoPokemon = new DAOPokemon();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance==null) {instance = new Singleton();}
		return instance;
	}


	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDAOPokemon getDaoPokemon() {
		return daoPokemon;
	}

}
