
public class BigCat extends Cat implements FlyingExt, NoiseMakeExt {

	@Override
	public boolean canFly() {
		return super.canMakeNoise;
	}
	
	@Override
	public boolean canMakeNoise() {
		System.out.println ( "From BigCat" );
		return super.canMakeNoise;
	}

}
