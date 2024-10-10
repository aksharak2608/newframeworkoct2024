package day2;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Mypage {
    public static WebDriver driver;

    // Initialize elements using @FindBy
    @FindBy(xpath = "//*[contains(@class,'oxd-input oxd')][@name='username']")
    public static WebElement usernameInput;

    public static void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys(username);
    }
    @Test
    public void test() throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();

		
		ChromeOptions opt=new ChromeOptions();
		driver= new ChromeDriver(opt);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(Duration.ofSeconds(30));
    	enterUsername("Admin");
    }

    
}
