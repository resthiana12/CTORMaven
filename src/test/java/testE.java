import static org.junit.Assert.*;

import org.junit.Test;

import app.E;

public class testE {

	@Test
	public void test() {
		E e = new E();
		assertEquals("toString di kelas E", e.toString());
	}
	
	@Test
	public void test2() {
		E e = new E();
		assertEquals(true, e.conntains("ada"));
	}

}
