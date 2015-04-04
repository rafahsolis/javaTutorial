package tutorialJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadMultipleObjects {

	public static void main(String[] args) {
		System.out.println("Reading objects...");

		
		try(FileInputStream fi = new FileInputStream("./src/tutorialJava/people2.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Persona[] people = (Persona[])os.readObject();
			
			//read Array
			for(Persona person: people){
				System.out.println(person);
			}
			
			//Read ArrayList
			@SuppressWarnings("unchecked")
			ArrayList<Persona> peopleList = (ArrayList<Persona>)os.readObject();
			
			for(Persona person: peopleList){
				System.out.println(person);
			}
			
			//Read object by object
			int num = os.readInt();
			for(int i=0; i<num; i++){
				Persona person = (Persona)os.readObject();
				System.out.println(person);
			}
			os.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
