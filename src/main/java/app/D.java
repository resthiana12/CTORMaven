package app;

import app_Interface.PowInterface;

public class D implements PowInterface{
	
	public D() {
		System.out.println("Ctor di kelas D");
	}
	
	public String toString() {
		return "toString di kelas D";
	}

	public double pow(double n1, double n2) {
		return Math.pow(n1, n2);
	}
}
