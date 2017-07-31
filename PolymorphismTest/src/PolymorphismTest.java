import java.util.ArrayList;

public class PolymorphismTest {

	public static void main(String[] args) {
		ArrayList<Payment> myObjects = new ArrayList<Payment>();		
		Player player1 = new Player();
		player1.name = "Serena Williams";
		player1.setSeeding(2);
		Player player2 = new Player("Roger Federer",17);
		Official official1 = new Official("Kader Nouni", "umpire");
		Official official2 = new Official("Jilly BallGirl", "BallGirl");
		Match match = new Match(player1, player2, official1, official2);

		// demonstrate polymorphism with an interface 
		myObjects.add(player1);
		myObjects.add(player2);
		myObjects.add(official1);
		myObjects.add(official2);
		myObjects.add(match);
		for (Object o: myObjects) {
			System.out.println(o.toString());
		}
		
	}
}
