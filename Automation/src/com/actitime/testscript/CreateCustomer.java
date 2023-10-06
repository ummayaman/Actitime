package com.actitime.testscript;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.EnterTimeTrackPage;

@Listeners(com.acttime.generic.ListenerImplementation.class)
public class CreateCustomer 
{
	@Test
	public void testcreatecustomer() throws InterruptedException
	{
		Reporter.log("createcustomer",true);
		Thread.sleep(3000);
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		
		Thread.sleep(3000);
	}
	

}
