package tutorial1;

public class IfStatement {

	public static void main(String[] args) {
		int value = 20;
		
		if(value < 10){
			System.out.println("Value < 10");
		}
		else if(value >= 10 && value < 20){
			System.out.println("value >=10 and value < 20");
		}
		else {
			System.out.println("value >= 20");
		}

	}

}
