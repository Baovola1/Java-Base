package fonctions;

public class Ex5 {
	//Utilisation  passage par référence prcq on ne "return" rien;
	//On utilise le sysout => dans le "main";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mots = {"Hello","tout", "le", "monde"};
		metsEnMajuscules(mots);	
		
		for(String mot : mots) {
			System.out.println(mot);
		}
	}
	
	public static void metsEnMajuscules(String[] mots) {
		
		for(int i = 0; i < mots.length; i++)
		{
			mots[i] = mots[i].toUpperCase();
			
		}
	}	

}
