package tutorial1;

class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor runing");
		name = "Default name";
	}
	
	public Machine (String name) {
	    System.out.println("Second constructor");
		this.name = name;
	}
	
	public Machine (String name, int code){
		System.out.println("Third constructor");
		this.name = name;
		this.code = code;
		
	}
}

public class constructors {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("machine name");
		Machine machine3 = new Machine("machinename", 265);
	}

}
