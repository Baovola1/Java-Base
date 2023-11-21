package Interfaces;

public class Canard implements Volant, Nageant{

	@Override
	public void nager() {
		System.out.println("Le canard nage");
		
	}

	@Override
	public void voler() {
		System.out.println("Le canard vole");
		
	}

	@Override
	public String toString() {
		return "Canard";
	}
	
	
	

}
