
public class User {
	// information or storages
	private String firstName, lastName;
	private int age;
	
	public User () {
		this.firstName = "A First Name";
		this.lastName = "A Last Name";
		this.age = 15;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// method or procedure or work
	// setters for this class.
	
	/*
	public String getfirstName () {
		return this.firstName;
	}
	
	public int getage () {
		return this.age;
	}
	
	public void setfirstName ( String firstName ) {
		this.firstName = firstName;
	}
	
	public void setlastName ( String lastName ) {
		this.lastName = lastName;
	}
	
	public void setage ( int age ) {
		this.age = age;
	}
	*/
	
	public void ShowInformation () {
		System.out.println ( "My Full name is : " + firstName + " " + lastName );
		System.out.println ( "My age is : " + age );
	}
	
	public String getFullName () {
		return firstName + " " + lastName;
	}
	
	public void ShowName () {
		System.out.print( "My Full Name is " + firstName + " " + lastName + "." );
	}
}
