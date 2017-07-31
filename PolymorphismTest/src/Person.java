
public abstract class Person {
//	This class declaration has abstract added to it – 
//	this means you cannot instantiate objects of type Person.  
//	It’s a good idea to make a class abstract if it is simply a 
//	building block. 
//	Or, more fashionable, make it an interface.

	protected String name;
	//constructors
	protected Person () {}
	protected Person(String name) {
		this.name = name;
	}
	//gets and sets
	public void setName (String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
}
