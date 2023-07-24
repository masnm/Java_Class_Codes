package familyStructure;

public class Mother extends Wife implements FatherMotherProperty {
	
	private int childrens;
	
	public Mother ( String fullName, String occupation, int age, int childrens ) {
		super ( fullName, occupation, age );
		this.childrens = childrens;
	}

	@Override
	public int getChildrens() {
		return this.childrens;
	}

	@Override
	public void setChildrens(int childrens) {
		this.childrens = childrens;
	}

}
