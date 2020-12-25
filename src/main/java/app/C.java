package app;

public class C {
	double n1;
	double n2;
	
	public C() {
		System.out.println("Ctor di kelas C");
	}
	
	public C(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int add(int n1, int n2) {
		A a = new A();
		return a.add(n1, n2);
	}
	
	public int sub(int n1, int n2) {
		A a = new A();
		return a.sub(n1, n2);
	}
	
	public double mul(double n1, double n2) {
		B b = new B();
		return b.mul(n1, n2);
	}
	
	public double div(double n1, double n2) {
		B b = new B();
		return b.div(n1, n2);
	}
	
	public String toString() {
		return "toString di kelas C";
	}

}
