import java.util.Scanner;

public class GuessingGame {
	
	public enum Status {HIGHER,LOWER,RIGHT};
	//enums (aka enumerators) are also constant – but they are a set of constants. 
	
	public void LetsPlay(){
		SimpleEnum();
		TypeEnum();
	}
	//Notice the enum is specified at the class level. You can’t specify an enum inside a method. 
	
	private void SimpleEnum(){
		Scanner input = new Scanner (System.in);
		final int MAX_TRIES = 7;
		int tries = 0;
		int randomNumber = (int) (Math.random()*10) +1 ;
		Status status;
		
		System.out.println("I have thought of a number between 1 and 10");
		System.out.printf("input your best guess - you are allowed a maximum of %d guesses \n", MAX_TRIES);
		
		do {
			int guess = input.nextInt();
			if (guess < randomNumber){
				status = Status.HIGHER;
			}
			else if (guess > randomNumber){
				status = Status.LOWER;
			}
			else {
				status = Status.RIGHT;				
			}
		} while (status != Status.RIGHT && tries < MAX_TRIES);
		
		if (status != Status.RIGHT) {
			System.out.println ("Sad, too many tries, haven't you played this before?");
		}
		else{
			System.out.println ("you got it right!");
		}
		
	}
	
	private void TypeEnum(){
		Scanner input = new Scanner (System.in);
		int randomNumber = (int) (Math.random()*10) + 1;
		int tries = 0;
		StatusPlus statusPlus;
		final int MAX_TRIES = 5;
		System.out.println("I have thought of another number between 1 and 10");
		System.out.println("Let's have another go - you are only allowed 5 tries this time!");
		do {
			int guess = input.nextInt();
			if (guess < randomNumber){
				statusPlus = StatusPlus.HIGHER;
			}
			else if (guess > randomNumber) {
				statusPlus = StatusPlus.LOWER;	
			}
			else {
				statusPlus = StatusPlus.RIGHT;
			}
			System.out.println(statusPlus.getMessage());
			tries++;
		} while (statusPlus != StatusPlus.RIGHT && tries < MAX_TRIES);
		
		if (statusPlus != StatusPlus.RIGHT) {
			System.out.println ("Sad, too many tries, haven't you played this before?");
		}
		input.close();
	}
	
	
}

