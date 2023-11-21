package classes_fonctions;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String listePays = "France, Canada, Londres";
		
		String[] paysArray = listePays.split(",");
		
		for(String pays : paysArray) {
			String paysEnMinuscules = pays.toLowerCase();
			System.out.println(paysEnMinuscules);
			
		}

	}

}
