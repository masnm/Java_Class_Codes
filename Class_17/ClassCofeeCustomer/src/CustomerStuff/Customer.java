package CustomerStuff;

public class Customer {
	
	private static int id = 100000;
	private String custID;
	private String name;
	private String email;
	
	public Customer ( String name, String email ) {
		this.name = name;
		this.email = email;
		this.custID = generateCustID();
		Customer.id++;
	}
	
	private String generateCustID () {
		return "M" + Customer.id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustID() {
		return this.custID;
	}
	
}
