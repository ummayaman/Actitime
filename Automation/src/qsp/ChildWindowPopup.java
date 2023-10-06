package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		String Wh = driver.getWindowHandle();
		Thread.sleep(2000);
		System.out.println(Wh);
		driver.quit();
		

	}

}
