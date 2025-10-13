package poketeam.model;

public class Map {

	private String nom;
	private String lien_img;
	
	
	public Map(String nom, String lien_img) {
		super();
		this.nom = nom;
		this.lien_img = lien_img;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getLien_img() {
		return lien_img;
	}


	public void setLien_img(String lien_img) {
		this.lien_img = lien_img;
	}


	@Override
	public String toString() {
		return "Map [nom=" + nom + ", lien_img=" + lien_img + "]";
	}
	
	
	
	
	
}
