import static org.junit.Assert.*;

import org.junit.Test;

import app.A;

public class testA {

	@Test
	public void test() {
		A a = new A();
		int hasil = a.add(1, 2);
		assertEquals(3, hasil);
	}
	
	@Test
	public void test2() {
		A a = new A();
		int hasil = a.sub(3, 1);
		assertEquals(2, hasil);
	}

}
