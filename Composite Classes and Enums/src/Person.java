import java.util.ArrayList;
import java.util.Scanner;
public class Person {
	private ArrayList<Dog> dogs;
	private String name;
	
	//constructor
	Person(String name){
		dogs = new ArrayList<Dog>();
		this.name = name;
	}
	
	public void addDogs(Scanner input) {
		String name;
		System.out.println("Enter their dog's name");
		name = input.next();
		while (!name.toUpperCase().equals("N")) {
			Dog dog = new Dog (name);
			dogs.add(dog);
			System.out.println("Enter another dog or N to stop");
			name = input.next();			
		}		
	}
	
	public void print() {
		System.out.println("Owner " + name);
		for (Dog d: dogs) {
			d.print();
		}
	}
	
}
