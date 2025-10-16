package poketeam.test;

import poketeam.context.Singleton;

public class testDB {

	public static void main(String[] args) {
		
		System.out.println(Singleton.getInstance().getDaoPokemon().findById(2));

	}
}
