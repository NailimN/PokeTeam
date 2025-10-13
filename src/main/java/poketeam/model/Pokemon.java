package poketeam.model;

public class Pokemon {
	
	Integer id;
	String nom;
	Integer tauxCapture;
	Double facteurApparition;
	TypeElement firstType;
	TypeElement secondType;


	public Pokemon(Integer id, String nom, Integer tauxCapture, Double facteurApparition, String firstType) {
		this.id = id;
		this.nom = nom;
		this.tauxCapture = tauxCapture;
		this.facteurApparition = facteurApparition;
		this.firstType = TypeElement.valueOf(firstType);
		this.secondType = null;
	}
	
	
	public Pokemon(Integer id, String nom, Integer tauxCapture, Double facteurApparition, String firstType, String secondType) {
		this.id = id;
		this.nom = nom;
		this.tauxCapture = tauxCapture;
		this.facteurApparition = facteurApparition;
		this.firstType = TypeElement.valueOf(firstType);;
		this.secondType = TypeElement.valueOf(secondType);;
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


	public TypeElement getFirstType() {
		return firstType;
	}


	public void setFirstType(TypeElement firstType) {
		this.firstType = firstType;
	}


	public TypeElement getSecondType() {
		return secondType;
	}


	public void setSecondType(TypeElement secondType) {
		this.secondType = secondType;
	}


	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nom=" + nom + ", tauxCapture=" + tauxCapture + ", facteurApparition="
				+ facteurApparition + ", firstType=" + firstType + ", secondType=" + secondType + "]";
	}
	
	


}
