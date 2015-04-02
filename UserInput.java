package tutorialJava;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		String line = myInput.nextLine();
		System.out.println("You entered: " + line);
        
        System.out.println("Enter a number: ");
        int value = myInput.nextInt();
        System.out.println("You entered: " + value);
        
        System.out.println("Enter a number: ");
        double dvalue = myInput.nextDouble();
        System.out.println("You entered: " + dvalue);
	}
}
