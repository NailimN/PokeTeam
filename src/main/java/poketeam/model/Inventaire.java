package poketeam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventaire")
public class Inventaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name="nbPokeball", nullable = false, columnDefinition = "INT(3)")
	Integer nbPokeball;
	
	@Column(name="nbFriandise", nullable = false, columnDefinition = "INT(3)")
	Integer nbFriandise;
	
	@Column(name="nbBoue", nullable = false, columnDefinition = "INT(3)")
	Integer nbBoue;
	
	
	public Inventaire() {}
	
	public Inventaire(Integer nbPokeball, Integer nbFriandise, Integer nbBoue) {
		this.nbPokeball = nbPokeball;
		this.nbFriandise = nbFriandise;
		this.nbBoue = nbBoue;
	}


	public Integer getNbPokeball() {
		return nbPokeball;
	}


	public void setNbPokeball(Integer nbPokeball) {
		this.nbPokeball = nbPokeball;
	}


	public Integer getNbFriandise() {
		return nbFriandise;
	}


	public void setNbFriandise(Integer nbFriandise) {
		this.nbFriandise = nbFriandise;
	}


	public Integer getNbBoue() {
		return nbBoue;
	}


	public void setNbBoue(Integer nbBoue) {
		this.nbBoue = nbBoue;
	}


	@Override
	public String toString() {
		return "Inventaire [nbPokeball=" + nbPokeball + ", nbFriandise=" + nbFriandise + ", nbBoue=" + nbBoue + "]";
	}
	
	
	
	
	
}
