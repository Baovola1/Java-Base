package composition;

import java.util.ArrayList;
import java.util.List;

public class PointEntree {

	public static void main(String[] args) {
		Aiguille montre = new Aiguille(12, 10);

		System.out.println("la position initiale de l'aiguille est : " + montre.getPosition());

		montre.avancer();

		System.out.println("La finale position est : " + montre.getPosition());

		// ----------------------------------------------------
		HorlogeAAiguilles horloge = new HorlogeAAiguilles(10, 20, 30);

		System.out.println(horloge.toString());
		horloge.avancerUneSeconde();

		System.out.println();

		// --------------------------Création liste d'horloges + forEach + les faire avancer----------------------
		List<HorlogeAAiguilles> horloges = new ArrayList<>();

		horloges.add(new HorlogeAAiguilles(10, 20, 30));
		horloges.add(new HorlogeAAiguilles(5, 45, 0));
		horloges.add(new HorlogeAAiguilles(12, 0, 0));
		horloges.add(new HorlogeAAiguilles(23, 59, 59));

		horloges.forEach(HorlogeAAiguilles::avancerUneSeconde);

		for (HorlogeAAiguilles horloge2 : horloges) {
			System.out.println(horloge2);
		}

	}

}
