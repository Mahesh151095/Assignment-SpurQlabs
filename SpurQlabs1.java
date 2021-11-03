package Generic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SpurQlabs1{
	

	public class Generic
	{
	   public WebDriver driver;
		@BeforeMethod
		public void open()
		{
			System.setProperty("webdriver.chrome.driver","./Scriptsbrooo/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.calculator.net/");
		}
		
		@AfterMethod
		public void close()
		{
			driver.quit();
		}



	}


}
