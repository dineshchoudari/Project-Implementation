package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class ProjectWrappers extends GenewirWrappers{
	@BeforeMethod
	public void launchIrctc(){
		invokeApp("chrome", "https://www.irctc.co.in");
	}
	
	@AfterMethod
	public void closeIrct(){
		closeAllBrowsers();
	}

}
//"chrome", "https://www.irctc.co.in"
//"chrome","https://www.flipkart.com/"
//"chrome","https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp"