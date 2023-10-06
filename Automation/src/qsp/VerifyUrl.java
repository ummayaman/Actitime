package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String Url=driver.getCurrentUrl();
		if(Url.equals("https://www.selenium.dev/"))
		{System.out.println("Url is naviagting successfully and pass");
		
		}
		else
		
		{
			System.out.println("Url is not naviagting succesfully and fail");
		}
		driver.quit();
				
		
	}
}


