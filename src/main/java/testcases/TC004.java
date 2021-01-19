package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utils.DP4;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	@Test(dataProvider="TC004fetchData",dataProviderClass=DP4.class)
	public void SaloonMandatoryCheck(String name,String organization,String address,String mobile,String email,String requestfor,
	String originstation,String destnstation,String durationperiod,String coachdetails,String numpassenger,String charterpurpose,String services){
		
		mouseOverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");	
		waitProperty(2000);	
		clickByLink("Lounge");	
		waitProperty(1000);
		switchToLastWindow();
		clickByXpath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]");
		clickByLink("Charter");
		switchToLastWindow();
		clickByLink("Enquiry Form");
		waitProperty(2000);
		enterByName("name", name);
		enterByName("organization", organization);
		enterByName("address", address); 
		enterByName("mobile", mobile);
		enterByName("email", email); 
		waitProperty(1000);		
		selectIndexByName("requestFor", Integer.parseInt(requestfor));
		enterByName("originStation", originstation);
		enterByName("destnStation",destnstation);
		clickByName("checkInDate");
		clickByXpath("//span[text()='27']");
		clickByName("checkOutDate");
		clickByXpath("//span[text()='29']");
		enterByName("durationPeriod",durationperiod);
		enterByName("coachDetails", coachdetails);
		enterByName("numPassenger", numpassenger);
		enterByName("charterPurpose", charterpurpose);
		enterByName("services", services);
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		waitProperty(2000);
		clickByXpath(" //button[text()='Submit']");
			

}}
