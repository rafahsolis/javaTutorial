package tutorialJava;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(factorial(100));
	}
	
	private static double factorial(int value){
		
		if (value == 1 || value == 0){
			return 1;
		}
		return factorial(value -1) * value;
		
	}

}
