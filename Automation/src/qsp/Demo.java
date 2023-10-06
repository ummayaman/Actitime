package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.instagram.com");
		driver.get("https://www.facebook.com");
	    driver.get("https://www.twitter.com");
	    driver.get("https://www.youtube.com");
	    String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
