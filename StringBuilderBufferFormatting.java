package tutorialJava;

public class StringBuilderBufferFormatting {

	public static void main(String[] args) {
		
		//Inefficient
		String info = "";
		info += "My name is Bob.";
		info += "I am a constructor";
		
		//Efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("Mi name is Rafa");
		sb.append(" ")
		.append(" I'm learning.")
		.append(" ")
		.append("I like diving");
		
		System.out.println(sb.toString());

		// Formatting
		System.out.print("String formatting\tTab.\nNew Line");
		System.out.println("More text");
		
		//printformat
		System.out.printf("Total cost %d. Quantitie is %10d\n %-10d left aligned.", 5, 120, 120);
		System.out.printf("\n%s, for integer\n%s for text\n%s For float", "%d", "%s", "%f");
		System.out.printf("\n%f\t%.2f", 0.6, 0.6);
	}

}
