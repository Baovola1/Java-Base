package expressions_regulieres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {

	public static void main(String[] args) {
		// Valider une adresse au format: 70 Boulevard Gambetta, 75020 Paris, Puis récupérer les groupes num, rue, zip, localité
		
		String adresse = "70 Boulevard Gambetta, 75020 Paris";

       
        String regex = "^(\\d+)\\s+(\\p{L}+\\s+\\p{L}+),\\s*(\\d{5})\\s+(\\p{L}+)$";

        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(adresse);

        // Vérification si l'adresse est valide et extraction des groupes
        
        if (m.find()) {
            
        	String num = m.group(1);
            System.out.println("Num : " + num);
            
            String rue = m.group(2);
            System.out.println("rue : " + rue);
            
            String zip = m.group(3);
            System.out.println("zip : " + zip);
            
            String localite = m.group(4);
            System.out.println("Localite : " + localite);
                 
            
        } 
    }

	}


