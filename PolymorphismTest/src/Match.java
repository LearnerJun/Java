import java.util.ArrayList;

public class Match implements Payment {
	ArrayList <Person> participants = new ArrayList <Person>();
	//constructors
	public Match(){}
	public Match (Person...people){
		for (Person p: people) {
			participants.add(p);
		}
	}
	
	//methods
	public String toString() {
		String concatenator = "Match \n";
		for (Person p: participants) {
			concatenator += "   " + p.toString() + 
					" Payment " + getPayment() + "\n";
		}
		return concatenator;
	}
	
	public double getPayment() {
		return 1000;
	}
}
