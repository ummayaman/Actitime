package qsp1;

import org.openqa.selenium.WebDriver;

public class Title
{
	static void testA(WebDriver driver)
	{
		driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println(title);
		

			
	}
	
}
	


