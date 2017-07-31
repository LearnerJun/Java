
public class Official extends Person implements Payment{
	
	enum Roles {UMPIRE, LINEJUDGE, BALLKID, UNDEFINED};
	private Roles role;
	//constructors
	public Official (String name) {
		super(name);
	}
	public Official () {
		super();
	}
	public Official (String name, String role){
		super(name);
		setRole(role);
		
	}
	
	//this class's gets and sets
	public void setRole(String role) {
		try {
			this.role = Roles.valueOf(role.toUpperCase());
		}
		catch (IllegalArgumentException e){
			this.role = Roles.UNDEFINED;
		}
	}
	public String getRole(){
		return role.toString().substring(0, 1).toUpperCase() +
				role.toString().substring(1).toLowerCase();
	}
	
	@Override
	public String toString() {
		return "Official: " + name + ", Role: " + getRole()+" Payment " + getPayment();
	}
	public double getPayment() {
		double payment;
		if (role == Roles.UMPIRE)
			payment = 10000;
		else if (role == Roles.LINEJUDGE)
			payment = 2000;
		else if (role == Roles.BALLKID)
			payment = 200;
		else 
			payment = 0;
		return payment;
	}

}
