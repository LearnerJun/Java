
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int total = 0;
		
		do {
			total += ++count;
			System.out.printf("total %d count %d\n", total, count);
			
		} while (count < 3);
		
		System.out.printf("do loop count %d total %d \n", count, total);

		//---------------------------------------------------------------
		
		count = 0;
		total = 0;
		while (count > -30) {
			count -=10;
			total += count;
			
		}
		
		System.out.printf("while loop count %d total %d\n",count, total);
		
		
		//for loop
		count = 0;
		total = 0;
		for (int i=0; i < 3; i++) {
			count ++;
			total += i;
			
		}
		
		System.out.printf("for loop count %d total %d\n", count,  total);
		
		//---------------------------------------------------------------
		
		int i;
		for(i = 0, total = 0; i<3; i++){
			total += i++;  // You should NOT do this!!!
		}
		System.out.printf("for loop i %d total %d\n", i, total);

		
		
	}

}
