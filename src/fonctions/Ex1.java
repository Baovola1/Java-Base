package fonctions;

public class Ex1 {

	public static void main(String[] args) {
		
		int result = puissance(2,3);//appelle de la fonction +déclaration valeur et stocke le resultat dans la variable
		System.out.println("Le resultat de la puissance est : " + result);
	}
	
	public static int puissance(int n , int p) {
		int result = 1;
		
		for(int i=0 ; i < p ; i++);//Boucle qui s'execute "p" fois
		 result = result * n; //Multiplication du result par le nbr "n" à chak itération
		 			
		 return result;//On retourne le resultat de la puissance
	
}
}


