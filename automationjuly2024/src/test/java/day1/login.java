package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(20000));
		//Thread.sleep(2000);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//driver.manage().window().fullscreen();
		WebElement un=driver.findElement(By.xpath("//*[contains(@class,'oxd-input oxd')][@name='username']"));
		un.clear();
		un.sendKeys("Admin");
		
		WebElement pass=driver.findElement(By.xpath("//*[contains(@class,'oxd-input oxd')][@name='password']"));
		pass.clear();
		pass.sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
	}

}
