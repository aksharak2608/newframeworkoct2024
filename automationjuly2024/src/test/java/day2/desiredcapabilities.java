package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
public class desiredcapabilities {
@Test
	public void test(){
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();

		
	ChromeOptions opt=new ChromeOptions();
	opt.setAcceptInsecureCerts(true);
	opt.addArguments("start-maximized");
	//opt.addArguments("headless");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://demo.guru99.com/test/newtours/");
	String linkname="//a[text()='%s']";
	String grid="//a[text()='%s']//ancestor::tr[@class='mouseOver' or @class='mouseOut']";
	//WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	//WebElement grid=driver.findElement(By.xpath("//a[text()='Flights']//ancestor::tr[@class='mouseOver' or @class='mouseOut']/td[@width='20']"));
WebElement link=driver.findElement(By.xpath(String.format(linkname, "Home")));
WebElement gridforcolor=driver.findElement(By.xpath(String.format(grid, "Home")));
Actions act= new Actions(driver);
Action move=(Action) act.moveToElement(link).build();
move.perform();
WebElement link1=driver.findElement(By.xpath(String.format(linkname, "Flights")));
WebElement gridforcolor1=driver.findElement(By.xpath(String.format(grid, "Flights")));
Actions act1= new Actions(driver);

System.out.println(gridforcolor1.getAttribute("class"));
Action move1=(Action) act1.moveToElement(link1).build();
move1.perform();
System.out.println(gridforcolor1.getAttribute("class"));

act1.contextClick().build().perform();
}
}
