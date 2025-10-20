package poketeam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import poketeam.context.Singleton;
import poketeam.model.Pokemon;

public class DAOPokemon implements IDAOPokemon{
	
	@Override
    public List<Pokemon> findAll() {
        EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
        List<Pokemon> pokemons = em.createQuery("from Pokemon", Pokemon.class).getResultList();
        em.close();
        return pokemons;
    }
	
	@Override
    public Pokemon findById(Integer id) {
        EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
        Pokemon pokemon = em.find(Pokemon.class, id);
        em.close();
        return pokemon;
    }

    

    @Override
    public Pokemon save(Pokemon pokemon) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		pokemon = em.merge(pokemon);
		em.getTransaction().commit();
		em.close();
		return pokemon;
	}

    @Override
	public void deleteById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		Pokemon pokemon = em.find(Pokemon.class, id);
		em.remove(pokemon);
		em.getTransaction().commit();
		em.close();
	
	}

    @Override
    public void delete(Pokemon pokemon) {
    	EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
		pokemon = em.merge(pokemon);
		em.remove(pokemon);
		em.getTransaction().commit();
		em.close();
    }
}
