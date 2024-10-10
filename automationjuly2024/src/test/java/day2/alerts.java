package day2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.util;

public class alerts {
	@FindBy(xpath="//input[@name='myCountry']")
	WebElement Autoc;
	static By Autoc1=By.xpath("//input[@name='myCountry']");
	static By dpvalues=By.xpath("//div[@id='myInputautocomplete-list']/div");
	static By tryit=By.xpath("//button[text()='Try it']");
	static By ConfirmAlert=By.xpath("//button[text()='Confirm Alert']");

	static By PromptAlert=By.xpath("//button[text()='Prompt Alert']");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=util.launchapplication("https://practiceseleniumelements.blogspot.com/2021/08/iframes.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='simplealert']")));
		driver=util.waitforelementBy(driver, tryit);
		driver.findElement(tryit).click();
		Alert alt= driver.switchTo().alert();
		alt.accept();
		driver.findElement(tryit).click();
		alt.dismiss();
		driver.findElement(ConfirmAlert).click();
		alt.accept();
		driver.findElement(ConfirmAlert).click();
		alt.dismiss();
		driver.findElement(PromptAlert).click();
		alt.sendKeys("akshara");
		alt.accept();
		
		
	}

}
