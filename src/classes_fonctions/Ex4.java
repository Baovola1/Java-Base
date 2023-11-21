package classes_fonctions;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serieEntiers = "1,2,3,4,5";
		
		String[] entiers = serieEntiers.split(",");
		
		for(String cos : entiers) {
			int nombre = Integer.parseInt(cos);
			double cosinus = Math.cos(nombre);
			
			System.out.println(cosinus);
			
		}

	}

}
