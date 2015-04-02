package tutorialJava;

public class PersonInterface implements Info {
	private String name;

	public PersonInterface(String name) {
		this.name = name;
	}

	
	public void showInfo() {
		System.out.println("Person name is: " + name);
		
	}
	

}
