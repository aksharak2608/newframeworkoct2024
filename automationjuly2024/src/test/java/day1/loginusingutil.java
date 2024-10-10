package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.util;

public class loginusingutil {

	public static void main(String[] args) throws InterruptedException {
		loginusingutil obj= new loginusingutil();
		
		// TODO Auto-generated method stub
		WebDriver driver=util.launchapplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		By username=By.xpath("//*[contains(@class,'oxd-input oxd')][@name='username']");
		//un.clear();
	//	un.sendKeys("Admin");
		driver=obj.waitforelementBy(driver, username);
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys("Admin");
		WebElement passWB=driver.findElement(By.xpath("//*[contains(@class,'oxd-input oxd')][@name='password']"));
		By pass=By.xpath("//*[contains(@class,'oxd-input oxd')][@name='password']");
		//pass.clear();
		//pass.sendKeys("admin123");
		driver=util.waitforelementWE(driver, passWB);
	//	driver=obj.waitforelementBy(driver, pass);
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
	}

	public WebDriver waitforelementBy(WebDriver driver, By ele)
	{
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(ele));
		
		return driver;
		
	}
}
