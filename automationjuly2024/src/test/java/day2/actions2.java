package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
public class actions2 {
@Test
	public void test(){
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();

		
	WebDriver driver = new ChromeDriver();
	driver.get("https://practiceseleniumelements.blogspot.com/2021/08/mouse-actions.html");
	Actions act= new Actions(driver);
	act.doubleClick(driver.findElement(By.xpath("//button[@id='demo']"))).build().perform();
	WebElement src=driver.findElement(By.xpath("//button[@id='drag1']"));
	WebElement dest=driver.findElement(By.xpath("//div[@id='div1']"));
	act.dragAndDrop(src, dest).build().perform();
	
}
}
