package heritage;

public class Ferrari extends Voiture {
	public Ferrari(int x, int y) {
		super(x, y);
	}

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		x += 50;
	}
	
	

}
