package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class properties {
	
	
	@Test
	public void test()
	{
		File src= new File("D:\\training\\automationjuly2024\\Testdata\\abc.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			Properties pro=new Properties();
			pro.load(fis);
			System.out.println( pro.get("name"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		@Test
		public void test1()
		{
			
			try {
				Properties pro=new Properties();
				new Properties().load(new FileInputStream(new File("D:\\training\\automationjuly2024\\Testdata\\abc.properties")));
				System.out.println( pro.get("name"));
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}

}
