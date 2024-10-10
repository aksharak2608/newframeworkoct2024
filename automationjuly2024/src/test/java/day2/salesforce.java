package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.util;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=util.launchapplication("https://sohohouse--devssc.sandbox.my.salesforce.com");
		WebElement username=driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']"));
		username.sendKeys("suharika.chakka@sohohouse.com.devssc");
		WebElement pass=driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']"));
		pass.sendKeys("Salesforce@1234");
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		driver=util.waitforelementBy(driver,By.xpath("//a/span[text()='Home']"));
		
		//Navigate to subscription and create a subscription.
		driver.navigate().to("https://sohohouse--devssc.sandbox.lightning.force.com/lightning/o/SH_Subscription__c/list?filterName=__Recent");
		//driver.findElement(By.xpath("//a/span[text()='Subscriptions']")).click();
		
		driver=util.waitforelementBy(driver,By.xpath("//div[@class='actionsWrapper slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small']//li[@class='slds-button slds-button--neutral slds-button_neutral']/a/div[text()='New']"));
		driver.findElement(By.xpath("//div[@class='actionsWrapper slds-col slds-no-flex slds-grid slds-align-top slds-p-bottom--xx-small']//li[@class='slds-button slds-button--neutral slds-button_neutral']/a/div[text()='New']")).click();
		
	}

}
