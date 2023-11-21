package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Object> listeObjets = new ArrayList<>();

		listeObjets.add(new Crocodile());
		listeObjets.add(new Canard());
		listeObjets.add(new Elephant());
		listeObjets.add(new Requin());
		listeObjets.add(new Autruche());
		
		listeObjets.forEach(objet->{
			System.out.println(objet.toString());
			
			if (objet instanceof Volant) {
                ((Volant) objet).voler();
            }

            if (objet instanceof Marchant) {
                ((Marchant) objet).marcher();
            }

            if (objet instanceof Nageant) {
                ((Nageant) objet).nager();
            }
		});
	}
}
