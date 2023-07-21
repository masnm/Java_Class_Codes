import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		Anymal MyDog = new Dog ();
		MyDog.makeNoise();
		
		Cat myCat = new Cat ();
		myCat.makeNoise();
		*/
		ArrayList<Anymal> anymals = new ArrayList<>();
		anymals.add( new Cat() );
		anymals.add( new Dog() );
		anymals.add( new Cat() );
		
		for ( int i = 0; i < anymals.size(); i++ ) {
			Anymal anymal = anymals.get(i);
			anymal.makeNoise();
		}

	}

}
