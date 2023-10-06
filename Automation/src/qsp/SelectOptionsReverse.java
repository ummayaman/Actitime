package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionsReverse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Multi%20Select%20list%20box.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions=s.getOptions();
		int count= allOptions.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}
		
		}
		
		
}
		
	


