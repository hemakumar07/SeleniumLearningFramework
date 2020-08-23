package Test.NewTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedExceptions {
WebDriver driver;
	
	@Test(expectedExceptions = ArithmeticException.class)	
	public void setUp() {
		int i=9;
		int j=i/0;	
		System.out.println(j);
	}
	
	

	@Test(dependsOnMethods = "setUp")
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Project_Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}


}
