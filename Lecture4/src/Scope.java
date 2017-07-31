
public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Can instantiate a Dog because it's a public class
		Dog myDog = new Dog();
		myDog.name = "Patsy";

		// Can call come() method on myDog object because 
		// come() is public
		myDog.come();
		
		// Can call behave() method on myDog object because 
		// behave() is public
		myDog.behave();	
		
		// Can't call sleep() method on myDog object because
		// sleep() is private. 
		//The following line won't compile.
		// myDog.sleep();
		
	}

}


