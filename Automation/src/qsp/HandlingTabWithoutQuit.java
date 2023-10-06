package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabWithoutQuit {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
        Set<String> allwh = driver.getWindowHandles();
        Thread.sleep(5000);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
		
	}

}
