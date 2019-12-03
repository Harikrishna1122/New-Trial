package pizza.dominos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Loginpage {
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id=\"_dpz\"]/header/nav[1]/div[1]/div[3]/a")
WebElement Login1;
@FindBy(xpath="//input[@type='email']")
WebElement emailtextbox;
@FindBy(xpath="//input[@id='Password']")
WebElement passwordbox;
@FindBy(xpath="//button[@data-quid='pizza-profile-login-button-login-once']")
WebElement signin;

public void logintodominos(String username,String password){
	Login1.click();
	WebDriverWait wait =new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(emailtextbox));
	emailtextbox.sendKeys(username);
	passwordbox.sendKeys(password);
	signin.click();
	WebDriverWait cool = new WebDriverWait(driver,30);
	cool.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@data-quid='header-main-navigation-desktop']//li[@class='nav__menu-item nav__logo']")));
	
	
			

	
}
}