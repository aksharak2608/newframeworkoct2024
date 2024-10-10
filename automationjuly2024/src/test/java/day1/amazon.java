package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		amazon obj= new amazon();
		WebDriver driver=obj.launchapplication("https://www.amazon.ca");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		//driver.manage().window().fullscreen();

		//WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		By logo=By.xpath("//a[@id='nav-logo-sprites']");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(logo));
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Deals Store')]")).click();
		
	}
	
	
	public WebDriver launchapplication(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\training\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		//Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(20000));
		
		return driver;
		
	}

}
