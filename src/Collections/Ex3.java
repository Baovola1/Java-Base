package Collections;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		//Créer 2 listes: couleurs1: “rouge”,”vert”,”bleu” et couleurs2:”rouge”,”jaune”
		//Placer l’union des 2 dans couleurs1 
		 
		ArrayList<String>couleurs1 = new ArrayList<String>();
		 
		 couleurs1.add("rouge");
		 couleurs1.add("vert");
		 couleurs1.add("bleu");
		 
		 ArrayList<String>couleurs2 = new ArrayList<String>();
		 couleurs2.add("rouge");
		 couleurs2.add("jaune");
		 
		 couleurs1.addAll(couleurs2);
		 
		 System.out.println("Couleurs1 : " + couleurs1);
	}

}
