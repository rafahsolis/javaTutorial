package tutorialJava;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int value = 0;
		
		do{
			System.out.println("Enter a number: ");
			value = myScanner.nextInt();
		}
		while(value != 5);
		System.out.println("5!");
	}

}
