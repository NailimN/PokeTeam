package poketeam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PokemonCapture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_joueur", nullable = false)
	private Joueur joueur;
	
	@ManyToOne
	@JoinColumn(name = "id_pokemon", nullable = false)
	private Pokemon pokemon;
	
	
	// Constructeurs
	public PokemonCapture() {}
	
	public PokemonCapture(Joueur joueur, Pokemon pokemon) {
		this.joueur = joueur;
		this.pokemon = pokemon;
	}
	
	public PokemonCapture(Integer id, Joueur joueur, Pokemon pokemon) {
		this.id = id;
		this.joueur = joueur;
		this.pokemon = pokemon;
	}

	
	// Getters et setters
	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}


	// toString
	
	@Override
	public String toString() {
		return "PokemonCapture [joueur=" + joueur.getSurnom() + ", pokemon=" + pokemon.getNom() + "]";
	}

}

