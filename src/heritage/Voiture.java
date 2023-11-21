package heritage;

class Voiture extends Vehicule {
	
	public Voiture(int x, int y) {
		super(x,y);
	}

	@Override
	public void avancer() {
		x += 5;
		
	}
	
	
	

}
