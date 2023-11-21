package structure_de_controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> figures = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		figures.addAll(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10));
		System.out.println("Veuillez saisir un nombre:");

		// do...while => prcq on rentre au moins dans l'itération
		do {
			int carte1 = scanner.nextInt();
			int carte2 = scanner.nextInt();

			if (carte1 < 0 || carte1 >= figures.size() || carte2 < 0 || carte2 >= figures.size()) {
				System.out.println("Le numero de la carte est invalide.Veuillez saisir un autre numero");
				
			}

			else if (carte1 == carte2) {
				System.out.println("vous avez la même carte, Veuillez choisir une autre carte");
				
			}
			
			else if (figures.get(carte1).equals(figures.get(carte2))) {
				System.out.println("Les cartes sont identiques, Bravooo!");
				figures.remove(carte1);
				figures.remove(carte2 - 1);
			} else {
				System.out.println("Veuillez reessayer a nouveau, les cartes sont differentes");
			}

		} while (figures.size() > 0);
		System.out.println("Le jeu est terminé! vous avez gagné");

	}

}
