package jmart_testpages;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportgenerate
{
public static ExtentReports getExtentreport ()
{
	ExtentReports report = new ExtentReports();
	File extentReportFile = new File("./reports/TestcaseExecutionReport.html");
	
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter(extentReportFile);
	report.attachReporter(sparkreporter);
	
	return report ; 
}
}
