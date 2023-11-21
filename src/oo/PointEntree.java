package oo;

public class PointEntree {

	public static void main(String[] args) {
		// Constructeur avec 3 paramètres
		
		Animal animal1 = new Animal("Chat","Mammifere",4);
		animal1.afficher();
		
		System.out.println();
		
		//Constructeur sans paramètre
		
		Animal animal2 = new Animal();
		animal2.afficher();

	}

}
