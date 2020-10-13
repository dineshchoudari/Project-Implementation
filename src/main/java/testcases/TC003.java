package testcases;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utils.DP3;
import wrappers.ProjectWrappers;
public class TC003 extends ProjectWrappers {
	@Test(dataProvider="TC003fetchData",dataProviderClass=DP3.class)
	public void NationalVotersServicesPortal(String userid,String password,String confirmpassword,String secqstn,String secanswer,
		String dateofbirth,String email,String occupation,String firstname,String middlename,String lastname,String nationality	
		,String flatno,String street,String area,String country,String mobile,String pincode,String city,String state,String postoffice,
		String flatnooffice,String streetoffice,String areaoffice,String countryoffice,String mobileoffice,String pincodeoffice,String cityoffice,
		String stateoffice,String postofficeoffice)

	   {
		mouseOverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(2000);
		clickByLink("Lounge");
		waitProperty(1000);
		switchToLastWindow();
		clickByXpath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]");
		clickByLink("Book Your Coach/Train");
		switchToLastWindow();
		clickByLink("New User? Signup");
		waitProperty(2000);
		enterById("userId",userid);
		enterById("password", password);
		enterById("cnfPassword", confirmpassword);
		selectVisibileTextById("secQstn", secqstn);
		enterById("secAnswer", secanswer);
		waitProperty(2000);
		enterById("dateOfBirth", dateofbirth);
		clickById("gender0");
		clickById("maritalStatus0");
		enterById("email", email);
		selectIndexById("occupation", Integer.parseInt(occupation));
		enterById("fname", firstname);
		enterById("mname", middlename);
		enterById("lname", lastname);
		selectValueById("natinality", nationality);
		enterById("flatNo", flatno);
		enterById("street", street);
		enterById("area", area);
		waitProperty(2000);
		selectIndexById("country",Integer.parseInt(country));
		enterById("mobile",mobile);
		enterById("pincode",pincode);
		waitProperty(5000);
		enterByXpath("//html/body", Keys.TAB);
        selectIndexByXpath("//*[@id='city']",Integer.parseInt(city));
        waitProperty(2000);
        enterByXpath("//html/body", Keys.PAGE_DOWN);
        selectIndexById("state",Integer.parseInt(state));
        waitProperty(2000);
        enterByXpath("//html/body", Keys.PAGE_DOWN);   
        selectVisibileTextById("postOffice", postoffice);
        clickById("sameAddresses1");
        enterById("flatNoOffice", flatnooffice);
        enterById("streetOffice", streetoffice);
        enterById("areaOffice", areaoffice);
        selectIndexById("countryOffice", Integer.parseInt(countryoffice));
        enterById("mobileOffice", mobileoffice);
        enterById("pincodeOffice", pincodeoffice);
        waitProperty(5000);
        enterByXpath("//html/body", Keys.TAB);
        selectValueByXpath("//*[@id='cityOffice']", cityoffice);
        waitProperty(3000);
        selectValueByXpath("//*[@id='stateOffice']", stateoffice);
        waitProperty(3000);
        selectValueByXpath("//*[@id='postOfficeOffice']", postofficeoffice);
        
        
}}
