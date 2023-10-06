package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled 
{
public static void main(String[] args) throws InterruptedException 
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	boolean res=driver.findElement(By.xpath("//div[text()='Login']/..")).isEnabled();
	if(res)
	{
		System.out.println("Login butoon is Enabled");
		
	}
	else
	{
		System.out.println("Login button is disabled");
	}
		
		

	}

}
