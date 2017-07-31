
public class Rectangle {
	private double length;
	private double width;
	
	
	//Setters let us do things before we store the data passed to it: validate (e.g., for correct range), 
	//convert (e.g., store a value passed in NZ$ internally in US$), 
	//perform actions associated with the change of value (e.g., repaint a graphical object whose colour value we change).

	//Getters let us do things when we read data: convert, register the access, etc.

	public void setLength (double length){
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setArea (double area) {
		length = Math.round(Math.sqrt(area));
	}

	public double getArea () {
		return length*width;
	}
	
	
//	Classes have constructors – these are special methods evoked when you instantiate a new Object. A constructor:
//		Has the same name as the class
//		Doesn’t have a return value – it automatically returns the object.
//		Can be overloaded. 
//		Can call other overloaded constructors with this(…);  
//		Rectangle has 3 constructors, 
//		
//		1. The default constructor, makes a square of area 1. 
//		2. Sets the length and width as the object is instantiated. 
//		3. Makes a square of the given area. 

	public Rectangle(){
		this(1,1);
	}
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle (double area) {
		this (Math.round(Math.sqrt(area)), Math.round(Math.sqrt(area)));
	}
	
	public double diagonal() {
		return Math.sqrt(length*length + width*width);
	}
}
