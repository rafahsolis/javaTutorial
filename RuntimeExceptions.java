package tutorialJava;

public class RuntimeExceptions {

	public static void main(String[] args) {
		int value = 7;
		String[] texts = {"cero", "one", "two"};
		
		//runtime exceptions
		//// division by 0(ArithmeticException)
		try {
			value = value/0;
		} catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		//// ArrayIndexOutOfBoundsException
		System.out.println(texts[3]);
		// NoPointerException

	}

}
