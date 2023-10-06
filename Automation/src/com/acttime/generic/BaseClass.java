package com.acttime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.Loginpage;

public class BaseClass 
{
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("OpenBrowser",true);
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}
	@BeforeMethod
	public void login() throws IOException
	{
	Reporter.log("login",true);
	Filelib f=new Filelib();
    
	 String Url = f.getPropertyData("Url");
	 String Un = f.getPropertyData("Username");
	String Pw = f.getPropertyData("Password");
	driver.get(Url);
	Loginpage l=new Loginpage(driver);
	l.setLogin(Un,Pw);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
	}
		
		@AfterTest
		public void closeBrowser() {
			Reporter.log("CloseBrowser",true);
			driver.close();
		}
	}
	
	
	
	
	
