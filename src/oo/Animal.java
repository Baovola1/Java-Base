package oo;

import java.util.Scanner;

public class Animal {
	
	private String nom;
	private String genre;
	private int nbPattes;
	
	//Création constructor avec des paramètres
	public Animal(String nom, String genre, int nbPattes) {
		this.nom = nom;
		this.genre = genre;
		this.nbPattes = nbPattes;
	}
	
	//Création fonction afficher
	
	void afficher() {
		System.out.println(this.nom);
		System.out.println(this.genre);
		System.out.println(this.nbPattes);
	}
	
	//Constructeur sans paramètre
	public Animal(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez entrer le nom de l'animal: ");
		this.nom = scanner.nextLine();
		
		System.out.println("Veuillez entrer le genre: ");
		this.genre = scanner.nextLine();
		
		System.out.println("Veuillez entrer le nbr de pattes: ");
		this.nbPattes = scanner.nextInt();
	}
	

}
