package heritage;

public class Boeing extends Avion{
	public Boeing(int x, int y) {
		super(x,y);
	}

	@Override
	public void avancer() {
		// TODO Auto-generated method stub
		super.avancer();
		y += 5;
	}
	
	

}
