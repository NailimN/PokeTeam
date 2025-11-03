package poketeam.model;


public class Pokedex {
	private Joueur joueur;
	private Pokemon pokemon;
	
	
	// Constructeurs
	public Pokedex(Joueur joueur, Pokemon pokemon) {
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
		return "Pokedex [joueur=" + joueur.getSurnom() + ", pokemon=" + pokemon.getNom() + "]";
	}

}

