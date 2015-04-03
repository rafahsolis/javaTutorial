package tutorialJava;

import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
	public static void main(String[] args) {
		Test test = new Test();
		
		//Option 1
		try {
			test.run();
		} catch (IOException e) {
		//	e.printStackTrace();
			System.out.println("File not found.");
		} catch (ParseException e) {
		//	e.printStackTrace();
			System.out.println("Parse error.");
		}
		
		//Option 2
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Option 3
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Option 4 
		// add throws to main declaration... 
	}
}
