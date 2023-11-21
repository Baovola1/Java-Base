package Collections;


import java.util.HashSet;

public class Ex4 {

	public static void main(String[] args) {
		// Pareil avec les set au lieu des listes : comparer le résultat ; )

		HashSet<String>couleurs1 = new HashSet<String>();
		 
		 couleurs1.add("rouge");
		 couleurs1.add("vert");
		 couleurs1.add("bleu");
		 
		 HashSet<String>couleurs2 = new HashSet<String>();
		 couleurs2.add("rouge");
		 couleurs2.add("jaune");
		 
		 couleurs1.addAll(couleurs2);
		 
		 System.out.println("Couleurs1 : " + couleurs1);
	}

}
