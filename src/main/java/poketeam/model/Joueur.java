package poketeam.model;

/* import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

//@Entity
//@Table(name="Joueur")
public class Joueur {
	
	//@Id //OBLIGATOIRE pour preciser quelle colonne sert d'id coté bdd
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //OBLIGATOIRE* 
	//@Column(name="identifiant")
	private Integer id;
	
	//@Column(name="firstname",nullable = false,length = 15)
	private String surnom;

	public Joueur(Integer id, String surnom) {
		super();
		this.id = id;
		this.surnom = surnom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	@Override
	public String toString() {
		return "Joueur [id=" + id + ", surnom=" + surnom + "]";
	}
	
	
	
	

}
