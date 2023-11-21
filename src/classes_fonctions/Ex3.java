package classes_fonctions;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serieDeMots = "la-maison-du-leopard";
		
		String[] motsArray = serieDeMots.split("-");
		
		for(String mot : motsArray) {
			if(!mot.contains("le") && !mot.contains("la")) {
				System.out.println(mot);
			}
		}

	}

}
