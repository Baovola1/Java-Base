package structure_de_controle;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		
		entiers.add(2);
		entiers.add(4);
		entiers.add(6);
		entiers.add(8);
		entiers.add(10);
		
		for(Integer entier : entiers) {
			System.out.println(entier);
		}
		
//		Autre écriture
//		
//		List<Integer> list = Arrays.asList(2,4,6,8,10); 
//		for( int entierAct : list ) {
//			System.out.println( entierAct );
//		}


	}

}
