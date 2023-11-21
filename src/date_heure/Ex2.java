package date_heure;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex2 {

	public static void main(String[] args) {
		//Convertir la date du jour au format “J / M / A”
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dateConvertie = date.format(formatter);
		
		System.out.println(dateConvertie);

	}

}
