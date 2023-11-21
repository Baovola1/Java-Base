package date_heure;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex3 {

	public static void main(String[] args) {
		//Convertir la date 31/12/2030 vers le format 2030/12/31
		
		String str = "31/12/2030";
		
		DateTimeFormatter formatterFr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterUs = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate dateConvertie = LocalDate.parse(str,formatterFr);/*String => LocalDate*/
		
		
		System.out.println(dateConvertie.format(formatterUs));


	}

}
