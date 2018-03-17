import static org.junit.Assert.*;

import org.junit.Test;

public class TestProbaClasea {

	@Test
	public void test() {
		ProbaClasea proba = new ProbaClasea(1, 5);
		assertEquals(1, proba.getCod());
		assertEquals(5, proba.getValue());
	}

}
