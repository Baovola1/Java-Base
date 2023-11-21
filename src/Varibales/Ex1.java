package Varibales;

/*Inverser le contenu d'une variable*/

public class Ex1 {

	public static void main(String[] args) {
		String verre1= new String ("liquide vert");
		String verre2 = new String("liquide rouge");
		
		String verre3=verre1;
		verre1 = verre2;
		verre2= verre3;
		
		
		System.out.println(verre1);
		System.out.println(verre2);

	}

}
