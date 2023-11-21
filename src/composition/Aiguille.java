package composition;

//Créer une classe Aiguille et une classe HorlogeAAiguilles
//La classe Aiguille permettra de spécifier une valeur maxi pour l’aiguille, ainsi qu’une fonction avancer() qui avancera la position de l’aiguille de 1, et gèrera le reset.
//Nous aurons également besoin d’accesseurs et d’une constructeur ( ! validation )
//! TESTER LA CLASSE Aiguille AVANT DE PASSER AU POINT SUIVANT !


public class Aiguille {
	private int position;
	private int valeurMax;

	public int getPosition() {
		return position;
	}

	public int getValeurMax() {
		return valeurMax;
	}

//Constructeur

	public Aiguille(int valueMax, int position) {
		this.valeurMax = valueMax;
		this.position = position;
	}

//Création de la fonction avancer

	public boolean avancer() {
		position++;
		if (position >= valeurMax) {
			position = 0;
			return true;
		} 
		return false;
	}
}
