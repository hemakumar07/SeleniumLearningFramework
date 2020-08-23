package Test.NewTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
	


	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\Project_Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}

	@Test(priority = 2, groups= "smoke")
	public void test1() {
		System.out.println(driver.getTitle());
		System.out.println("**************");

	}

	@Test(priority = 1, groups= "smoke")
	public void test2() {
		System.out.println(driver.getClass());
		System.out.println("**************");

	}

	@Test(priority = 3, groups= "regression")
	public void test3() {
		System.out.println(driver.getCurrentUrl());
		System.out.println("**************");

	}

	@AfterMethod
	private void tearDown() {
		driver.quit();

	}


}
