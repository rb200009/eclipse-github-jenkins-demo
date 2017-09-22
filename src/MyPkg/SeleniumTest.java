package MyPkg;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
	//WebDriver driver=null;
		//@Test
		//public void TestGoogle() throws InterruptedException
		//{
		//	System.setProperty("webdriver.chrome.driver", "c:/junit/chromedriver.exe");
		//	ChromeOptions options = new ChromeOptions();
		//	options.addArguments("--start-maximized");
			
		//	driver = new ChromeDriver(options);
		//	driver.get("http://www.google.com");
		//	Thread.sleep(4000);
		//	driver.quit();
		//}
		WebDriver driver;
		@Test
		public void TestSSGSWeb() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "c:/junit/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
			driver.get("http://localhost:8080/ssgs-ems-profile-editor");
			WebElement elementName = driver.findElement(By.name("uname"));
			elementName.sendKeys("Gouri");
			elementName.sendKeys(Keys.TAB);
			WebElement elementPwd= driver.findElement(By.name("pwd"));
			elementPwd.sendKeys("Sohoni");
			elementPwd.sendKeys(Keys.TAB);
			WebElement elementLogin = driver.findElement(By.name("submoit"));
			elementLogin.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			driver.quit();
		}
}
