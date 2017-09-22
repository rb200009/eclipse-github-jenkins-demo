package ssgs;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorTest {

	@Test
	public void testConCat() {
		String expected = "SubodhSohoni";
		Validator val = new Validator();
		String actual = val.ConCat("Subodh", "Sohoni");
		assertEquals(expected, actual);
	}

}
