package tutorialJava;

import java.util.ArrayList;
import java.util.HashMap;

public class Generic {
	public static void main(String[] args) {
		
		//////////// Before Java 5 //////////
		ArrayList list1 = new ArrayList();
		list1.add("Banana");
		list1.add("Apple");
		list1.add("Orange");
		
		String fruit = (String)list1.get(1);
		System.out.println(fruit);
		
		///////// After Java 5 /////////////
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("fish");
		
		String animal = strings.get(2);
		System.out.println(animal);
		
		///////// There can be more than one type argument //////
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		//////// Java 7 //////////////////////
		ArrayList<Integer> someList = new ArrayList<>();
		
		
	}
}
