package classes_fonctions;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		// Créer une liste de prénoms, puis avec une boucle, afficher chacun des prénoms en majuscules
		
		ArrayList<String>prenoms = new ArrayList<String>();
		
		prenoms.add("Bao");
		prenoms.add("Marie");
		prenoms.add("Julie");
		prenoms.add("Pierre");
		
		for(String prenom : prenoms) {
			String firstnameMaj = prenom.toUpperCase();
			System.out.println(firstnameMaj);
		}
		
		

	}

}
