package collaborator.dividebyzero;

public class Main {
	 
	/*
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		try {
		System.out.println(3/0); 
	}catch(ArithmeticException e) { //update exception 
		System.out.printf("Caught runtime exception = %s",e.getMessage());
	}
	}
}