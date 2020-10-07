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

public class testRunnerSingle extends testRunner {

	@Test
	public void singleTest() throws Exception, IOException, SoapUIException {
		WsdlProject project = new WsdlProject("C:\\Users\\mubayed\\Downloads\\Automation-soapui-project.xml");
		WsdlTestSuite testsuite = project.getTestSuiteByName("Testing"); // *** name of the TestSuite of the project***

		WsdlTestCase testCaseByName = testsuite.getTestCaseByName("Script"); // this will capture the testcase

		TestRunner runner = testCaseByName.run(new PropertiesMap(), false); // this will execute
		Assert.assertEquals(Status.FINISHED, runner.getStatus());

		// code to execute

	}
}
