package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Multi%20Select%20list%20box.html");
		WebElement slvListbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		WebElement fsOption = s.getFirstSelectedOption();
		Thread.sleep(2000);
		String text = fsOption.getText();
		System.out.println(text);
		driver.quit();
		
	}

}
