package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestListeners implements ITestListener{
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
	    sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//target/report.html");
	    sparkreporter.config().setDocumentTitle("Automation Testing Result");
	    sparkreporter.config().setReportName("FlipKart payment");
	    sparkreporter.config().setTheme(Theme.DARK);
	    
	    extent = new ExtentReports();
	    extent.attachReporter(sparkreporter);
	    extent.setSystemInfo("Project Name", "Automation Payment");
	    extent.setSystemInfo("Tester", "Gayathri");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Browser", "Chrome 141");
	    extent.setSystemInfo("Operating System", "mac");
	    
	    
	  }
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.PASS, "Test case is passed successfully");
	    
	  }
	public void onTestFailure(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.FAIL, "Test is failed");
	    test.log(Status.FAIL,"Test failed reason : "+result.getThrowable());
	    
	  }
	public void onTestSkipped(ITestResult result) {
	    test = extent.createTest(result.getName());
	    test.log(Status.SKIP, "Test is skipped");
	  }
	public void onFinish(ITestContext context) {
	    extent.flush(); // flush all data into report
	  }

}
