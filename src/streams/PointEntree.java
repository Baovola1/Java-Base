package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PointEntree {

	public static void main(String[] args) {
		List<Integer> nombres = new ArrayList<>();
		 for(int i = 0; i <= 1000; i++) {
			 nombres.add(i);
		 }
		 
		 Stream <Integer> stream = nombres.stream();
		 
		 //Récupérer et afficher la liste des nombres pairs via stream
		 
	 List<Integer> nbrPairs = stream
				 .filter(n-> n % 2 == 0)
				 .collect(Collectors.toList());
		 System.out.println("Les nombres pairs sont :");
		 nbrPairs.forEach(nbr -> System.out.println(nbr));
		 
		 //Récupérer et afficher la liste des multiples de 3
		 
		 stream = nombres.stream();
		 List<Integer> foisTrois = stream
				 .filter(n-> n % 3 == 0)
				 .collect(Collectors.toList());
		 System.out.println("Les multiples sont :");
		 foisTrois.forEach(e-> System.out.println(e));
		 
		 //Tri liste dans l'ordre inverse
		 stream = nombres.stream();
		 List<Integer> listeTri = stream
				 .sorted().collect(Collectors.toList());
		 System.out.println("Les nbrs tries sont :");
		 listeTri.forEach(e-> System.out.println(e));
		 
		 //-----------------------------------------------------------
		 List<Films> films = new ArrayList<>();
		 
		 films.add(new Films("A", "Ben","Horreur", 2008));
		 films.add(new Films("B", "Tarantino","Policier", 2010));
		 films.add(new Films("c", "Jhon","Comedie", 2023));
		 films.add(new Films("D", "Tarantino","Comedie", 2020));
		 films.add(new Films("E", "Anne","Drame", 2021));
		 
		 

		 
		 films.stream()
         .filter(film -> film.getGenre().equalsIgnoreCase("Comedie"))
         .sorted(Comparator.comparingInt(Films::getAnneeSortie))
         .forEach(film -> System.out.println(film.getTitre()));
		 
		 
		 films.stream()
         .filter(film -> film.getGenre().equalsIgnoreCase("Horreur"))
         .sorted(Comparator.comparing(Films::getTitre))
         .forEach(film -> System.out.println(film.getTitre()));
		 
		 films.stream()
         .filter(film -> film.getGenre().equalsIgnoreCase("Policier") && film.getRealisateur().equalsIgnoreCase("Tarantino"))
         .sorted(Comparator.comparing(Films::getTitre))
         .forEach(film -> System.out.println(film.getTitre()));
		 
		 List<String> titres = films.stream()
	                .filter(film -> film.getGenre().equalsIgnoreCase("Policier") && film.getRealisateur().equalsIgnoreCase("Tarantino"))
	                .sorted(Comparator.comparing(Films::getTitre))
	                .map(Films-> Films.getTitre())
	                .toList();
		 
		 titres.forEach(System.out::println);
	}

}
