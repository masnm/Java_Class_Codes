package CompileTime;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MyException ( String s ) {
		super ( s );
	}
	
	public MyException ( int number ) {
		super ( "Error found with number : " + number );
	}
	
	public MyException ( double number ) {
		super ( "Error found with real nummber : " + number );
	}

}
