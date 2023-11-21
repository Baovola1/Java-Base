package Tableaux;

public class ex5 {

	public static void main(String[] args) {
		
		int[] tabInit = {2,10,20,30};
		int max = nbrmax (tabInit);
		System.out.println(max);
	}
	
	public static int nbrmax (int[] tab) {
		int max = tab[0];
		for(int i=0; i< tab.length; i++) {
			
			if(tab[i] > max) {
				max = tab[i];
			}
	}
		
		return max;
	}
}
