package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText 
{

	public static void main(String[] args) 
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.opensourcebilling.org/");
		Driver.findElement(By.id("email")).clear();
	}
		
		

}



