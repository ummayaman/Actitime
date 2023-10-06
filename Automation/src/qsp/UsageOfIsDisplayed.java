package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement image= driver.findElement(By.xpath("//img[contains(@class,'fb')]"));
		 boolean result=image.isDisplayed();
		 if(result)
		 {
			 System.out.println("Web element is Displayed");
		 }
		 else
		 {
			 System.out.println("Web element is not Displayed");
		 }
		
	}

}
