package pizza.dominos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage { 
	WebDriver driver;
	public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="// ul[@data-quid='header-main-navigation-desktop']//li[@class='nav__menu-item order']")
	WebElement orderonline;
	public boolean isdominoslogovisible() {
	return orderonline.isDisplayed();
	
}}

