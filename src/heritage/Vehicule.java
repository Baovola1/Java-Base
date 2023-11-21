package heritage;

public abstract class Vehicule {
	protected int x;
	protected int y;
	
	public abstract void avancer();
	
	public Vehicule (int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		
		return "Vehicule=" + getClass().getSimpleName() + " " + x + " " +  y;
	}
	
	
	
	

}
