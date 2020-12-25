import static org.junit.Assert.*;

import org.junit.Test;

import app.C;

public class testC {

	@Test
	public void test() {
		C c = new C();
		assertEquals("toString di kelas C", c.toString());
	}
	
	@Test
	public void test2() {
		C c = new C();
		int hasil = c.add(1, 2);
		assertEquals(3, hasil);
	}

}
