package Tableaux;

public class ex6 {

	public static void main(String[] args) {
		int[] tabInit = {1,2,3,4,5};
		int minTabNbr = minTab(tabInit);
		System.out.println(minTabNbr);
	}
	
	public static int minTab(int[]tab) {
		int nbrMin = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if(tab[i] < nbrMin) {
				 nbrMin = tab[i];
			}
		}
		return nbrMin;
	}
	
}
