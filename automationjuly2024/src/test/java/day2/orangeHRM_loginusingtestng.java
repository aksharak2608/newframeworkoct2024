package day2;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM_loginusingtestng {
	WebDriver driver;
	@Test
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();

		
		ChromeOptions opt=new ChromeOptions();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
@Test(dependsOnMethods ="launchbrowser" )
	public void login()
	{

		By username=By.xpath("//*[contains(@class,'oxd-input oxd')][@name='username']");
		
		driver=util.waitforelementBy(driver, username);
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("Admin");
		WebElement passWB=driver.findElement(By.xpath("//*[contains(@class,'oxd-input oxd')][@name='password']"));
		
		driver=util.waitforelementWE(driver, passWB);
		passWB.clear();
		passWB.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		System.out.println("title is"+driver.getCurrentUrl());
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index1";
		//Assert.assertEquals(url, driver.getCurrentUrl());
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(url, driver.getCurrentUrl());
		sa.assertAll();
	}
@Test(dependsOnMethods = "login")
	public void abc()
	{
		driver=util.waitforelementBy(driver, By.xpath("//a[contains(@class,'oxd-main-menu-item')]/span[text()='My Info']"));
		driver.findElement(By.xpath("//a[contains(@class,'oxd-main-menu-item')]/span[text()='My Info']")).click();
		//Thread.sleep(Duration.ofSeconds(5));
		String rb="//div[@class='--gender-grouped-field']/div//label";
		String rb_input=rb+"/input";
		util.waitforelementBy(driver, By.xpath(rb_input));
		System.out.println(rb_input);
		List<WebElement> radio= driver.findElements(By.xpath(rb_input));
		List<WebElement>radio_lablels=driver.findElements(By.xpath(rb));
		for(int i=0;i<radio.size();i++)
		{
			if(radio.get(i).isSelected()==true)
			{
				System.out.println( radio_lablels.get(i).getText());
			}
			else
			{
				radio_lablels.get(i).click();
				System.out.println( radio_lablels.get(i).getText()+" is selected");
			}
		}
		
		/*String cb="//div/label[text()='Smoker']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div/label[text()='Yes']";
		if(driver.findElement(By.xpath(cb+"/input")).isSelected()==true)
		{
			System.out.println(driver.findElement(By.xpath(cb)).getText()+" is selected.");
		}
		else
		{
			driver.findElement(By.xpath(cb)).click();
			System.out.println( driver.findElement(By.xpath(cb)).getText()+" is selected");
		}
		*/
		
	}

}
