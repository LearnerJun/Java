import java.util.Scanner;
import java.util.ArrayList;
public class PeopleWithDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> people = new ArrayList<Person>();
		String name = "";
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a person's name");
		name = input.next();
		while (!name.toUpperCase().equals("N")) {
			Person person = new Person (name);
			people.add(person);
			person.addDogs(input);
			
			System.out.println("Enter another person or N to finish");
			name = input.next();
		}
		
		for (Person p : people) {
			p.print();
		}
	}

}
