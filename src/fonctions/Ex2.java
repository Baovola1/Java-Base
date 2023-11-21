package fonctions;

public class Ex2 {

	public static void main(String[] args) {
		
		 int resultPuissance = puissance(2, 3);
	        System.out.println("Resultat de la puissance : " + resultPuissance);

	     int resultCarre = carre(4);
	        System.out.println("Resultat du carre : " + resultCarre);
		
	}
	
	public static int puissance (int n, int p) {
		
		int result = 1;

        for (int i = 0; i < p; i++) {
            result= result * n;
        }

        return result;	
	}
	
	public static int carre(int n) {
		return puissance(n,2);
	}
	}
	
	
	
	