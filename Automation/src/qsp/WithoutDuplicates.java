package qsp;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicates 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Multi%20Select%20list%20box.html");
		WebElement mtrListbox= driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		Set<String> set = new TreeSet<String>();
		List<WebElement>allOptions=s.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement ele = allOptions.get(i);
			String text= ele.getText();
			set.add(text);
		
			for(String string :set)
			{
	
				System.out.println(string);
			}
		}
				
		
	

	}
}
