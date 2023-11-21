package heritage;

public class Avion extends Vehicule {
	public Avion(int x, int y) {
		super(x,y);
	}

	@Override
	public void avancer() {
		x += 100;
		y += 10;
		
	}
	
	

}
