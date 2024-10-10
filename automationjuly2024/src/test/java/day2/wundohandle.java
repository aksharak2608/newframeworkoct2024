package day2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.util;

public class wundohandle {
static By links=By.xpath("//div[@class='orangehrm-login-footer-sm']/a");
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=util.launchapplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentwindow=driver.getWindowHandle();
		Thread.sleep(3000);
		List<WebElement>lllinks=driver.findElements(links);
		for(WebElement ele:lllinks)
		{
			ele.click();
		}
		Set<String> childwin=driver.getWindowHandles();
		for(String win:childwin)
		{
			if(!parentwindow.equalsIgnoreCase(win))
			{
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				driver.close();
			
			}
		}
		
		
	}

}
