package Test.NewTestNG;

import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.ExpectedExceptionsHolder;

public class DependsOnMethod {

	WebDriver driver;
	
	@Test()	
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
