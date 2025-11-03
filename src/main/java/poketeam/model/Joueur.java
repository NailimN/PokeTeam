package poketeam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("joueur")
public class Joueur extends Compte {
	
	
	@Column(name="nickname",nullable = false,length = 15)
	private String surnom;

	//a preciser
	private transient List<Pokemon> pokedex = new ArrayList();
	
	
	public Joueur(String login, String password, String surnom) {
		super(login, password);
		this.surnom = surnom;
	}
	
	public Joueur(Integer id, String login, String password, String surnom) {
		super(id, login, password);
		this.surnom = surnom;
	}

	public Joueur() {}


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
