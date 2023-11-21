package expressions_regulieres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		// Valider un prénom en utilisant les REGEX ( ! aux prénoms composés )
		  
		String prenom = "Jean-Claude";
		
		String regex = "^[A-Za-z]+(-[A-Za-z]+)$"; 
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(prenom);
		
		
		System.out.println(m.find());
		
		
		


	}

}
