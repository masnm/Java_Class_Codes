
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Line line = new Line ( "Line" );
		Triangle tri = new Triangle ( "Triangle" );
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		for ( int i = 0; i < 3; i++ ) {
			shapes.add(  new Line ( "Line " + (i+1) ) );
		}
		
		for ( int i = 0; i < 3; i++ ) {
			shapes.add( new Triangle ( "Triangle " + (i+1) ) );
		}
		
		for ( int i = 0; i < shapes.size(); i++ ) {
			shapes.get(i).showInfo();
		}
		
		/*
		Line[] lines = new Line[3];
		for ( int i = 0; i < 3; i++ ) {
			lines[i] = new Line ( "Line " + (i+1) );
		}
		for ( int i = 0; i < 3; i++ ) {
			lines[i].showInfo();
		}
		
		Triangle[] triangles = new Triangle[3];
		for ( int i = 0; i < 3; i++ ) {
			triangles[i] = new Triangle ( "Triangle " + (i+1) );
		}
		for ( int i = 0; i < 3; i++ ) {
			triangles[i].showInfo();
		}
		*/
	}

}
