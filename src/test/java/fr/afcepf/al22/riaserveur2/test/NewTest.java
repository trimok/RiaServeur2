package fr.afcepf.al22.riaserveur2.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://www.guru99.com/selenium-tutorial.html");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Free Selenium Tutorials"));
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver", "D:\\logiciels\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		// driver = new InternetExplorerDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
