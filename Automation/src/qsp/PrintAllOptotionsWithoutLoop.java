package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptotionsWithoutLoop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Multi%20Select%20list%20box.html");
		   WebElement mtrListbox = driver.findElement(By.id("mtr"));
		   Select s= new Select(mtrListbox);
		   Thread.sleep(2000);
		   String text = s.getWrappedElement().getText();
		   System.out.println(text);
		   driver.quit();
		   
		   
	}

}
