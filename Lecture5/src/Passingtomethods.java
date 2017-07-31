
public class Passingtomethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5; // num is a primitive
		int[] myArray1 = {1,2,3};
        PassByValueAndRef(num, myArray1);
        System.out.println("\n xx =" + num + " x " + myArray1[0]);


	}
	
	public static void PassByValueAndRef(int a, int b[]) {
		a = 88;
		b[0] = 77;
		}


}
