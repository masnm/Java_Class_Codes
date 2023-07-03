
public class Cat extends Anymal {
	
	public Cat ( String name ) {
		super ( name );
	}
	
	@Override
	public void bark () {
		System.out.println ( "Name : " + super.name );
		System.out.println ( "Sound is : Meow" );
	}
}
