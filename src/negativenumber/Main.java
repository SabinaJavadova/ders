package negativenumber;

public class Main {

	public static void main(String[] args) {
		
		try {
			 ededler(4,-5);
			
			System.out.println("eded");
			
		}catch(customNegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		

	}

	private static void ededler(int i, int j) throws customNegativeNumberException{
		
		if ( i<0 || j<0) {
			throw new customNegativeNumberException("Menfi eded qebul edilib.");
		}
		
	}

}
