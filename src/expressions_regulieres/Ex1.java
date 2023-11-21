package expressions_regulieres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		// Valider  une adresse mail, en utilisant une expression régulière
		
		String email = "java@gmail.com";
		
		Pattern p = Pattern.compile ("^[a-z,A-Z]+@[a-z]+.[a-z]{2,}$");
		
		Matcher m = p.matcher(email);
		
		System.out.println(m.find());

	}

}
