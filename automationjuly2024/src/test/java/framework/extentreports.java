package framework;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreports {

	@Test
	
	public void test()
	{
		// path where output is to be printed
		ExtentHtmlReporter html = new ExtentHtmlReporter("D:\\training\\automationjuly2024\\reports\\Extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest logger= extent.createTest("This is a login test");
		logger.log(Status.PASS,"test passed");
		ExtentTest logger1= extent.createTest("This is a login test");
		logger1.log(Status.FAIL,"test failed");

		try {
			logger1.fail("test",MediaEntityBuilder.createScreenCaptureFromPath("D:\\training\\automationjuly2024\\screenshots\\0.9808580989340361.png")
			.build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent.flush();

	}
}
