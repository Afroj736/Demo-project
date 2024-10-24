package utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Testbase;

public class Extent_reports extends Testbase {

	 static ExtentReports report;
	 public static ExtentReports getreportInstance()
	{
		if(report==null)
		{
			String reportName=new SimpleDateFormat("dd-MM-YY ss-mm-HH").format(new Date());
			ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("C:\\Users\\oskar\\eclipse-workspace\\July4th_framework\\Extent Reports"+reportName+".html");
			report=new ExtentReports();
			report.attachReporter(htmlReporter);
			report.setSystemInfo("OS","Windows");
			report.setSystemInfo("Environment", "SIT");
			report.setSystemInfo("Build", "102.02.02.215");
			report.setSystemInfo("Browser", "Chrome");
			htmlReporter.config().setDocumentTitle("UI Testing Document");
			htmlReporter.config().setDocumentTitle("UI Test Report");
			
		}
		return report;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
