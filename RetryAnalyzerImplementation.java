package Day13_Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {

	int counter = 0;    // initial value
	int retryLimit = 3; // max re-attemp value

	@Override
	public boolean retry(ITestResult arg0) { // ITestResult --> Fail, Fail, Fail, Fail
		if (counter < retryLimit) {          // 3 < 3
			counter++;                       // counter = 3
			return true;                     // perform re-execution
		}
		return false;                       // Stop re-execution
	}
}

// ITestResult --> Pass/ fail
// args0 -> pass/fail/ methodname