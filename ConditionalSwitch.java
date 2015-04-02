package tutorial1;

import java.util.Scanner;

public class ConditionalSwitch {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter a command: ");
		String VariableIntOrString = myScanner.nextLine();
		
		switch(VariableIntOrString){
		case "start":
			System.out.println("Machine started!");
			break;
			
		case "stop":
			System.out.println("Machine stopped");
			break;
		
		default:
			System.out.println("Command not recognized");
		}
	}
}
