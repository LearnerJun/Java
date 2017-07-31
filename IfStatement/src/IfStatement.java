import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int input1;
		int input2;
		System.out.println("Enter a integer: ");		
		input1 = input.nextInt();
		
		System.out.println("Enter a integer: ");
		input2 = input.nextInt();
		
		if (input1 == input2) {
			System.out.println("They are the same");
		}
		else if (input1 > input2) {
			System.out.println("The first number is larger than the second one");
		}
		else {
			System.out.println("Second number is larger");
		}
		
		
	

	}

}
