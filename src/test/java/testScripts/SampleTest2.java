package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.TestBase;

public class SampleTest2 extends TestBase{
	
WebDriver driver;
	
	
	@BeforeClass
	public void setUp(){
		initialization();
			ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void executeTest(){
		
		
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println("test");
		boolean flag=driver.findElement(By.xpath("//input[@name='s']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
