package date_heure;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Ex1 {

	public static void main(String[] args) {
		// Déterminer le nom du jour d’aujourd’hui
		
		LocalDate date = LocalDate.now();
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
		String nomDuJour = date.format(formatter);
		
		System.out.println(nomDuJour);
				
		
		
		
		
		
		
		
		

	}

}
