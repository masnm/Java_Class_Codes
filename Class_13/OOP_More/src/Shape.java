
public abstract class Shape {
	
	public double PI = 3.14159;
	
	protected String name;
	
	protected Shape ( String name ) {
		this.name = name;
	}
	
	public void showInfo () {
		System.out.println ( this.name );
	}
}
