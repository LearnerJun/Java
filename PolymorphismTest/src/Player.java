
public class Player extends Person implements Payment {
	private int seeding;
	
	//constructors
	public Player (String name) {
		super(name);
	}
	public Player() {
		super();
	}
	public Player (String name, int seeding) {
		super(name);
		this.seeding = seeding;
	}
	
	//this class's gets and sets 
	public void setSeeding (int seeding) {
		this.seeding = seeding;
	}
	public int getSeeding() {
		return seeding;
	}
	
	//methods
	public int ChanceOfWin(){
		return (int) (Math.random()*100) + 1;
	}
	
	@Override
	public String toString(){
		return "Player: " + name + ", Seeding " + seeding + " Payment "
				+ getPayment();
	}
	
	public double getPayment(){
		double payment;
		payment = (1010 - seeding * 10) * 500;
		return payment;
	}
}
