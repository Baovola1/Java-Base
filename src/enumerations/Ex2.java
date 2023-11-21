package enumerations;

public class Ex2 {

	public static void main(String[] args) {
		// Afficher dynamiquement les différentes valeurs possibles de  l’état feu, sous forme de String, séparés par des virgules : “ROUGE, ORANGE, VERT”

		
        String valeurs = ValeursEtatFeu(); 
        System.out.println("Les differentes valeurs possibles de l'etat sont : " + valeurs);

	}
	
	public enum Feu {
		ROUGE, ORANGE , VERT
	}
	
	public static String ValeursEtatFeu() {
		  // Création d'un StringBuilder pour construire la chaîne de caractères finale
        
		StringBuilder sb = new StringBuilder();

        // Obtention du tableau des valeurs de l'énumération Feu
        
        Feu[] etats = Feu.values();
        
        // Parcours du tableau des valeurs
        
         for (int i = 0; i < etats.length; i++) {
            
        	 // Récupération de la valeur courante
            Feu etat = etats[i];

            // Ajout de la valeur à la chaîne de caractères
            sb.append(etat);

            // Vérification s'il y a une valeur suivante
            
            if (i < etats.length - 1) {
                
            	// Ajout de la virgule si ce n'est pas la dernière valeur
                sb.append(", ");
            }
        }

        // Conversion du StringBuilder en chaîne de caractères
        String valeurs = sb.toString();

        // Retour de la chaîne de caractères
        return valeurs;
	}
	
	
	

}
