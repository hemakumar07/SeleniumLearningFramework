package Test.NewTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnotationUsage {
	
	WebDriver driver;
	
	
	@Test
	@Parameters({"url", "username", "password"})
	public void login(String url , String username,String password) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Project_Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.quit();
		
		
		

	}

}
