package com.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Tc_01 {
	@Test
	public static void launchbrowser()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		
	}
	
	
	
}
