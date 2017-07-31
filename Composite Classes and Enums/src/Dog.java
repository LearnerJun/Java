import java.time.*;

public class Dog {
	//instance variables
	private String name;
	private int yearOfBirth;
	
	Dog(String name, int yearOfBirth){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	
	Dog(String name) {
		this.name = name;
	}
	
	//getters and setters for name and year of birth
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setYearofBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getYearofBirth(){
		return yearOfBirth; 
	}
	
	//a public print() method
	public void print() {
		System.out.println("  Dog " + name);
	}
	
	//general methods
	public int age() {
		return LocalDate.now().getYear() - yearOfBirth;
	}
	
	//constructors
	
}
