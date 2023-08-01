
public class Dog extends Anymal {
	
	public Dog () {
		super ( true );
	}
	
	@Override
	public boolean canMakeNoise() {
		System.out.println ( "From Dog" );
		return super.canMakeNoise;
	}

}
