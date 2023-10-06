package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTitles {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button"));
		Set<String> allWh = driver.getWindowHandles();
		for(String Wh:allWh)
		{
			driver.switchTo().window(Wh);
			String Title=driver.getTitle();
			System.out.println(Title);
		}
		driver.quit();
		
	}

}
