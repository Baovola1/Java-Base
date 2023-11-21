package Varibales;

public class Ex5 {

	public static void main(String[] args) {
		int number = 17;
		
		boolean pair = (number % 2 == 0);
		
		//Autre écriture possible avec même résultat
//		boolean pair = 17 % 2 == 0
//				System.out.println(pair);
		
		if(pair)
		{ System.out.println(number + "pair");
		
		} else {System.out.println(number + "impair");}
	}

}
