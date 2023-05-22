package jmart_testpages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;

public class Jmart_actions extends Jiomart_Basepage
{
	Jiomart_Objectpage obj1 = new Jiomart_Objectpage();
	
	// jiomart homepage actions
	public void verifylogo()
	{
		boolean logo = obj1.logo().isDisplayed();
        System.out.println(logo);
        
    }
	
	public void verifytitle()
	{
		String ExpectedTtile = "JioMart: India's online shopping destination";
		Assert.assertEquals(ExpectedTtile, driver.getTitle());	
	}
	
	public void headermenu()
	{
		boolean Locationtext = obj1.Locationtext().isDisplayed();
		System.out.println("Location text is visible : "+Locationtext);
		boolean search = obj1.Searchbutton().isDisplayed();
		System.out.println("Search button is visible : "+search);
		Assert.assertEquals(driver.getTitle(), "JioMart: India's online shopping destination");	
	}
	
	public void checkheaderbutton()
	{
		boolean verifycart = obj1.Cartbutton().isDisplayed();
		System.out.println("Cart button is visible : "+verifycart);
		boolean verifySignin = obj1.Signinbutton().isDisplayed();
		System.out.println("Signin button is visible : "+verifySignin);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	}
	
	public void grocerybutton() throws InterruptedException
	{
		boolean item1 = obj1.clickitem1().isDisplayed();
		System.out.println("grocery button navigate to next page : "+item1);
		obj1.clickitem1().click();
		Assert.assertEquals(driver.getTitle(), "JioMart - Best Online Grocery Store for Your Daily Needs");
		Thread.sleep(2000);
	}
	
	public void fruitsbutton() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		boolean item2 = obj1.clickitem2().isDisplayed();
		System.out.println("Premium fruits button navigate to next page : "+item2);
		obj1.clickitem2().click();
		Assert.assertEquals(driver.getTitle(), "Premiumfruits - JioMart");
		Thread.sleep(2000);	
	}
	
	public void homekitchen() throws InterruptedException
	{
		driver.navigate().back();
		boolean item3 = obj1.clickitem3().isDisplayed();
		System.out.println("home and kitchen button navigate to next page : "+item3);
		obj1.clickitem3().click();
		Assert.assertEquals(driver.getTitle(), "Homeandkitchen - JioMart");
		Thread.sleep(2000);
	}
	
	public void fashionbutton() throws InterruptedException
	{
		driver.navigate().back();
		boolean item4 = obj1.clickitem4().isDisplayed();
		System.out.println("fashion button navigate to next page : "+item4);
		obj1.clickitem4().click();
		Assert.assertEquals(driver.getTitle(), "JioMart Online Shopping - Fashion Apparel for Men, Women and Kids");
		Thread.sleep(2000);
	}
	
	public void electronicbutton() throws InterruptedException
	{
		driver.navigate().back();
		boolean item5 = obj1.clickitem5().isDisplayed();
		System.out.println("Electronics button navigate to next page : "+item5);
		obj1.clickitem5().click();
		Assert.assertEquals(driver.getTitle(), "JioMart Electronic Online Shopping");
		Thread.sleep(2000);
	}
	
	public void beautybutton() throws InterruptedException
	{
		driver.navigate().back();
		boolean item6 = obj1.clickitem6().isDisplayed();
		System.out.println("Beauty button navigate to next page : "+item6);
		obj1.clickitem6().click();
		Assert.assertEquals(driver.getTitle(), "JioMart - Beauty Products Online Shopping");
		Thread.sleep(2000);
	}
	
	public void homeimprovementbutton() throws InterruptedException
	{
		driver.navigate().back();
		boolean item7 = obj1.clickitem7().isDisplayed();
		System.out.println("Home improvement button navigate to next page : "+item7);
		obj1.clickitem7().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/homeimprovement/8583");
		Thread.sleep(2000);
	}
	
	public void sportstoy() throws InterruptedException
	{
		driver.navigate().back();
		boolean item8 = obj1.clickitem8().isDisplayed();
		System.out.println("Sports Toy&Luggage button navigate to next page : "+item8);
		obj1.clickitem8().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/sportstoysluggage/8584");
		Thread.sleep(2000);
	}
	
	public void slide1() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		obj1.clicknextslide().click();
		obj1.clicknextslide().click();
		System.out.println("Next slide button working properly ");
		Thread.sleep(2000);
		obj1.clickpreviousslide().click();
		obj1.clickpreviousslide().click();
		System.out.println("Previous slide button working properly ");
		Assert.assertEquals(driver.getTitle(), "JioMart: India's online shopping destination");
	}
	
	public void gettimer()
	{
		String timer = obj1.gettimer().getText();
		System.out.println("Sale starts in : "+timer);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	}
	
	public void footermenu1()
	{
		int menu1 = obj1.getfootermenu1().size();
		System.out.println("All items from All Categories : "+menu1);
		for(WebElement allitems :obj1.getfootermenu1())
		{
			System.out.println(allitems.getText());
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");	
	}
	
	public void footermenu2()
	{
		int menu2 = obj1.getfootermenu2().size();
		System.out.println("All items from Popular Categories : "+menu2);
		for(WebElement allitems :obj1.getfootermenu2())
		{
			System.out.println(allitems.getText());
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	}
	
	public void footermenu3()
	{
		int menu3 = obj1.getfootermenu3().size();
		System.out.println("All items from Customer Account : "+menu3);
		for(WebElement allitems :obj1.getfootermenu3())
		{
			System.out.println(allitems.getText());
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	}
	
	public void footermenu4()
	{
		int menu4 = obj1.getfootermenu4().size();
		System.out.println("All items from Help & Support : "+menu4);
		for(WebElement allitems :obj1.getfootermenu4())
		{
			System.out.println(allitems.getText());
		}
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	}
	
	public void link1()
	{
		obj1.clicklink1().click();
		Assert.assertEquals(driver.getTitle(), "JioMart");
	}
	
	public void link2() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		obj1.clicklink2().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Kitchen_fest_2_25_11 - JioMart");
	}
	
	// jiomart 
}
