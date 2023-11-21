package heritage;

public class Mirage extends Avion {
	public Mirage(int x, int y) {
		super(x,y);
	}

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		x += 2* 100;
		y += 2 * 10;
	}
	
	

}
