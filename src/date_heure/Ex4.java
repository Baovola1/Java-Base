package date_heure;

import java.time.LocalDate;

public class Ex4 {

	public static void main(String[] args) {
		// Calculer la date qui suit de 10 jours le 21/03/2023
		
		LocalDate referenceDate = LocalDate.of(2023, 3, 21);
		
		// Ajout de 10 jours
        LocalDate dateSuivante = referenceDate.plusDays(10);
        
        System.out.println(dateSuivante);
        


	}

}
