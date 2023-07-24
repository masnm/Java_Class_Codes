package familyStructure;

public class Father extends Husband implements FatherMotherProperty {
	
	private int childrens;
	
	public Father ( String fullName, String occupation, int age, int childrens ) {
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
