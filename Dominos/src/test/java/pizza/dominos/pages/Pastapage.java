package pizza.dominos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pastapage {
	WebDriver driver;
	public Pastapage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@data-quid ='header-main-navigation-desktop']//a[@class='navigation-entrees c-site-nav-main-link-1 active']")
	WebElement entrees;
	@FindBy(xpath="//h2[@data-quid='entree-title-pasta']")
	WebElement pasta;
	@FindBy(xpath="//a[@data-dpz-track-evt-name='Order CTA | Chicken Alfredo']")
	WebElement order;
	@FindBy(xpath="//button[@data-quid='builder-default-add-to-order']")
	WebElement addtoorder;
	@FindBy(xpath="//div[@class='form__control-group--actions--aligncenter']")
	WebElement checkout;
	@FindBy(xpath="//a[@class='btn btn--large btn--block btn--continue-checkout submitButton qa-OrCheck js-continueCheckout c-order-continueCheckout']")
	WebElement continuecheck;
	
	
	public void orderpasta() throws InterruptedException {
		entrees.click();
		Thread.sleep(3000);
		System.out.println("hi");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(1000);
		 
		pasta.click();
		order.click();
		//WebDriverWait cool1 = new WebDriverWait(driver,30);
		//cool1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-quid='builder-default-add-to-order']")));
		
		addtoorder.click();
		Thread.sleep(3000);
		checkout.click();
		
		WebDriverWait cool = new WebDriverWait(driver,30);
		cool.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='backToMenu']")));
		continuecheck.click();
		
	}
	
	
	
	
	

}
