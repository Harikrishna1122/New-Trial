package pizza.dominos.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {
	public WebDriver driver;
	@BeforeTest
	@Parameters({"browser","appurl"})
	public WebDriver launchbrowser(String browser,String appurl) {
       if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
    	   driver = new ChromeDriver();
       
       
       }
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
       driver.navigate().to(appurl);
       WebDriverWait cool = new WebDriverWait(driver,30);
		cool.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_dpz\"]/header/nav[1]/div[1]/ul/li[1]/a")));
		return driver;
		 
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
		
	}
	

}
