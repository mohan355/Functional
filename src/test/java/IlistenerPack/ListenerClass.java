package IlistenerPack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.facebook.auto.Funtional.CommonBrowser;

public class ListenerClass extends CommonBrowser implements ITestListener{



	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshot("C:\\Users\\kafle\\Desktop\\PNT\\Funtional\\Pictures\\Passed\\");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshot("C:\\Users\\kafle\\Desktop\\PNT\\Funtional\\Pictures\\Failed\\");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

	

}
