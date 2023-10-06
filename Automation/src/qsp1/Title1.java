package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		Title.testA(driver);
		WebDriver driver1 =new FirefoxDriver();
		Title.testA(driver1);
		
		
	}

}
