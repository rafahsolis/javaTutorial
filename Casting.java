package tutorialJava;

public class Casting {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 2354;
		float floatValue = 2546.8f;
		double doubleValue = 48984654.23;
		String stringValue = "";
		
		System.out.println("byte min Value: " + Byte.MIN_VALUE);
		System.out.println("byte size: " + Byte.SIZE);
		System.out.println("byte max Value: " + Byte.MAX_VALUE);
		System.out.println("short max Value: " + Short.MAX_VALUE);
		System.out.println("int max Value: " + Integer.MAX_VALUE);
		System.out.println("long max Value: " + Long.MAX_VALUE);
		System.out.println("float max Value: " + Float.MAX_VALUE);
		System.out.println("double Max Value: " + Double.MAX_VALUE);
		
		
		//Casting
		
		//long to int
		intValue = (int)longValue;
		
		//int to double
		doubleValue = intValue;
		
		//float to int no rounding
		intValue = (int)floatValue;
		
		// To round:
		// Math.round(floatValue);
	
		// cast To byte works but not as expected = -128
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}

}
