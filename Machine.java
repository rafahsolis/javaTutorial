package tutorialJava;

public class Machine implements Info {
	private int id = 7;
	
	public void start(){
		System.out.println("Machine started");
	}
	public void stop(){
		System.out.println("Machine stopped");
	}
	@Override
	public void showInfo() {
		System.out.println("Machine id is: " + id);
		
	}
	@Override
	public String toString() {
		return "Machine [id=" + id + "]";
	}
	
}
