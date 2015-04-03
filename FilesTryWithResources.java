package tutorialJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesTryWithResources {
	public static void main(String[] args) {
		File file = new File("./src/tutorialJava/textFile.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());

		} catch (IOException e) {
			System.out.println("Unable to read the file: " + file.toString());
		}

	}
}
