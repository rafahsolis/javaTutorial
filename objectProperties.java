package tutorial1;

class Dog {
	private int id;
	private String name;
	
	public Dog(int id, String name){
		this.id = id;
		this.name = name;
	}
		
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id)
		.append(": ")
		.append(name);
		return sb.toString();
	}
}

public class objectProperties {

	public static void main(String[] args) {
		Dog class1 = new Dog(4, "Fredy");
		
		System.out.println(class1);

	}

}
