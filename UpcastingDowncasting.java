package tutorialJava;

public class UpcastingDowncasting {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camara camara1 = new Camara();
		
		machine1.start();
		camara1.start();
		camara1.snap();
		
		// Upcasting (safe, polymorphism)
		Machine machine2 = camara1;
		machine2.start();
		
		//Downcasting (unsafe, can cause an exception)
		Machine machine3 = new Camara();
		Camara camara2 = (Camara)machine3;
		camara2.start();
		camara2.snap();
	}
}
