package tutorialJava;

public class EqualsMethod {
	public static void main(String[] args) {
		Persona person1 = new Persona(5, "Bob");
		Persona person2 = new Persona(5, "Bob");
		
		
		System.out.println(person1==person2);
		//outputs false
		
		System.out.println(person1.equals(person2));
		//outputs true
		
		
		Double value1 = 6.2;
		Double value2 = 6.2;
		System.out.println(value1==value2);
		//outputs false
		
		System.out.println(value1.equals(value2));
		//outputs true
		
		int num1 = 6;
		int num2 = 6;
		System.out.println(num1==num2);
		//outputs true
		
		String text1 = "Hello";
		String text2 = "Hellofaskfa".substring(0,5);
		System.out.println(text1 == text2);
		//outputs false
		System.out.println(text1.equals(text2));
		//outputs true
	}
}
