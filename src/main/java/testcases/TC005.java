package testcases;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utils.DP5;
import wrappers.ProjectWrappers;
public class TC005 extends ProjectWrappers {
	@Test(dataProvider="TC005fetchData",dataProviderClass=DP5.class)
	public void AccommodationsGSTValidation(String stationname,String noofpassengers,String checkintime,String checkouttime,
			String emailid,String mobileno,String gst,String gstno,String passenger1name,String passenger1age,String passenger1gender,
			String passenger2name,String passenger2age,String passenger2gender,String passenger3name,String passenger3age,String passenger3gender,
			String state){
		
		mouseOverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
        waitProperty(5000);
        clickByLink("Lounge");
        switchToLastWindow();
        clickByName("city");
        selectValueByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[1]/select", stationname);    
        selectIndexByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[3]/select",Integer.parseInt(noofpassengers));  
        waitProperty(2000);     
        clickByName("acservicecheckindate");
        waitProperty(2000);
        clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[4]/div/div/table/tbody/tr[5]/td[6]/span");
        clickByName("checkInTime");
        selectIndexByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[5]/select", Integer.parseInt(checkintime));
        waitProperty(3000);
        clickByName("checkOutTime");
        selectIndexByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[6]/select",Integer.parseInt(checkouttime));
        waitProperty(1000);
        
        clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[2]/form/div/div[12]/button[2]");       
        waitProperty(2000);       
        clickByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a");
        waitProperty(3000);    
        enterByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[1]/input", emailid);
        enterByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[2]/input", mobileno);
        waitProperty(2000);
        clickByXpath("/html/body/app-root/acbooklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[3]/button");      
        waitProperty(2000);
        selectVisibleTextByName("gstGet", gst);
        enterByName("gstNo", gstno);
        enterByXpath("//html/body", Keys.PAGE_DOWN);
        waitProperty(2000);
        enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[2]/input",passenger1name);
        enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[3]/input", passenger1age);
        selectIndexByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[1]/td[4]/select",Integer.parseInt(passenger1gender));       
        waitProperty(2000);        
        enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[2]/input",passenger2name);
        enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[3]/input",passenger2age);  
        waitProperty(1000);
        selectVisibleTextByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[2]/td[4]/select",passenger2gender);
        enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[2]/input",passenger3name);    
        enterByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[3]/input",passenger3age);
        waitProperty(1000);
        selectIndexByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[4]/div[2]/table/tbody/tr[3]/td[4]/select", Integer.parseInt(passenger3gender));      
        waitProperty(2000);       
        selectVisibleTextByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[5]/div[4]/select",state);       
        waitProperty(1000);      
        clickByXpath("/html/body/app-root/acpassangers/main/div/section/form/div/div/div/div[6]/button[3]");
        verifyTextByClassName("ERR2", "Please Enter Valid GST number");
        
       
        

}}
