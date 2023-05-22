package jmart_testpages;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.*;

import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;

public class Jiomart_signintest extends Jiomart_Basepage
{
	Jiomart_Objectpage obj ; 
	@BeforeClass
	public void Sign_in () throws IOException
	{
		Launchpage();
		obj = new Jiomart_Objectpage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(priority=1)
	void clicksignin()
	{
		obj.Signinbutton().click();
		System.out.println("Sign in button navigate to sign in page");
		Assert.assertEquals(driver.getTitle(), "Buy Grocery Online at Best Prices Pan India");
	}
	
	@Test(priority=2)
	void enternumber() throws InterruptedException 
	{
	obj.Signinbutton().click();
	obj.enterphonenum().sendKeys("7696284419");
	obj.getotp().click();
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/customer/account/login");
	}
	
	@Test(priority=3)
	void enterfirname() throws InterruptedException
	{
		obj.enterfirstname().sendKeys("Ichita");
		Thread.sleep(2000);
		System.out.println("First name entered successfully");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.jiomart.com/customer/account/login");
	}
	
	@Test(priority=4)
	void enterlasname() throws InterruptedException
	{
		obj.enterlastname().sendKeys("saraf");
		Thread.sleep(2000);
		System.out.println("Last name entered successfully");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.jiomart.com/customer/account/login");
	}
	
	@Test(priority=5)
	void enteremaill() throws InterruptedException
	{
		obj.enteremail().sendKeys("choubeysakshi3@gmail.com");
		System.out.println("email entered successfully");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.jiomart.com/customer/account/login");
	}
	
	@Test(priority=6)
	void enterotp() throws InterruptedException
	{
		Thread.sleep(10000);
		obj.clickstart().click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.jiomart.com/customer/account/login");
	}
	
	@AfterClass
	void closure()
	{
	obj.close();	
	}
	
}
