package pizza.dominos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderonline {
	WebDriver driver;
	public orderonline(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="// ul[@data-quid='header-main-navigation-desktop']//li[@class='nav__menu-item order']")
    WebElement onlineorder;
	@FindBy(xpath="//img[@alt='Delivery']")
	WebElement delivery;
	@FindBy(xpath="//select[@id='Address_Type_Select']")
	WebElement seladdress;
	@FindBy(xpath="//input[@id='Street']")
	WebElement staddres;
	@FindBy(xpath="//input[@id='Address_Line_2']")
	WebElement aptno;
	@FindBy(xpath="//input[@id='City']")
	WebElement city;
	@FindBy(xpath="//select[@id='Region']")
	WebElement province;
	@FindBy(xpath="//input[@id='Postal_Code']")
	WebElement code;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	public void deliverypage() throws InterruptedException {
		onlineorder.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Delivery']")));
		delivery.click();
		
		
		  Select dropdown = new Select(seladdress);
		  dropdown.getOptions().get(1).click();
		  staddres.sendKeys("knight Street");
		  aptno.sendKeys("7216");
		  city.sendKeys("Vancouver");
		  Select dropdown2 = new Select(province);
		  dropdown2.getOptions().get(1).click();
		  code.sendKeys("V5P2W8");
		  submit.click();
		  Thread.sleep(5000);
		  System.out.println("working fine");
		/*
		 * WebDriverWait cool = new WebDriverWait(driver,30);
		 * cool.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//ul[@data-quid ='header-main-navigation-desktop']//a[@class='navigation-entrees c-site-nav-main-link-1 active']"
		 * )));
		 */
		 
	}
	
	
	
	
}
