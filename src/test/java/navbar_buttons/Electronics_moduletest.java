package navbar_buttons;

import java.io.IOException;
import java.time.Duration;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;
import jmart_testpages.ExtentReportgenerate;

public class Electronics_moduletest extends Jiomart_Basepage 
{
	static ExtentTest log ;
	static ExtentReports report ;
	Navbar_actions test_actions;
	Jiomart_Objectpage obj;
	
	@BeforeClass
	public void Basepage() throws IOException
	{
		Launchpage();
		obj = new Jiomart_Objectpage();
		test_actions=new Navbar_actions();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@BeforeSuite
	public void createTest()
	{
		 report = ExtentReportgenerate.getExtentreport();
 	}
	
	@Test(priority=1,testName = "logo verify")
	void logoverify()
	{
		log = report.createTest("logo is displayed");
		test_actions.logocheck();
		log.log(Status.PASS,"Test case passed");
	}
	
	@Test(priority=2,testName = "sorting")
	void sort_item() throws InterruptedException
	{
		log = report.createTest("item sort successfully and item is displayed");
		test_actions.sort_item();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=3)
	void add_item1() throws InterruptedException
	{
		log = report.createTest("1st item is added successfully");
		test_actions.add_item1();
		System.out.println("item1 added successfully");
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=4)
	void add_item2() throws InterruptedException
	{
		log = report.createTest("2nd item is added successfully");
		test_actions.add_item2();
		System.out.println("item2 added successfully");
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=5)
	void add_item3() throws InterruptedException
	{
		log = report.createTest("3rd item is added successfully");
		test_actions.add_item3();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=6)
	void gotocart() throws InterruptedException
	{
		log = report.createTest("cart is opened successfully");
		test_actions.gotocart();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=7)
	void print_subtotal() throws InterruptedException
	{
		log = report.createTest("subtotal is printed successfully");
		test_actions.print_subtotal();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=8)
	void beauty_module() throws InterruptedException
	{
		log = report.createTest("beauty module is opened successfully");
		test_actions.beauty_module();
		log.log(Status.PASS, "Test Case passed");	
	}
	

	@Test(priority=9)
	void gotocart1() throws InterruptedException
	{
		log = report.createTest("cart is opened successfully");
		test_actions.gotocart1();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=10)
	void home_improvement() throws InterruptedException
	{
		log = report.createTest("home improvement module is opened successfully");
		test_actions.home_improvement();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=11)
	void carfresh_totalitem() throws InterruptedException
	{
		log = report.createTest("carfresh totalitem is displayed ");
		test_actions.sortfresh_item();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=12)
	void add_carfreshitem() throws InterruptedException
	{
		log = report.createTest("carfresh item is displayed ");
		test_actions.add_carfreshitem();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=13)
	void add_electricalitem() throws InterruptedException
	{
		log = report.createTest("electrical item is displayed ");
		test_actions.electrical_item();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=14)
	void add_carpentryitem() throws InterruptedException
	{
		log = report.createTest("carpentry filter is opened ");
		test_actions.carpentry_click();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=15)
	void sort_carpentryitem() throws InterruptedException
	{
		log = report.createTest("carpentry item is sorted ");
		test_actions.sort_carpentry_item();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=16)
	void apply_filter() throws InterruptedException
	{
		log = report.createTest("all filter is applied");
		test_actions.apply_filters();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=17)
	void slider() throws InterruptedException
	{
		log = report.createTest("slider is moved");
		test_actions.slider();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=18)
	void addcarpentry_item() throws InterruptedException
	{
		log = report.createTest("items are added");
		test_actions.addcarpentry_item();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=19)
	void cart_item() throws InterruptedException
	{
		log = report.createTest("cart is opened");
		test_actions.gotocart();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	@Test(priority=20)
	void print_subtotall() throws InterruptedException
	{
		log = report.createTest("subtotal of cart");
		test_actions.print_subtotal1();
		log.log(Status.PASS, "Test Case passed");	
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result ) throws Exception
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
	obj.close();
	}
}
