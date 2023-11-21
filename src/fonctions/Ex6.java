package fonctions;

import java.util.ArrayList;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
	        
			List<Integer> entiers = new ArrayList<>();
	        entiers.add(2);
	        entiers.add(4);
	        entiers.add(6);
	        entiers.add(8);

	        entiers.forEach(entier -> System.out.println(carre(entier)));
	    }

	    public static int carre(int n) {
	        return n * n;
	    }

}
