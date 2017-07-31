public class RectangleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(); // just a 1 x 1 square    
	    Rectangle r2 = new Rectangle(4); // a 2 x 2 square
	    Rectangle r3 = new Rectangle(6,4); // a 6 x 4 rectangle
	    System.out.println("r1 is a " + 
	        r1.getLength() + " by " +
	        r1.getWidth() + " with area " +
	        r1.getArea() + " and diagonal " +
	        r1.diagonal()
	    );
	    System.out.println("r2 is a " + 
	        r2.getLength() + " by " +
	        r2.getWidth() + " with area " +
	        r2.getArea() + " and diagonal " +
	        r2.diagonal()
	    );
	    System.out.println("r3 is a " + 
	        r3.getLength() + " by " +
	        r3.getWidth() + " with area " +
	        r3.getArea() + " and diagonal " +
	        r3.diagonal()
	    );		
	}

}
