package Exceptions;

public class PointEntree {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		try {
			service.transferer(123, 456, -200);
		}catch (MontantInvalideException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			service.retrait(790, 1600);
		} catch (MontantInvalideException e ) {
			System.out.println("Error: " + e.getMessage());
		} catch (MontantTropEleveException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
