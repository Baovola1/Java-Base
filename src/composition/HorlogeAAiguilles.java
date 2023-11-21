package composition;

//La classe HorlogeAAiguilles contiendra une fonction toString ( h:m:s ), et sera composée de 3 objets issus de la classe Aiguille : aiguilleH, aiguilleM, aiguilleS.
//Elle contiendra également un constructeur qui prendra 3 entiers en paramètre (h,m,s) et construira les 3 aiguilles à ce moment. La classe contiendra aussi une fonction avancerUneSeconde() sans param et sans retour, qui commandera nos 3 objets aiguille
//=> gérer les reset en déléguant un max à la classe aiguille

public class HorlogeAAiguilles {
	private Aiguille aiguilleH;
	private Aiguille aiguilleM;
	private Aiguille aiguilleS;
	
	public HorlogeAAiguilles(int heures, int minutes, int secondes) {
		aiguilleH = new Aiguille(12, heures);
		aiguilleM = new Aiguille(60, minutes);
		aiguilleS = new Aiguille(60,secondes);
		
	
	}
	
	public void avancerUneSeconde() {
		boolean resetS = aiguilleS.avancer();
		if(resetS) {
			boolean resetM = aiguilleM.avancer();
			if(resetM) {
				aiguilleH.avancer();
			}
		}
	}
	
	@Override
	public String toString() {
		String heure = String.format("%02d",aiguilleH.getPosition());
		String minute = String.format("%02d",aiguilleM.getPosition());
		String seconde = String.format("%02d",aiguilleS.getPosition());
		
		return heure + ":" + minute + ":" + seconde;
	}
}
