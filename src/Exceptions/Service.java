package Exceptions;

public class Service {
	
	//Fonction transferer
	public void transferer(int idCompteSource, int idCompteDest, int montant ) throws MontantInvalideException {
		if(montant < 0) {
			throw new MontantInvalideException("Le montant que vous avez saisi doit etre plus grand");
		}	
		
	}
	
	//Fonction retrait
	public void retrait(int idCompte, int montant) throws MontantInvalideException, MontantTropEleveException {
		 if(montant < 0) {
			 throw new MontantInvalideException ("Le montant doit etre plus de zero ");
		 }
		 if( montant > 1000) {
			 throw new MontantTropEleveException ("Le montant depasse la limite autorisee");
		 }
	}

}
