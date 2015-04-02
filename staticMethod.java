package tutorial1;

class Thing {
	public String name;
	
	// static for class variables
	public static String description;
	
	//Instance count
	public static int count = 0;
	
	public int id;
	
	//constructor
	public Thing(){
		id = count;
		count++;
	}
	
	// final indicates constant
	public final static int CONSTANT_NUMBER = 10;
	
	public void showName(){
		System.out.println(description + ": " + name + " id= " + id );
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
	
	public static int thingCount(){
		return count;
	}
	
}

public class staticMethod {

	public static void main(String[] args) {
		Thing.description = "I am a thing";
		Thing.showInfo();
		System.out.println("Number of Thing instances= " + Thing.thingCount());
		
		Thing thing1 = new Thing();
		System.out.println("Number of Thing instances= " + Thing.thingCount());
		
		Thing thing2 = new Thing();
		System.out.println("Number of Thing instances= " + Thing.thingCount());
		
		thing1.name = "sue";
		thing2.name = "bob";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Thing.CONSTANT_NUMBER);
	}

}
