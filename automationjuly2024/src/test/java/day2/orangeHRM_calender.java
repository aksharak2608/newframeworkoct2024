package day2;



import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import helper.util;

public class orangeHRM_calender {

	public static void main(String[] args){
		
		WebDriver driver=util.launchapplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By username=By.xpath("//*[contains(@class,'oxd-input oxd')][@name='username']");
		try {
		driver=util.waitforelementBy(driver, username);
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("Admin");
		WebElement passWB=driver.findElement(By.xpath("//*[contains(@class,'oxd-input oxd')][@name='password']"));
		
		driver=util.waitforelementWE(driver, passWB);
		passWB.clear();
		passWB.sendKeys("admin123");

		util.screenshot(driver);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		System.out.println("title is"+driver.getCurrentUrl());
		
	/*	driver=util.waitforelementBy(driver, By.xpath("//a[contains(@class,'oxd-main-menu-item')]/span[text()='My Info']"));
		driver.findElement(By.xpath("//a[contains(@class,'oxd-main-menu-item')]/span[text()='My Info']")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space'][div/label[text()='License Expiry Date']]//input")).click();
		String day="//div[@class='oxd-input-group oxd-input-field-bottom-space'][div/label[text()='License Expiry Date']]//div[contains(@class,'oxd-calendar-date-wrapper')]/div[text()='%s']";
		driver.findElement(By.xpath(String.format(day, 10))).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space'][div/label[text()='License Expiry Date']]//input")).click();
		driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/p")).click();
		Thread.sleep(Duration.ofSeconds(5));
		List<WebElement>mm=driver.findElements(By.xpath("//ul[@class='oxd-calendar-selector']/li/ul/li[contains(@class,'oxd-calendar-dropdown--option')]"));
		for(WebElement ele:mm)
		{
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("August"))
			{
				ele.click();
				break;
			}
		}
		
		driver.findElement(By.xpath(String.format(day, 21))).click();
		
		//copy(src,dest);
		*/
		
		
		
		}catch(Exception e )
		{
			System.out.println( e);
		}
		
		
		
	}

}
