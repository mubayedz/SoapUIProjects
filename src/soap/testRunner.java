package soap;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;


public class testRunner {
    @Test
	public void SoapTest() throws Exception, Exception, SoapUIException {
		// TODO Auto-generated method stub
		                                       //********* Enter your file location here*****
		WsdlProject project = new WsdlProject("C:\\Users\\mubayed\\Downloads\\Automation-soapui-project.xml");
        WsdlTestSuite testsuite = project.getTestSuiteByName("Testing"); // *** name of the TestSuite of the project***
        for (int i = 0; i < testsuite.getTestCaseCount(); i++) // this will execute test case one by one until is done
        { 
        	WsdlTestCase testCase = testsuite.getTestCaseAt(i); // this will capture each test case
        	TestRunner runner = testCase.run(new PropertiesMap(), false);  // this will execute
        	Assert.assertEquals(Status.FINISHED, runner.getStatus());
        	
        	// code to execute
		}
        
        
	}

}
