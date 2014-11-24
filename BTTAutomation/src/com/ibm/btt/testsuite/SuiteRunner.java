package com.ibm.btt.testsuite;
import java.util.*;
import com.ibm.btt.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SuiteRunner {

	public static Test suite() {
		TestSuite testSuite = new TestSuite("All Test");
		//testSuite.addTestSuite(ProxyHTMLDocTypeTest.class);
		//testSuite.addTestSuite(SetenvifTest1.class);
		//testSuite.addTestSuite(SetenvifTest.class);
		return testSuite;
	}

static Class[] bvt = new Class[]	{
        //btt.allwidgets.CheckedMulTiSelect.Event.class;
       com.ibm.btt.allwidgets.Label.ECA.class
};
public static void main( String args[] ) {
	//ProxyHTMLTest runAble=new ProxyHTMLTest();
	//TestResult result = null;
	//runAble.suite().run(result);
	Class[] testClasses=null;
	testClasses=bvt;
	// junit.textui.TestRunner.run(testClasses);
	Result outcome = null;
	outcome=JUnitCore.runClasses(testClasses);
	SuiteRunner.printTestCaseResult(outcome);
}

public static void printTestCaseResult(Result outcome) {
	System.out.println("============================================");
	System.out.println("Unit Test Suite Execution Summary:      ");
	System.out.println("============================================");
	System.out.println("Total Tests: " + outcome.getRunCount());
	System.out.println(" Successful: "
			+ (outcome.getRunCount() - (outcome.getFailureCount() + outcome
					.getIgnoreCount())));
	System.out.println("   Failures: " + outcome.getFailureCount());
	System.out.println("    Ignored: " + outcome.getIgnoreCount());
	System.out.println("============================================");
	System.out.println(" NOTE:  If a failure summary is not shown   ");
	System.out.println("        the test failed because the method  ");
	System.out.println("        is not implemented.                 ");
	System.out.println("============================================");
	System.out.println("Failure Summaries:                          ");
	System.out.println("============================================");
	List<Failure> failed = outcome.getFailures();
	for (Iterator i = failed.iterator(); i.hasNext();) {
		Failure current = (Failure) i.next();
		if (!("Not yet implemented").equalsIgnoreCase(current.getMessage())) {
			System.out.println("Failed Test: " + current.getTestHeader());
			System.out.println("      Cause: " + current.getMessage());
			System.out.println("  Exception: " + current.getException());
			System.out.println("      Trace: " + current.getTrace());
			System.out
					.println("============================================");
		}
		;
	}
}



}