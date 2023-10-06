package qsp;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithDuplicates 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/DELL/Desktop/Multi%20Select%20list%20box.html");
		 WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		 Set<String> set = new HashSet();
		    ArrayList<String> al = new ArrayList<>();
				   Select s=new Select(mtrlistbox);
		  java.util.List<WebElement> allOptions = s.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			if(!set.add(text))
				al.add(text);}
		for(String str:al)
		{
		
			System.out.println(str);
		}
	}
}	
		
		

	
