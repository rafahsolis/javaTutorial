package tutorialJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) {
		File file = new File("./src/tutorialJava/textFile2.txt");

		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line 1");
			br.newLine();
			br.write("This is line 2");
			br.newLine();
			br.write("Last line");
			br.newLine();

		} catch (IOException e) {
			System.out.println("Unable to read the file: " + file.toString());
		}

	}

}
