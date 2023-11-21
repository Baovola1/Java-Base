package heritage;

import java.util.ArrayList;
import java.util.List;

public class PointEntree {

	public static void main(String[] args) {

	        List<Vehicule> vehicules = new ArrayList<>();
	        vehicules.add(new Twingo(0, 0));
	        vehicules.add(new Ferrari(0, 0));
	        vehicules.add(new Boeing(0, 0));
	        vehicules.add(new Mirage(0, 0));

	        vehicules.forEach(vehicule -> vehicule.avancer());

	        vehicules.forEach(System.out::println);
			
	}

}
