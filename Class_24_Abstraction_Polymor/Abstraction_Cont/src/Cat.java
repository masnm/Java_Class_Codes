
public class Cat extends Anymal {
	
	public Cat () {
		super ( true );
	}
	
	@Override
	public boolean canMakeNoise() {
		System.out.println ( "From cat" );
		return super.canMakeNoise;
	}
}
