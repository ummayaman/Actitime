package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWithoutQuit {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allWh = driver.getWindowHandles();
		for(String Wh:allWh)
		{
			driver.switchTo().window(Wh);
			Thread.sleep(5000);
			driver.close();
		}
		
		

	}

}
