package enumerations;

public class Ex1 {

	public static void main(String[] args) {
		// Créer un état Feu, qui possède les valeurs possibles ROUGE, ORANGE, VERT
		//Créer une fonction etatSuivant(Feu feu):Feu qui renvoie l’état suivant
		//( workflow VERT => ORANGE => ROUGE => VERT )
		
		
		Feu etat = Feu.VERT;
		System.out.println("Etat actuel : " + etat);
		
		etat = etatSuivant(etat);
		System.out.println("Nouvel etat1 : " + etat);
		
		etat = etatSuivant(etat);
        System.out.println("Nouvel etat2 : " + etat);
		
		
	}
	
	public enum Feu {
		VERT, ORANGE, ROUGE
	}
	
	public static Feu etatSuivant(Feu etat) {
		
		if (etat == Feu.VERT) {
            return Feu.ORANGE;
        } else if (etat == Feu.ORANGE) {
            return Feu.ROUGE;
        } else {
            return Feu.VERT;
        }
	
	}

}
