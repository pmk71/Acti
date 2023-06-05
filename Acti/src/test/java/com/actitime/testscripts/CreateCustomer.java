package com.actitime.testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
static
{
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe" );
}
	@Test
	public void createCustomer()
	{
		Reporter.log("Created",true);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
