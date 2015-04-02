package tutorialJava;

public class interfaces {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		Info info1 = new Machine();
		PersonInterface person1 = new PersonInterface("Bob");
		Info info2 = person1;
		
		info1.showInfo();
		info2.showInfo();
		
		System.out.println("\nUsing a method for the info interface:");
		showInfo(person1);
		showInfo(mach1);

	}
	
	private static void showInfo(Info info){
		info.showInfo();
	}

}
