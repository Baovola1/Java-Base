package structure_de_controle;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secretNumber = random.nextInt(101);//Pour générer un nbr de 0 à 100 
		Scanner scanner = new Scanner(System.in);
		boolean rejouer = true;
		
		
		int tentative;
		boolean find = false;
				
		
		while(!find)
		{
			System.out.print("Veuillez entrer un nombre:");
			tentative = scanner.nextInt();
			
			if (tentative < secretNumber) 
				{
				System.out.println("Nombre plus grand");
				} 
			
			else if (tentative > secretNumber)
				{
					System.out.println("Nombre plus petit");
				
				}
		
		
			}
		
		//Demander si le joueur souhaite rejouer
		
				while(rejouer) 
				{
					System.out.print("Veuillez entrer un nombre:");
					tentative = scanner.nextInt();
					
					
					if (tentative < secretNumber) 
						{
						System.out.println("Nombre plus grand");
						} 
					
					else if (tentative > secretNumber)
						{
							System.out.println("Nombre plus petit");
						
						}
			
				
					}
				
		
		scanner.close();
		System.out.println(rejouer);	
	}

}
