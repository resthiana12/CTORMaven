import static org.junit.Assert.*;

import org.junit.Test;

import app.B;


public class testB {

	@Test
	public void test() {
		B b = new B();
		double hasil = b.mul(1, 3);
		assertEquals(3, hasil);
	}
	
	@Test
	public void test2() {
		B b = new B();
		double hasil = b.div(3, 1);
		assertEquals(3, hasil);
	}

}
