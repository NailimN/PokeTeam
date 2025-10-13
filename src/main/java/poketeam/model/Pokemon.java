package poketeam.model;

public class Pokemon {
	
	Integer id;
	String nom;
	Integer tauxCapture;
	Double facteurApparition;


	public Pokemon(Integer id, String nom, Integer tauxCapture, Double facteurApparition) {
		this.id = id;
		this.nom = nom;
		this.tauxCapture = tauxCapture;
		this.facteurApparition = facteurApparition;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Integer getTauxCapture() {
		return tauxCapture;
	}


	public void setTauxCapture(Integer tauxCapture) {
		this.tauxCapture = tauxCapture;
	}


	public Double getFacteurApparition() {
		return facteurApparition;
	}


	public void setFacteurApparition(Double facteurApparition) {
		this.facteurApparition = facteurApparition;
	}


	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nom=" + nom + ", tauxCapture=" + tauxCapture + ", facteurApparition="
				+ facteurApparition + "]";
	}

}
