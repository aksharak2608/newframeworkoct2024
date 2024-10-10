package day2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import helper.util;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentwait {
	
	@Test
	
	public void test()
	{
		//WebDriver driver=util.launchapplication("https://practiceseleniumelements.blogspot.com/2021/06/blog-post.html");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practiceseleniumelements.blogspot.com/2021/06/blog-post.html");
		driver.findElement(By.xpath("//button[text()='Display timed text']")).click();
		
		
		
		FluentWait<WebDriver> fw= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(WebDriverException.class);


		WebElement ele=fw.until(new Function<WebDriver, WebElement>()
				{
			 public WebElement apply(WebDriver driver) {
				 
				 WebElement opele=driver.findElement(By.xpath("//div[@id='txt'][text()='Selenium']"));
				return opele;
				 
			 }
				});

		 
	}

}
