package MyPkg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ValidatorTest {
	
	public static void main()
	{
		JUnitCore jCore = new JUnitCore();
		@SuppressWarnings("unused")
		Result result = jCore.run(ValidatorTest.class);
		
	}
	@Test
    public void TestValidate()
	{
		Boolean actual, expected=true;
		Validator val = new Validator();
		actual = val.Validate("Gouri", "Sohoni2");
		assertEquals(expected,actual);
	}
}