package testcases;
import org.testng.annotations.Test;

import utils.DP8;
import wrappers.ProjectWrappers;
public class TC008 extends ProjectWrappers{
	@Test(dataProvider="TC008fetchData",dataProviderClass=DP8.class)
	public void BookHotels2(String email, String mobileno,String input,String hotelroom,String hoteladult,
	String title,String firstname,String lastname,String gst,String gstnumber,String companyname,String companyaddress){
		
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
		enterByName("email", email);
		enterByName("mobileNo",mobileno);
		waitProperty(3000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/homeheader/div/app-loginmodal/div/div/div/div/div[2]/div[1]/form/div[3]/button");
		waitProperty(2000);
		enterByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[1]/searchbox/input", input);
		waitProperty(2000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[1]/searchbox/div/ul/li/a/div[2]/strong");
		clickByName("dt12");
		waitProperty(2000);
		clickByXpath("//*[@id='owl-dt-picker-0']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[4]/span");
		clickByName("dt13");
		waitProperty(2000);
		clickByXpath("//*[@id='owl-dt-picker-1']/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[5]/td[5]/span");
		clickByName("guest");
		waitProperty(2000);
		selectValueByName("hotelRoom",hotelroom);
		waitProperty(2000);
		selectVisibleTextByName("hotelAdult",hoteladult);
		waitProperty(2000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[4]/div/div/div[2]/button");
		waitProperty(2000);
        clickByXpath("/html/body/app-root/app-fulllayout/div/app-home/div/div/div/div/div[2]/div/app-hotelmodify/form/div/div[5]");
		waitProperty(40000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button");
		waitProperty(40000);
		getTextByXpath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3");
		getTextByXpath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/p");
		clickByXpath("//*[@id='hotel-dtl-sticky-photo']/div[1]/div[1]/div[2]/div/div/div[4]/button");
	    waitProperty(2000);
		selectVisibleTextByName("title", title);
		waitProperty(2000);
		enterByName("firstName",firstname);
		enterByName("lastName",lastname);
		selectValueByName("gst", gst);
		waitProperty(2000);
		enterByName("gstNumber", gstnumber);
		enterByName( "companyName",companyname);
		waitProperty(2000);
		enterByName("companyAddress", companyaddress);
		waitProperty(2000);
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[10]/button[2]");
		getTextByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[7]/div/span");
		waitProperty(2000);		
		
}}
