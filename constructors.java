package tutorialJava;

class Cosa {
	private String name;
	private int code;
	
	public Cosa() {
		this("Default name", 0);
		System.out.println("First constructor");
		
	}
	
	public Cosa (String name) {
	    System.out.println("Second constructor");
		this.name = name;
	}
	
	public Cosa (String name, int code){
		System.out.println("Third constructor");
		this.name = name;
		this.code = code;
		
	}
}

public class constructors {

	public static void main(String[] args) {
		Cosa machine1 = new Cosa();
		Cosa machine2 = new Cosa("machine name");
		Cosa machine3 = new Cosa("machinename", 265);
	}

}
