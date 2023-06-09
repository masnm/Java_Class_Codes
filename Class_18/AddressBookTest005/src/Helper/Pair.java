package Helper;

public class Pair <T, U> {
	
	private T t;
	private U u;
	
	public Pair ( T t, U u ) {
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}
	
	public Pair<T,U> getNew () {
		return new Pair<T, U> ( this.t, this.u );
	}
	
}
