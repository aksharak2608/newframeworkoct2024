package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicseleniumscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\training\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(7000);
	driver.manage().window().fullscreen();
	System.out.println(driver.getTitle());
	//WebElement ele=driver.findElement(By.xpath("//p[contains(@class,'oxd-text')][text()='Forgot your password? ']"));
//	ele.click();
	
	driver.findElement(By.xpath("//p[contains(@class,'oxd-text')][text()='Forgot your password? ']")).click();
//	ele.click();
	
	
	System.out.println(driver.getTitle());
	driver.navigate().to("https://www.google.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	}

}
