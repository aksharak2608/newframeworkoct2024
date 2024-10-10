package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.util;

public class frames {
	@FindBy(xpath="//input[@name='myCountry']")
	WebElement Autoc;
	static By Autoc1=By.xpath("//input[@name='myCountry']");
	static By dpvalues=By.xpath("//div[@id='myInputautocomplete-list']/div");
	static By tryit=By.xpath("//button[text()='Try it']");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=util.launchapplication("https://practiceseleniumelements.blogspot.com/2021/08/iframes.html");
		driver.switchTo().frame("autocomplete");
		driver.findElement(Autoc1).sendKeys("in");
		List<WebElement> dp=driver.findElements(dpvalues);
		for(WebElement ele:dp)
		{
			System.out.println(ele.getText());
			if((ele.getText()).equalsIgnoreCase("Indonesia"))
			{
			ele.click();
			break;
			}
		
		}
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='simplealert']")));
		driver=util.waitforelementBy(driver, tryit);
		driver.findElement(tryit).click();
		
		
	}

}
