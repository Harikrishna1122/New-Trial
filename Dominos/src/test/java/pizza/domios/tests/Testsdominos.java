package pizza.domios.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pizza.dominos.common.Baseclass;
import pizza.dominos.pages.Homepage;
import pizza.dominos.pages.Loginpage;
import pizza.dominos.pages.Pastapage;
import pizza.dominos.pages.orderonline;

public class Testsdominos extends Baseclass {
	@Test
	@Parameters({"username","password"})
	public void dominostest(String username,String password) throws InterruptedException{
		Loginpage login = new Loginpage(driver);
		login.logintodominos(username, password);
		Homepage dominos = new Homepage(driver);
		dominos.isdominoslogovisible();
		orderonline orderonline2 = new orderonline(driver);
		orderonline2.deliverypage();
		Pastapage pasta = new Pastapage(driver);
		pasta.orderpasta();
		
		
		
		
		
		
		
		
		
	}

}
