package TADavanzados;

public class Tupla<T1 , T2> {
	private  T1 t1;
	private  T2 t2;
	
	public Tupla(T1 x, T2 y) {
		this.t1=x; 
		this.t2=y;
	}

	public T1 getT1() {
		return t1;
	}
	public T2 getT2() {
		return t2;
	}

	public void setT1(T1 t1) {
		this.t1 = t1;
	}

	public void setT2(T2 t2) {
		this.t2 = t2;
	}

	@Override
	public String toString() {
		return "TuplaIntegerInteger [" + t1.toString() + "," + t2.toString() + "]";
	}
	
	@Override
	public boolean equals (Object o) {
	if(o.getClass()!=this.getClass()) 
		return false;
	Tupla nueva=(Tupla) o;
	if (!(nueva.t1.equals(this.t1))) {
		return false;
	}
	if (!(nueva.t2.equals(this.t2))) {
		return false;
	}
	return true;
	}
	}