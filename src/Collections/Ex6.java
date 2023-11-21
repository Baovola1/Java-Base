package Collections;

import java.util.HashMap;

public class Ex6 {

	public static void main(String[] args) {
		// Créer une map paysCapitales (clé pays, valeur capitale) en y ajoutant quelques données, et afficher uniquement les pays
		//Récupération de toutes les clés 
		
		HashMap<String, String> paysCapitales = new HashMap<String, String>();
		
		paysCapitales.put("France", "Paris");
        paysCapitales.put("Allemagne", "Berlin");
        paysCapitales.put("Espagne", "Madrid");
        paysCapitales.put("Italie", "Rome");

        		System.out.println(paysCapitales.keySet());
//            System.out.println(paysCapitales.values());/*pour afficher toutes les valeurs*/
      

	}

}
