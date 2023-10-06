package qsp1;

import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlwithoutGet 
{

	public static void main(String[] args) throws  InterruptedException
	{
		ChromeDriver driver =new ChromeDriver(); 
		driver.navigate().to("http://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("http://www.gmail.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}
}


