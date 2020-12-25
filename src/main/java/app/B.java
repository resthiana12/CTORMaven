package app;

import app_Interface.MulAndDivInterface;

public class B implements MulAndDivInterface{

	public B() {
		System.out.println("Ctor di kelas B");
	}
	
	public String toString() {
		return "toString di kelas B";
	}

	public double mul(double n1, double n2) {
		return n1*n2;
	}

	public double div(double n1, double n2) {
		return n1/n2;
	}
	
}
