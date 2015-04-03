package tutorialJava;

public class Polymorphism {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		//this will output Tree growing
		plant2.grow();
		tree.shedLeaves();
		
		//this wont work
		//plant2.shedLeaves();
		
		//Wherever a parent class is expected you can use a subclass
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}
}
