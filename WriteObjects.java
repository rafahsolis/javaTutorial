package tutorialJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Persona mike = new Persona(543, "Mike");
		Persona sue = new Persona(123, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);
		
		try(FileOutputStream fs = new FileOutputStream("./src/tutorialJava/people.bin")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(mike);
			os.writeObject(sue);
			
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
