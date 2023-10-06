package handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertorjavascript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		 Alert a = driver.switchTo().alert();
		 String text=a.getText();
		 a.accept();
		 System.out.println(text);
		 Thread.sleep(1000);
		 driver.quit();	
		
	}

}
