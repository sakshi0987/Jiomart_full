package jmart_testpages;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jiomartpages.Jiomart_Objectpage;

public class Navbar_button extends Jiomart_Objectpage
{
	Jiomart_Objectpage obj ;
	static ExtentTest log ;
	static ExtentReports report ;
	
	@BeforeClass
	public void Homepage () throws IOException
	{
		Launchpage();
		obj = new Navbar_button();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@BeforeSuite
	public void startTest()
	{
		report = new ExtentReports("C:\\Users\\skumari\\.jenkins\\workspace\\Jiomart\\navbar.html",true);
 	}
	
	// Button 1 (Groceries)
		@Test(priority=1)
		void clickbutton1()
		{
			log = report.startTest("Verify groceries button is functional");
			obj.clickButton1().click();
			System.out.println("Groceries button navigate to next page ");
			Assert.assertEquals(driver.getTitle(), "JioMart - Best Online Grocery Store for Your Daily Needs");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=2)
		void verify_Image()
		{
			log = report.startTest("Verify background image of groceries page");
			boolean image = obj.verifyImage().isDisplayed();
			System.out.println("Banner image is displayed : "+image);
			Assert.assertEquals(driver.getTitle(), "JioMart - Best Online Grocery Store for Your Daily Needs");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=3)
		void clickfruits() throws InterruptedException
		{
			log = report.startTest("Verify scroll button is functional");
			obj.clickScroll().click();
			Thread.sleep(2000);
			obj.clickFilter().click();
			Assert.assertEquals(driver.getTitle(), "Buy Fresh Veggies: Order Fresh Vegetables Online on JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=4)
		void clicksortt() throws InterruptedException
		{
		log = report.startTest("Verify sort button is functional");
		obj.clicksort().click();
		Thread.sleep(2000);
		obj.clickPrice().click();
		Assert.assertEquals(driver.getTitle(), "Buy Fresh Veggies: Order Fresh Vegetables Online on JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=5)
		void Verify_FreshVegetableImage()
		{
			log = report.startTest("Verify frsh vegetable image is visible");
			boolean image = obj.verifyImage().isDisplayed();
			System.out.println("Banner image for fresh vegetable page is displayed : "+image);
			Assert.assertEquals(driver.getTitle(), "Buy Fresh Veggies: Order Fresh Vegetables Online on JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=6)
		void additem() throws InterruptedException
		{
			log = report.startTest("Verify Add to cart button is working");
			Thread.sleep(2000);
			obj.clickItem1().click();
			System.out.println("one item is added to cart ");
			Thread.sleep(3000);
			obj.clickItem2().click();
			System.out.println("second item is added to cart");
		    Assert.assertEquals(driver.getTitle(), "Buy Fresh Veggies: Order Fresh Vegetables Online on JioMart");
		    log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=7)
		void addVegetables() throws InterruptedException
		{
			log = report.startTest("Verify Add to cart button is functional");
			Thread.sleep(2000);
			obj.clickItem3().click();
			System.out.println("item 3 added");
			obj.clickItem4().click();
			System.out.println("item 4 added");
			obj.clickItem5().click();
			System.out.println("item 5 added");
			System.out.println("items are added to cart ");
			Assert.assertEquals(driver.getTitle(), "Buy Fresh Veggies: Order Fresh Vegetables Online on JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=8)
		void clickfitem2() throws InterruptedException
		{
			log = report.startTest("Verify fresh fruits link is working");
			obj.clickButton1().click();
			Thread.sleep(2000);
			obj.clickScroll().click();
			Thread.sleep(2000);
			obj.clickfilter2().click();		
			Assert.assertEquals(driver.getTitle(), "Fruit Shop Near Me: Buy Fresh Fruits Online on JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=9)
		void Verify_fruitlogo()
		{
			log = report.startTest("Verify fresh fruit image is displayed");
			boolean image = obj.verifyImage().isDisplayed();
			System.out.println("Banner image for fresh fruit page is displayed : "+image);
			Assert.assertEquals(driver.getTitle(), "Fruit Shop Near Me: Buy Fresh Fruits Online on JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=10)
		void Apply_Filter() throws InterruptedException
		{
			log = report.startTest("Verify filters button is functional");
			obj.clickavail().click();
			obj.clickcategory().click();
			Thread.sleep(2000);
			obj.clickbrand().click();
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=11)
		void Add_Fruits() throws InterruptedException
		{
			log = report.startTest("Verify Add to cart button is functional");
			obj.clickItem1().click();
			System.out.println("1st item is added to cart ");
			Thread.sleep(3000);
			obj.clickItem2().click();
			System.out.println("second item is added to cart");
			Assert.assertEquals(driver.getTitle(), "Fruit Shop Near Me: Buy Fresh Fruits Online on JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
			
		@Test(priority=12)
		void clickoncart() throws InterruptedException
		{
			log = report.startTest("Verify cart button is functional");
			obj.Cartbutton().click();
			Thread.sleep(2000);
			System.out.println("cart is opened successfully");
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=13)
		void Cart_Detail() throws InterruptedException
		{
			log = report.startTest("Verify cart details is visible");
			String price1 = obj.getItem1info().getText();
			System.out.println("price before quantity increase : "+price1);
			obj.addMoreCount().click();
			System.out.println("price after increasing item count : "+obj.getItem1info().getText());
			Thread.sleep(2000);
			obj.lessCount().click();
			Thread.sleep(3000);
			String price2 = obj.getItem1info().getText();
			System.out.println("price after reducing 1 item : "+price2);
		    Assert.assertEquals(price2, price1,"price are equals");
		    log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=14)
		void Cart_Detail2() throws InterruptedException
		{
			log = report.startTest("Verify cart details is visible");
			System.out.println("price of bitem2 is :"+obj.getItem2().getText());
			Thread.sleep(2000);
			System.out.println("price of bitem3 before more count add : "+obj.getItem3().getText());
			obj.plus3().click();
			System.out.println("price of bitem3 after increasing item count :"+obj.getItem3().getText());
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=15)
		void Cart_Detail3() throws InterruptedException
		{
			log = report.startTest("Verify cart details is visible");
			System.out.println("price of bitem4 is : "+obj.getItem4().getText());
			Thread.sleep(2000);
			System.out.println("price of bitem5 before more count add : "+obj.getItem5().getText());
			obj.plus5().click();
			System.out.println("price of bitem5 after increasing item count : "+obj.getItem5().getText());
			Assert.assertEquals(driver.getTitle(), "Buy Grocery Online at Best Prices Pan India");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=16)
		void Print_Subtotal() throws InterruptedException
		{
			log = report.startTest("Verify subtotal price is visible");
			String price = obj.printSubtotal().getText();
			System.out.println("subtotal price is : "+price);
			Thread.sleep(2000);
			System.out.println(obj.clickContainer().getText());
			System.out.println(obj.printcart().getText());
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=17,enabled = false)
		void clickplaceorder() throws InterruptedException
		{
			obj.clickPlace().click();
			Thread.sleep(2000);
			obj.enterphonenum().sendKeys("7696284419");
			obj.clickotp().click();
			Thread.sleep(10000);
			obj.getverify().click();
			Thread.sleep(3000);
			System.out.println("discount is there : "+obj.printoffer().getText());
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		// Fashion module 
		
		
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			log.log(LogStatus.FAIL, "Test Case failed"+result.getName());
			log.log(LogStatus.FAIL, "Test Case failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			log.log(LogStatus.SKIP, "Test Case failed"+result.getName());
			log.log(LogStatus.SKIP, "Test Case failed"+result.getThrowable());
		}
	}
	
	@AfterSuite
	void EndTest()
	{
	report.endTest(log);	
	report.flush();
	}
	
	//@AfterClass
	void closure()
	{
	obj.close();	
	}
	
  }
