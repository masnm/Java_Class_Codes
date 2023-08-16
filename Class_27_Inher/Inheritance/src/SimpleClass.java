
/*
[access modifier] [ class ] [ className ] {
	
}
*/

public class SimpleClass {
	
	private int value;
	
	public SimpleClass ( int value ) {
		this.value = value;
	}
	
	public SimpleClass ( String abc ) {
		this.value = 0;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
