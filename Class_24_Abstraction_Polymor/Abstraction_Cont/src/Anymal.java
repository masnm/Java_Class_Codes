
public class Anymal extends LivingThing implements NoiseMakeExt {
	
	protected boolean canMakeNoise;
	
	public Anymal ( boolean canMakeNoise ) {
		super ( "A New Anymal" );
		this.canMakeNoise = canMakeNoise;
	}

	@Override
	public boolean canMakeNoise() {
		System.out.println ( "From anymal" );
		return this.canMakeNoise;
	}

}
