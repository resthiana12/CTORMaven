import static org.junit.Assert.*;

import org.junit.Test;

import app.D;

public class testD {

	@Test
	public void test() {
		D d = new D();
		assertEquals("toString di kelas D", d.toString());
	}
	
	@Test
	public void test2() {
		D d = new D();
		double hasil = d.pow(1, 2);
		assertEquals(3.0, hasil);
	}

}
