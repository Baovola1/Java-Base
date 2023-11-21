package redefinition;



public class Main {

	public static void main(String[] args) {
		
		H h = new H();
		Bob bob = new Bob();
		bob.direBonjour(h);
		
		bob.direBonjour(a -> System.out.println("je vous dis que " + a) );
		

	}

}
