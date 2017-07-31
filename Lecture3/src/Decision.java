import java.util.Scanner;
public class Decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ifs with multiple dependent statements
		// must be in a code block {} 
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a integer number: ");
		int temperature1 = input.nextInt();
		int hotdays = 0;
		int colddays = 0;
		
		if (temperature1 > 25) {
		    System.out.printf("Day 1 was hot - %d\n", temperature1);
		    hotdays++;
		}
		else {
		    System.out.printf("Day 1 was cold - %d\n", temperature1);
		    colddays++;

		// or in this less readability way
	    System.out.println(temperature1 > 19 ?  
	    		"Day 2 was hot - " + temperature1 :   "Day 2 was cold - " + temperature1);

		}
		
		// switch statement
		 switch (temperature1/20) {// 19 or less will be 0, 20 or more 1 
		 case 0:
			 System.out.printf("Day 3 was cold");
			 colddays++;
			 break;
		 case 1:
			 System.out.printf("Day 3 was hot");
			 hotdays++;
			 break;
		 default: // this is optional
			System.out.printf("Day 3 was over 40!");
			hotdays++;
		 }
		 
		 

	}
}
