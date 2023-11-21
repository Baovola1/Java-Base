package fonctions;
public class Ex3 {

	public static void main(String[] args) {
		
		int result = factorielle(8);
		System.out.println("Le resultat de la factorielle est : " + result);
	}
	
	public static int factorielle (int n ) {
		if (n == 0) {
            return 1;
        } else {
            
        	int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
	}
}
