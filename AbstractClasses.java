package tutorialJava;

public abstract class AbstractClasses {
/*This kind of declaration prevents the class to be instantiated, it can only
 *be inherited */
	
	/*Abstract classes can have abstract methods, this forces you to implement
	 * this methods on the classes that inherit from the abstract class but can not
	 * be implemented at the abstract class, only inherited
	 */
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutDown();
	
	
	/* They can also have methos implemented */
	
	public void run(){
		start();
		doStuff();
		shutDown();
	}
}
