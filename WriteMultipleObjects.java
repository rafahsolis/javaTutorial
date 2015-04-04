package tutorialJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteMultipleObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		Persona[] people = {new Persona(1, "Sue"), new Persona(99, "Mike"), new Persona(7, "Bob")};
		
		ArrayList<Persona> peopleList = new ArrayList<Persona>(Arrays.asList(people));
		
		try(FileOutputStream fs = new FileOutputStream("./src/tutorialJava/people2.bin")){
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			//Write array
			os.writeObject(people);
			
			//Write ArrayLilst
			os.writeObject(peopleList);
			
			//Write objects one by one
			os.writeInt(peopleList.size());
			for(Persona person: peopleList){
				os.writeObject(person);
			}
			
			
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