package familyStructure;

public abstract class Person {
	
	public final String gender;
	
	private String fullName, occupation;
	private int age;
	
	protected Person ( String gender, String fullName, String occupation, int age ) {
		this.gender = gender;
		this.fullName = fullName;
		this.occupation = occupation;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
