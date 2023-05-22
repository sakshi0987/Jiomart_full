package jmart_testpages;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;

public class Jiomart_addtocarttest extends Jiomart_Basepage
{
	Jiomart_Objectpage obj ;
	static ExtentTest log ;
	static ExtentReports report ;
	
	@BeforeClass
	public void Add_To_Cart () throws IOException
	{
		Launchpage();
		obj = new Jiomart_Objectpage();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@BeforeSuite
	public void startTest()
	{
		report = new ExtentReports( "C:\\Users\\skumari\\.jenkins\\workspace\\Jiomart\\addtocart.html",true);
 	}
	
	@Test(priority=1)
	void enterSerach() throws InterruptedException
	{
		log = report.startTest("Verify search box is functional");
		Thread.sleep(2000);
		WebElement search = obj.Searchbutton();
		Actions ac = new Actions(driver);
		ac.moveToElement(search)
		.click()
		.sendKeys(search, "B Natural Apple Juice 1 L")
		.sendKeys(search, Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.perform();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Search Results – JioMart.com");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=2)
	void sorting() throws InterruptedException
	{
		log = report.startTest("Verify sort button is functional");
		obj.clicksort().click();
		obj.clicksorting().click();
		Assert.assertEquals(driver.getTitle(), "Search Results – JioMart.com");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=3)
	void additem()
	{
		log = report.startTest("Verify Add to cart button is functional");
		obj.selectitem().click();
		System.out.println("navigate to next page");
		obj.clickshow().click();
		obj.clickshow1().click();
		obj.clickshow2().click();
		obj.clickshow3().click();
		Assert.assertEquals(driver.getTitle(), "B Natural Apple Juice 1 L - JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=4)
	void getpricetext()
	{
		log = report.startTest("Verify item price is visible");
		String price = obj.getprice().getText();
		System.out.println("item price : "+price);
		obj.clickcart().click();
		System.out.println("item added to cart successfully");
		Assert.assertEquals(driver.getTitle(), "B Natural Apple Juice 1 L - JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=5)
	void addItem2() throws InterruptedException
	{
		log = report.startTest("Verify item2 is selected successfully");
		obj.clickitemm2().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "B Natural Apple Juice 1 L - JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=6)
	void addItem3() throws InterruptedException
	{
		log = report.startTest("Verify item3 is selected successfully");
		obj.clickitemm3().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "B Natural Apple Juice 1 L - JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=7)
	void addItem4() throws InterruptedException
	{
		log = report.startTest("Verify item2 is selected successfully");
		obj.clickitemm4().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "B Natural Apple Juice 1 L - JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=8)
	void goToCart() throws InterruptedException
	{
		log = report.startTest("Verify the functionality of cart button");
		obj.gotoCart().click();
		Thread.sleep(2000);
		System.out.println("cart is opened successfully");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
		log.log(LogStatus.PASS, "Test Case passed");
		
	}
	
	@Test(priority=9)
	void getContainerText() throws InterruptedException
	{
		log = report.startTest("Verify visibility of item1 information");
		String textt = obj.clickContainer().getText();
		System.out.println("item information : "+textt);
		Thread.sleep(2000);
		String text = obj.getItem1info().getText();
		System.out.println("item1 information : "+text);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=10)
	void getContainText() throws InterruptedException
	{
		log = report.startTest("Verify visibility of item2 information");
		String text = obj.getItem2info().getText();
		System.out.println("item2 information : "+text);
		Thread.sleep(2000);
		String text1 = obj.getItem3info().getText();
		System.out.println("item3 information : "+text1);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=11)
	void additemm() throws InterruptedException
	{
		log = report.startTest("Verify user able to increase quantity into cart");
		obj.plusItem().click();
		Thread.sleep(2000);
		obj.plusItem2().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=12)
	void clickcConatiner2() throws InterruptedException
	{
		log = report.startTest("Verify visibility of all item information");
		String price = obj.printSubtotal().getText();
		System.out.println("subtotal price is : "+price);
		Thread.sleep(2000);
		System.out.println(obj.clickContainer().getText());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/checkout/cart");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
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
	
	@AfterClass
	void closure()
	{
	obj.close();	
	}
	
	}




