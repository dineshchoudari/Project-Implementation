package testcases;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utils.DP6;
import wrappers.ProjectWrappers;
public class TC006 extends ProjectWrappers {
	@Test(dataProvider="TC006fetchData",dataProviderClass=DP6.class)
	public void BookHotels (String email,String mobileNo,String searchbox,String hotelRoom, String hotelAdult,
			String title,String firstname,String lastname){
		
		mouseOverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(5000);
		clickByLink("Lounge");
		switchToLastWindow();
		clickByXpath("/html/body/app-root/accommodation/div/div/div/div/div/div/div[3]/a[3]/span");
		waitProperty(2000);
		switchToLastWindow();
		waitProperty(2000);
		clickByLink("Login");
		waitProperty(2000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/homeheader/div/app-loginmodal/div/div/div/ul/li[2]/a");
		waitProperty(2000);
		enterByName("email",email);
		enterByName("mobileNo",mobileNo);
	    waitProperty(3000);	   
	    clickByXpath("/html/body/app-root/app-fulllayout/div/homeheader/div/app-loginmodal/div/div/div/div/div[2]/div[1]/form/div[3]/button");
	    waitProperty(2000);
	    enterByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[1]/searchbox/input",searchbox);
	    waitProperty(2000);    
	    clickByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[1]/searchbox/div/ul/li/a/div[2]/strong");
	    clickByName("dt12");
	    waitProperty(2000);
	    clickByXpath("//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[6]/span");
	    clickByName("dt13");
	    waitProperty(2000);
	    clickByXpath("//*[@id='owl-dt-picker-1']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[7]/span");
	    clickByName("guest");
	    waitProperty(2000);
		selectValueByName("hotelRoom", hotelRoom);
		waitProperty(2000);
		selectVisibleTextByName("hotelAdult", hotelAdult);
		waitProperty(2000);		
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[4]/div/div/div[2]/button");
		waitProperty(2000);	
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[5]");
		waitProperty(20000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button");	
		waitProperty(20000);
		getTextByXpath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3");
		getTextByXpath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/p");
		clickByXpath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/div[4]/button");		
		waitProperty(2000);
		selectVisibleTextByName("title", title);
		waitProperty(20000);
		enterByName("firstName", firstname);
		enterByName("lastName", lastname);
		waitProperty(20000);
		getTextByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[2]/div/div/div[1]/span");
		waitProperty(2000);
		getTextByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[2]/div/div/div[5]/span");
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[7]/button[2]");
		waitProperty(2000);
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		waitProperty(2000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-summary/main/div/div[1]/div[6]/label");
		waitProperty(2000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-summary/main/div/div[1]/div[7]/button[2]");
		waitProperty(2000);
		clickByXpath("//*[@id='OTPModal']/div/div/form/div[2]/button");
       
             
}}
