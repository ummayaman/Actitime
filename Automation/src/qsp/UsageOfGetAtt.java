package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAtt 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		WebElement link=driver.findElement(By.xpath("//a[text()='Forgotten password?']"
				));
				String Value=link.getAttribute("href");
			    String Tag = link.getTagName();
		        System.out.println(Value);
		        System.out.println(Tag);
		        driver.quit();
	}
		        
				
		
	}


