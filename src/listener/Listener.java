package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener  implements ITestListener
{
@Override
	public void onTestFailure(ITestResult result) 
	{	
		Reporter.log("TC is Failed Please Check", true);
	}

	@Override
		public void onTestSuccess(ITestResult result)
	{
			Reporter.log("Test Case Success...", true);
	}
	
	@Override
		public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Test case Skipped Please check", true);
	}

}
