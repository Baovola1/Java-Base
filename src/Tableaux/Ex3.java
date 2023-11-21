package Tableaux;

public class Ex3 {

	public static void main(String[] args) {
		// Créer un tableau de 3 éléments 10,20,0 puis sommer les 2 premiers éléments et placer le résultat dans le 3ème élément

		int[]tableau = {10,20,0};
		
		int somme = tableau[0] + tableau[1];
		tableau[2] = somme;
		
		System.out.println(tableau[2]);
	}

}
