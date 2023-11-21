package Collections;

import java.util.HashSet;

public class Ex5 {

	public static void main(String[] args) {
		// Créer 2 set comprenant les entiers: 1,2,3,4,5 et 2,3,4
		//En une seule ligne, supprimer du premier set les valeurs présentes dans le 2ème
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		set1.removeAll(set2);
		
		System.out.println("Set1: " + set1);
		
	}

}
