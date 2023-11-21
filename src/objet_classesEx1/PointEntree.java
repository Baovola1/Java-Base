package objet_classesEx1;

public class PointEntree {

	public static void main(String[] args) {
		//Horloge horloge = new Horloge();
		
		//Setters avec des valeurs valides
//		horloge.setHeure(9);
//		horloge.setMinutes(30);
//		horloge.setSecondes(45);
//		
//		System.out.println(horloge.getHeures());
//		System.out.println(horloge.getMinutes());
//		System.out.println(horloge.getSecondes());
		
		//Setters avec des valeurs invalides
//		horloge.setHeure(25);
//		horloge.setMinutes(75);
//		horloge.setSecondes(-15);
//
//		System.out.println(horloge.getHeures()+ "h");
//		System.out.println(horloge.getMinutes() + "m");
//		System.out.println(horloge.getSecondes() + "s");
//	} 
		
		//Exercice 1.3 + 1.4
		Horloge horloge = new Horloge(9,53, 1);
		System.out.println(horloge.toString());
		
		horloge.avanceUneSeconde();
		System.out.println(horloge.toString());
		
		horloge.avanceUneSeconde();
		System.out.println();
		
		//Exercice 1.4.1 => Test des horloges réglées aux différentes cas possibles
		Horloge horloge1 = new Horloge(23,59,59);
		System.out.println(horloge1.toString());
		horloge1.avanceUneSeconde();
		System.out.println(horloge1.toString());
		
		Horloge horloge2 = new Horloge(22,59,59);
		System.out.println(horloge2.toString());
		horloge2.avanceUneSeconde();
		System.out.println(horloge2.toString());
		
		Horloge horloge3 = new Horloge(10,30,59);
		System.out.println(horloge3.toString());
		horloge3.avanceUneSeconde();
		System.out.println(horloge3.toString());
		
		Horloge horloge4 = new Horloge(10,30,59);
		System.out.println(horloge4.toString());
		horloge4.avanceUneSeconde();
		System.out.println(horloge4.toString());
	}
}
