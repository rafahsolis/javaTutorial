package tutorialJava;

public class InnerClasses {

	public static void main(String[] args) {
		Robot robot7 = new Robot(7);
		
		robot7.start();
		
		Robot.Battery battery = new Robot.Battery();
		
		battery.charge();

	}

}
