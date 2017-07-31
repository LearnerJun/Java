
public enum StatusPlus {
	LOWER("Go Lower"),
	HIGHER ("GO Higher"),
	RIGHT ("Yes, you got it right!");
	
	//Constructor
	private final String message;
	private StatusPlus (String message) {
		this.message = message;
	}
	
	//Return the message value
	//for an enum
	public String getMessage(){
		return message;
	}
}
