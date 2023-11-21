package Tableaux;

public class Ex4 {

	public static void main(String[] args) {
		//Créer un tableau nombres1: 10,20,30 et un tableau nombres2 : 40,50
		//Ensuite créer un nouveau tableau nombres dont la taille sera calculée en fonction du nombre d'éléments des 2 premiers ( length )
		//Puis placer dans ce nouveau tableau nombres le contenu des 2 premiers tableaux ( 10, 20, 30 , 40, 50 ) en lisant chaque cellule.
 
		int[] nombres1 = {10, 20, 30};
		int[] nombres2 = {40,50};
		
		int tailleNombres = nombres1.length + nombres2.length;
		int[] nombres = new int[tailleNombres];
		
		for (int i = 0; i < nombres1.length; i++) {
            nombres[i] = nombres1[i];}
		
		for (int i = 0; i < nombres2.length; i++) {
            nombres[nombres1.length + i] = nombres2[i];}
		
		for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);}

	}

}
