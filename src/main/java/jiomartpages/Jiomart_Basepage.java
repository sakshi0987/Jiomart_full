package jiomartpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jiomart_Basepage 
{
	public static WebDriver driver ;
	public static Properties prop1;
	public static String screenshotfolder ;
	public static String destFile = "./Screenshots/" ;

	public void Launchpage() throws IOException
	{
		try
		{
	    // reading file using file handling
			
		FileInputStream file = new FileInputStream("C:\\Users\\skumari\\eclipse-workspace\\JioMart\\src\\main\\java\\jiomart.properties");
		prop1 = new Properties();
		prop1.load(file);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver.get(prop1.getProperty("url"));
		driver.manage().window().maximize();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}

	public void close()
	{
		driver.quit();
	}
	
	
	public String Takescreenshot(String filename) throws IOException
	{
		if(screenshotfolder== null)
		{
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
	    screenshotfolder = myDateObj.format(myFormatObj);
		}
		TakesScreenshot tc = (TakesScreenshot)driver;
		File sourceFile = tc.getScreenshotAs(OutputType.FILE);
	    File destFile1 = new File(destFile+ screenshotfolder+"/"+filename);
		try
		{
		FileUtils.copyFile(sourceFile, destFile1);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		return destFile1.getAbsolutePath();
	}
}
