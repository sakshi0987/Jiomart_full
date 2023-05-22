package navbar_buttons;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import jiomartpages.Jiomart_Basepage;


public class ITListenerClass extends Jiomart_Basepage implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result)
	{
		try
		{
			System.out.println(result.getTestContext().getName() + "_"+result.getMethod().getMethodName());
			Takescreenshot(result.getTestContext().getName() + "_"+result.getMethod().getMethodName()+".jpg");
		} 
		catch (IOException e)
		{
			
		System.out.println("screenshot not taken");
		}
	}
  
	}


