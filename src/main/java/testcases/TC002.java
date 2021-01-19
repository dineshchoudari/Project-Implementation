package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import utils.DP2;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	@Test(dataProvider="TC002fetchData",dataProviderClass=DP2.class)
	public void Accommodations(String stationname,String noofpassengers,String checkintime,String checkouttime,
		String emailid,String mobileno,String passsenger1name,String passenger1age,String passenger1gender,	String passsenger2name,String passenger2age,String passenger2gender,
		String passsenger3name,String passenger3age,String passenger3gender,String state){


		mouseOverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(5000);
		clickByLink("Lounge");
		switchToLastWindow();
		clickByName("city");
		selectValueByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[1]/select", stationname);		
		selectIndexByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[3]/select",Integer.parseInt(noofpassengers));
		waitProperty(3000);
		clickByName("acservicecheckindate");
		waitProperty(2000);
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/div/div/table/tbody/tr[5]/td[6]/span");
		clickByName("checkInTime");
		selectIndexByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[5]/select", Integer.parseInt(checkintime));
		waitProperty(3000);
		clickByName("checkOutTime");
		selectIndexByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[6]/select",Integer.parseInt(checkouttime));		
		waitProperty(2000);
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[12]/button[2]");
		waitProperty(2000);
		clickByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a");
		waitProperty(3000);
		enterByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[1]/input", emailid);
		enterByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[2]/input", mobileno);
		
		waitProperty(2000);
		clickByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[3]/button");
		
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		waitProperty(2000);
		enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[2]/input",passsenger1name);
		enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[3]/input", passenger1age);
		
		selectIndexByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[4]/select",Integer.parseInt(passenger1gender));
		waitProperty(2000);
		enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[2]/input", passsenger2name);
		enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[3]/input", passenger2age);
		
		waitProperty(3000);
		
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[4]/select",passenger2gender) ;
		enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[2]/input", passsenger3name);
		enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[3]/input",passenger3age);
		waitProperty(3000);
		selectIndexByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[4]/select", Integer.parseInt(passenger3gender));
		waitProperty(3000);
		selectVisibleTextByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[5]/div[4]/select",state);
		waitProperty(2000);
		
		clickByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[6]/button[3]");
		waitProperty(2000);
		enterByXpath("//html/body",Keys.PAGE_DOWN);
	    verifyTextByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[4]/div[2]/span", emailid);
	    verifyTextByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[4]/div[3]/span", mobileno);
	    getTextByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[5]/div[4]/span");
	    waitProperty(2000);
	    clickByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[6]/div/label/span");
	    waitProperty(4000);
	    clickByXpath("/html/body/app-root/acsummery/main/div/section/div/div/div/div[7]/button");
	    switchToLastWindow();
	    waitProperty(5000);
	    getAttValByXpath("//*[@id='payform']/div/div/div/div/div[1]/input", "value");
		
		
		
		
		
}}
