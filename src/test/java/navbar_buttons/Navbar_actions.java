package navbar_buttons;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import jiomartpages.Jiomart_Basepage;
import jiomartpages.Jiomart_Objectpage;

public class Navbar_actions extends Jiomart_Basepage
{
	Jiomart_Objectpage obj1 = new Jiomart_Objectpage();
	
	public void logocheck()
	{
		obj1.click_electronics().click();
		boolean logo = obj1.logo().isDisplayed();
		System.out.println(logo);
		boolean text = obj1.check_category().isDisplayed();
		System.out.println(text);
		Assert.assertEquals(logo, true);
	}
	
	public void sort_item() throws InterruptedException
	{
	   obj1.click_eitem3().click();
	   obj1.clickcart().click();
	   obj1.click_continue().click();
	   Thread.sleep(2000);
	   driver.navigate().back();
	   obj1.clicksort().click();
	   obj1.clickPrice().click();
	   Thread.sleep(2000);
	   Assert.assertEquals(driver.getTitle(), "JioMart Electronic Online Shopping");
	 }
	
	public void add_item1() throws InterruptedException
	{
		obj1.click_eitem1().click();
		obj1.clickcart().click();
		driver.navigate().back();
		Thread.sleep(2000);
	    Assert.assertEquals(driver.getTitle(), "JioMart Electronic Online Shopping");
	 }
	
	public void add_item2() throws InterruptedException
	{
		obj1.click_eitem2().click();
		Thread.sleep(2000);
		obj1.clickcart().click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/electronics/4");

	}
	
	public void add_item3() throws InterruptedException
	{
		obj1.clicksort().click();
		obj1.click_allproduct().click();
		obj1.click_eitem4().click();
		Thread.sleep(2000);
		obj1.clickcart().click();
		System.out.println("item3 added successfully");
		driver.navigate().back();
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/electronics/4");
	}
	
	public void gotocart() throws InterruptedException
	{
		obj1.gotoCart().click();
		System.out.println("cart is opened successfully : ");
		String text = obj1.clickContainer().getText();
		System.out.println("All item details : "+text);
		Assert.assertEquals(driver.getTitle(), "Buy Grocery Online at Best Prices Pan India");
	}
	
	public void print_subtotal()
	{
		String text = obj1.clickContainer2().getText();
		System.out.println("sub total of all items : "+text);
		driver.navigate().back();
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "JioMart: India's online shopping destination");
	}
	
	public void beauty_module()
	{
		obj1.click_beauty().click();
		obj1.clickitemm1().click();
		obj1.clickitemm2().click();
		obj1.clickitemm3().click();
		obj1.clickitemm4().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/beauty/5");
	}
	
	public void gotocart1() throws InterruptedException
	{
		obj1.gotoCart().click();
		System.out.println("cart is opened successfully : ");
		Thread.sleep(2000);
		obj1.addMoreCount().click();
		String text = obj1.clickContainer().getText();
		System.out.println("All item details : "+text);
		driver.navigate().back();
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "JioMart: India's online shopping destination");	
	}
	
	public void home_improvement() throws InterruptedException
	{
	obj1.click_homeimprove().click();
	System.out.println("home improvement module is opened successfully ");
	obj1.click_autoscroll().click();
	Thread.sleep(2000);
	Actions ac = new Actions (driver);
	ac.moveToElement(obj1.click_carfreshener()).click().perform();
	}
	
	public void sortfresh_item() throws InterruptedException
	{
		String sortactual = obj1.clicksort().getText();
		System.out.println(sortactual);
		obj1.clicksort().click();
		obj1.clickPrice().click();
		Thread.sleep(2000);
		String sortexp = obj1.clicksort().getText();
		System.out.println(sortexp);
		int size = obj1.click_autocaretotal().size();
		System.out.println("total item present in car freshner : "+size);
		Assert.assertNotEquals(sortactual, sortexp,"both sort prices are not equal ");
	}
	
	public void add_carfreshitem()
	{
		obj1.clickitemm1().click();
		obj1.clickitemm2().click();
		obj1.clickitemm3().click();
		obj1.click_autoscroll().click();
		boolean logo = obj1.logo().isDisplayed();
		Assert.assertEquals(logo, true); 
    }
	
	public void electrical_item() throws InterruptedException
	{
		Thread.sleep(2000);
		obj1.click_electricalscroll().click();
		Actions ac = new Actions (driver);
		ac.moveToElement(obj1.click_electricaloutlet()).click().perform();
		obj1.clickitemm1().click();
		obj1.clickitemm2().click();
		obj1.click_electricalscroll().click();
		Assert.assertEquals(driver.getTitle(), "Electrical Outlets - JioMart");
	}
	
	public void carpentry_click() throws InterruptedException
	{
		Thread.sleep(2000);
		obj1.click_carpentryscroll().click();
		Actions ac = new Actions (driver);
		ac.moveToElement(obj1.click_bracketnail()).click().perform();
		Assert.assertEquals(driver.getTitle(), "Brackets Nails - JioMart");
	}
	
	public void sort_carpentry_item() throws InterruptedException
	{
		String sortactual = obj1.clicksort().getText();
		System.out.println(sortactual);
		obj1.clicksort().click();
		obj1.clickPrice().click();
		Thread.sleep(2000);
		String sortexp = obj1.clicksort().getText();
		System.out.println(sortexp);
		int size = obj1.click_autocaretotal().size();
		System.out.println("total item present in carpentry : "+size);
		Assert.assertNotEquals(sortactual, sortexp,"both sort prices are not equal ");
	}
	
	public void apply_filters() throws InterruptedException
	{
		obj1.clickavail().click();
		System.out.println("availability is selected ");
		obj1.clickcategory().click();
		System.out.println("category is selected ");
	}
	
	public void slider() throws InterruptedException
	{
		WebElement slider= obj1.clickslider1();
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(slider, 550, 0).perform();;
		Thread.sleep(2000);
	}
	
	public void addcarpentry_item()
	{
		obj1.clickitemm1().click();
		obj1.clickitemm3().click();
		obj1.clickitemm4().click();
		System.out.println("items are selected ");
	}

	public void print_subtotal1()
	{
		String text = obj1.clickContainer2().getText();
		System.out.println("sub total of all items : "+text);
		driver.navigate().back();
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Brackets Nails - JioMar");
	}
}
