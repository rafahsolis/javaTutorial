package tutorialJava;

public class Camara extends Machine {

	@Override
	public void start() {
		System.out.println("Camara started");
	}
	
	public void snap(){
		System.out.println("Photo taken");
	}
	
}
