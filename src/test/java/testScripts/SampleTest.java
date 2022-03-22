package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;

public class SampleTest extends TestBase{
	
	
	@BeforeTest
	public void setUp(){
		initialization();	
	}
	
	@Test
	public void executeTest(){
		
	}
	
	@AfterTest
	public void tearDown(){
		
	}

}
