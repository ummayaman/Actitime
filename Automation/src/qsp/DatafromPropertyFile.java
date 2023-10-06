package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatafromPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./data/Commondata.Property");
		Properties p=new Properties();
		p.load(fis);
		String Url = p.getProperty("Url");
		String Uname = p.getProperty("Username");
		String Pwd = p.getProperty("Password");
		System.out.println(Url);
		System.out.println(Uname);
		System.out.println(Pwd);
		
				
		

	}

}
