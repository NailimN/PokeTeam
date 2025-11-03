package poketeam.model;

public class RencontrePokemon {

	Pokemon pokemon;
	int tauxFuiteMod;
	int tauxCaptureMod;
	
	public RencontrePokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		tauxFuiteMod = 0;
		tauxCaptureMod = 0;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void lancerBoue() {
		int tauxCaptureModtemp = tauxCaptureMod;
		int tauxFuiteModtemp = tauxCaptureMod;
		if(Math.random() < 0.9) {
			tauxCaptureModtemp+=1;
			tauxFuiteModtemp+=1;
		} else {
			tauxCaptureModtemp+=1;
		}
		
		if(tauxCaptureModtemp > 6) {
			tauxCaptureModtemp = 6;
		}
		
		if(tauxFuiteModtemp > 6) {
			tauxFuiteModtemp = 6;
		}
		
		tauxCaptureMod = tauxCaptureModtemp;
		tauxFuiteMod = tauxFuiteModtemp;
		estCapturé();
	}
	
	public void donnerAppat() {
		int tauxCaptureModtemp = tauxCaptureMod;
		int tauxFuiteModtemp = tauxCaptureMod;
		if(Math.random() < 0.9) {
			tauxCaptureModtemp-=1;
			tauxFuiteModtemp-=1;
		} else {
			tauxCaptureModtemp-=1;
		}
		
		if(tauxCaptureModtemp < -6) {
			tauxCaptureModtemp = 6;
		}
		
		if(tauxFuiteModtemp < -6) {
			tauxFuiteModtemp = 6;
		}
		
		tauxCaptureMod = tauxCaptureModtemp;
		tauxFuiteMod = tauxFuiteModtemp;
		aFuit();
	}
	
	//En travaux 
		public void lancerpokeball(){
			
	}
		
	
	//En travaux 
	private void estCapturé() {
		
	}
	
	//En travaux 
	private void aFuit(){
		
	}
	
	
}
