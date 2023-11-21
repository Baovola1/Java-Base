package structure_de_controle;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int secretNumber = random.nextInt(101);//Pour générer un nbr de 0 à 100 
		Scanner scanner = new Scanner(System.in);
		
		int tentative;
		int nombreEssais = 0;//Ajout nbr d'essaie
		boolean find = false;
		
		while(!find)//On peut ne jamais entrer ds la boucle
		{
			System.out.print("Veuillez entrer un nombre:");
			tentative = scanner.nextInt();
			nombreEssais++;
			
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
		System.out.println(nombreEssais);
	}

}
