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

public class Home_navbar2 extends Jiomart_Objectpage
{
	Jiomart_Objectpage obj ; 
	static ExtentTest log ;
	static ExtentReports report ;
	
	@BeforeSuite
	public void startTest()
	{
		report = new ExtentReports("C:\\Users\\skumari\\.jenkins\\workspace\\Jiomart\\homekitchen.html",true);
 	}
	
	@BeforeClass
	public void Homepage() throws IOException
	{
		Launchpage();
		obj = new Home_navbar2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	// navbarbutton2 
	
		@Test(priority=1)
		void click_button3() throws InterruptedException
		{
			log = report.startTest("Verify Home & Kitchen button is functional");
			obj.click_navbutton3().click();
			System.out.println("Home & kitchen button is navigating to next page");
			obj.clickItem1().click();			
			Assert.assertEquals(driver.getTitle(), "Homeandkitchen - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=2)
		void add_disposalitem() throws InterruptedException
		{
			log = report.startTest("Verify item is added successfully");
			obj.click_disposal().click();
			obj.click_disposalplate().click();
			Thread.sleep(2000);
			obj.clicksort().click();
			Thread.sleep(2000);
			obj.clickPrice().click();
			Assert.assertEquals(driver.getTitle(), "Disposable Plates Glasses - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=3)
		void close_disposal() throws InterruptedException
		{
			log = report.startTest("Verify item is selected successfully ");
			Thread.sleep(2000);
			obj.click_disposalitem1().click();
			System.out.println("item1 is selected");
			obj.click_disposalitem2().click();
			System.out.println("item2 is selected");
			obj.click_disposal().click();
			Assert.assertEquals(driver.getTitle(), "Disposable Plates Glasses - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=4)
		void click_kitchenwearbutton() throws InterruptedException
		{
			log = report.startTest("Verify kichenwear button is functional");
			Thread.sleep(2000);
			obj.click_kitchenwear().click();
			obj.clickSortt().click();
			Thread.sleep(2000);
			obj.clickPrice().click();
			Assert.assertEquals(driver.getTitle(), "Disposable Plates Glasses - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");	
		}
		
		@Test(priority=5)
		void add_kitchenwearitem() throws InterruptedException
		{
			log = report.startTest("Verify filters are applied successfully");
			obj.click_cookwear().click();
			Thread.sleep(2000);
			obj.click_cookwearitem().click();
			Assert.assertEquals(driver.getTitle(), "Beco Bambooee Brown Toothbrush with Charcoal Activated Bristles - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=6)
		void check_fashionbutton()
		{
			log = report.startTest("Verify Fashion button is navigating to next page");	
			obj.click_fashion().click();
			System.out.println("fashion button is working ");
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "JioMart Online Shopping - Fashion Apparel for Men, Women and Kids");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=7)
		void verify_image()
		{
			log = report.startTest("Verify Banner for fashion button is displayed ");
			boolean banner = obj.fashion_banner().isDisplayed();
			System.out.println(banner);
			Assert.assertTrue(banner);
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=8)
		void click_womenbutton() throws InterruptedException
		{
			log = report.startTest("Verify women button is working ");
			obj.click_women().click();
			obj.click_cloth().click();
			Thread.sleep(2000);
			obj.click_women().click();
			Assert.assertEquals(driver.getTitle(), "Western Wear - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=9)
		void click_genderr() throws InterruptedException
		{
			log = report.startTest("Verify gender button is working ");
			obj.clickavail().click();
			Thread.sleep(2000);
			obj.click_gender().click();
			System.out.println("gender is selected successfully");
			Assert.assertEquals(driver.getTitle(), "Western Wear - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=10)
		void click_filter() throws InterruptedException
		{
			log = report.startTest("Verify filters are applied successfully ");
			obj.clickcategory().click();
			System.out.println("category is selected succesfully");
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Western Wear - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=11)
		void click_sizee() throws InterruptedException
		{
			log = report.startTest("Verify size is selected successfully ");
			obj.click_size().click();
			System.out.println("size is selected succesfully");
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Western Wear - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=12)
		void click_brandd() throws InterruptedException
		{
			log = report.startTest("Verify size is selected successfully ");
			obj.clickbrand().click();
			System.out.println("brand is selected succesfully");
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Western Wear - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=13)
		void click_ocassionn() throws InterruptedException
		{
			log = report.startTest("Verify size is selected successfully ");
			obj.click_ocassion().click();
			System.out.println("ocassion is selected succesfully");
			Thread.sleep(2000);
			Assert.assertEquals(driver.getTitle(), "Western Wear - JioMart");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		@Test(priority=14,enabled=false)
		void like_item() throws InterruptedException
		{
			log = report.startTest("Verify item is liked successfully");
			obj.like_item1().click();
			Thread.sleep(2000);
			obj.enterphonenum().sendKeys("7696284419");
			obj.getotp1().click();
			Thread.sleep(10000);
			obj.getverify().click();
			Thread.sleep(3000);
			obj.like_item1().click();
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/fashion/3?");
			log.log(LogStatus.PASS, "Test Case passed");
		}
		
		// Electronics module 
		
		
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
		// report.close();
		 obj.close();
		}
}
