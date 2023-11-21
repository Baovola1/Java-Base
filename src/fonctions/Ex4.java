package fonctions;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String result = majuscules("Hello","World");
		 System.out.println(result);
			
	}
	
	public static String majuscules(String...mots) {
			
		for(int i = 0; i < mots.length; i++) {
			mots[i]= mots[i].toUpperCase();		
			}
		return String.join(",", mots);
	}
}
