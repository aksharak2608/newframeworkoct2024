package day2;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import helper.util;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=util.launchapplication("https://www.theknowledgeacademy.com/blog/demo-website-for-automation-testing");
		//driver.findElement(By.xpath("//input[@id='nameEnqNews']")).sendKeys("hi");
		System.out.println(driver.findElement(By.id("nameEnqNews")).isDisplayed());
		if(driver.findElement(By.id("nameEnqNews")).isDisplayed())
		{
		driver.findElement(By.id("nameEnqNews")).sendKeys("hi");
		}
		Select number=new Select(driver.findElement(By.xpath("//select[@class='country-code-new']")));
		number.selectByIndex(2);
		
		number.selectByValue("QA");
		
		number.selectByVisibleText("GB   -   United Kingdom");
		List<WebElement>opt=number.getOptions();
		for(WebElement ele:opt)
		{
			System.out.println(ele.getText());
		}

		JavascriptExecutor je= (JavascriptExecutor)driver;
	//	je.executeScript("window.scrollBy(0,3000)");
		WebElement ele=driver.findElement(By.xpath("//p[text()='Popular Training Categories']"));
		je.executeScript(" arguments[0].scrollIntoView(true); ", ele);
		
		//driver.close();
	}

}
