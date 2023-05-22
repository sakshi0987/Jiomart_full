package jmart_testpages;

import java.io.IOException;
import java.time.Duration;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;


public class Jiomart_Homepagetest extends Jiomart_Basepage 
{
	Jiomart_Objectpage obj ; 
	static ExtentTest log ;
	static ExtentReports report ;
	Jmart_actions test_actions ; 
	
	@BeforeSuite
	public void createTest()
	{
		 report = ExtentReportgenerate.getExtentreport();
 	}
	
	@BeforeClass
	public void Homepage() throws IOException
	{
		Launchpage();
		obj = new Jiomart_Objectpage();
		test_actions=new Jmart_actions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(priority=1)
	void verifyLogo() throws InterruptedException
	{
		log = report.createTest("Verify Jio Mart logo is displayed");
		test_actions.verifylogo();
		log.log(Status.PASS, "Test Case passed");
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void verifyTitle()
	{
		log = report.createTest("Verify Title for Jio Mart is visible ");
		test_actions.verifytitle();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=3)
	void checkHeadermenu()
	{
		log = report.createTest("Verify Location text is displayed");
		test_actions.headermenu();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=4)
	void checkHeaderButton()
	{
		log = report.createTest("Verify Cartbutton & sign in button is displayed");
		test_actions.checkheaderbutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=5)
	void groceryButton() throws InterruptedException
	{
		log = report.createTest("Verify Groceries button is functional");
		test_actions.grocerybutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=6)
	void fruitsButton() throws InterruptedException
	{
		log = report.createTest("Verify Premium fruits button is functional");
		test_actions.fruitsbutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=7)
	void homeKitchenButton() throws InterruptedException
	{
		log = report.createTest("Verify Home & Kitchen button is functional");
		test_actions.homekitchen();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=8)
	void fashionButton() throws InterruptedException
	{
		log = report.createTest("Verify Fashion button is functional");
		test_actions.fashionbutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=9)
	void electronicsButton() throws InterruptedException
	{
		log = report.createTest("Verify Electronics button is functional");
		test_actions.electronicbutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=10)
	void beautyButton() throws InterruptedException
	{
		log = report.createTest("Verify Beauty button is functional");
		test_actions.beautybutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=11)
	void homeImproveButton() throws InterruptedException
	{
		log = report.createTest("Verify Home improvement button is functional");
		test_actions.homeimprovementbutton();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=12)
	void sportsToyButton() throws InterruptedException
	{
		log = report.createTest("Verify Sports Toy&Luggage button is functional");
		test_actions.sportstoy();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=13,enabled=false)
	void checkSlidebutton() throws InterruptedException
	{
		log = report.createTest("Verify Nextslide button is working");
		test_actions.slide1();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=14,enabled=false)
	void getTimer()
	{
		log = report.createTest("Verify Timer is working");
		test_actions.gettimer();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=15)
	void countFooterMenu1()
	{
	log = report.createTest("Count total items from footer menu1 ");
	test_actions.footermenu1();
	log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=16)
	void countFooterMenu2()
	{
	log = report.createTest("Count total items from footer menu2 ");
	test_actions.footermenu2();
	log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=17)
	void countFooterMenu3()
	{
	log = report.createTest("Count total items from footer menu3 ");
	test_actions.footermenu3();
	log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=18)
	void countFooterMenu4()
	{
	log = report.createTest("Count total items from footer menu4 ");
	test_actions.footermenu4();
	log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=19)
	void checkLink1() throws InterruptedException
	{
		log = report.createTest("Verify link1 is working ");
		test_actions.link1();
		log.log(Status.PASS, "Test Case passed");
	}
	
	@Test(priority=20,enabled=false)
	void checkLink2() throws InterruptedException
	{
		log = report.createTest("Verify link2 is working ");
		test_actions.link2();
		log.log(Status.PASS, "Test Case passed");
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			log.log(Status.FAIL, "Test Case failed"+result.getName());
			log.log(Status.FAIL, "Test Case failed"+result.getThrowable());
			log.addScreenCaptureFromPath(Takescreenshot(result.getTestContext().getName() + "_"+result.getMethod().getMethodName()+".jpg"));

		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			log.log(Status.SKIP, "Test Case failed"+result.getName());
			log.log(Status.SKIP, "Test Case failed"+result.getThrowable());
		}
	}
	
	@AfterSuite
	void EndTest()
	{
      report.getLogSubject();	
	  report.flush();
	  // report.close();
	  obj.close();
	}
}
