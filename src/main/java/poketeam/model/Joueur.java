package poketeam.model;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joueur {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	@Column(name="surname",nullable = false,length = 15)
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
