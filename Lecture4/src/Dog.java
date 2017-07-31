public class Dog {

	public String name;
	
	public void come() {
		System.out.println("You called " + name + "? Rushing to you...");
	}
	
	public void behave() {
		sleep();
		chewSomething();
	}
	
	private void sleep() {
		System.out.println("Zzzzzz...");
		System.out.println("Waking up...");
	}
	
	private void chewSomething() {
		System.out.println("Chewing your favourite shoe...");
	}
}
