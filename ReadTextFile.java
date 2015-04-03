package tutorialJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		//String filename = "/home/user/documentos/learning/java/tutorial1/src/tutorialJava/textFile.txt";
		String filename = "./src/tutorialJava/textFile.txt";
		File textFile = new File(filename);
		Scanner Sc = new Scanner(textFile);
		
		int value = Sc.nextInt();
		System.out.println("Read value: " + value );
		//read next line char
		Sc.nextLine();
		
		int count = 2;
		while(Sc.hasNextLine()){
			String line = Sc.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		
		
		Sc.close();
		
	}

}
