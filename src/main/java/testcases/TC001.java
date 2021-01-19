package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utils.DP1;
import wrappers.ProjectWrappers;
public class TC001 extends ProjectWrappers{
	
	     @Test(dataProvider="TC001fetchData",dataProviderClass=DP1.class)
	    public void irctcRegistration(String userName, String password, String confirmPassword, String Secanswer, String firstname,
	    String middlename, String lastname, String gender, String dateofBirth, String email, String mobile, String nationality,
	    String flat, String streetlane, String area, String pincode, String state, String town, String postoffice, String phone,
	    String flat1, String streetlane1, String area1, String pincode1, String state1, String city1, String postoffice1, String phone1)
	  {
	    //click on register
	 	clickByXpath("//a[text()=' REGISTER ']");
		waitProperty(4000);
		enterById("userName", userName);
		enterById("usrPwd", password);
		enterById("cnfUsrPwd", confirmPassword);
		waitProperty(4000);	
		//Security Question
		clickByXpath("//label[@class='ng-tns-c13-8 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']");
		clickByXpath("//span[text()='What was the name of your first school?']");
		//Security Answer
		enterByXpath("//input[@formcontrolname='secAns']", Secanswer);
		//Preffered Language
		clickByXpath("//label[@class='ng-tns-c13-8 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']");
		clickByXpath("//span[text()='English']");
	    enterById("firstName", firstname);
	    enterById("middleName", middlename);
		enterById("lastname",lastname);
		clickById(gender);
		//Date of birth
		enterByXpath("//input[@type='text' and @class='ng-tns-c14-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']",dateofBirth );
		waitProperty(2000);
		//Occupation
		clickByXpath("//label[text()='Select Occupation']");
		clickByXpath("//span[text()='PROFESSIONAL']");
		waitProperty(2000);
		//Country
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/li[4]/span");
		enterById("email", email);
        enterById("mobile", mobile);
        //Nationality
		selectValueByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[13]/div[5]/select",nationality);
		enterByName("resAddress1", flat);
		enterByName("resAddress2", streetlane);
		//enterByName("resAddress2", "PODALAKUR ROAD");
		enterByName("resAddress3", area);
		enterByName("resPinCode", pincode);
		enterById("resState", state);
		waitProperty(2000);
		//City
		selectValueByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[17]/div[4]/select", town);	
		waitProperty(3000);
		//postoffice
		selectIndexByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[18]/div[2]/select", Integer.parseInt(postoffice));
		enterById("resPhone", phone);
		//Copy Residence to office Address click as no
		clickByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[19]/div[3]/input");
		enterByName("offAddress1", flat1);
		enterById("offAddress2", streetlane1);
		enterById("offAddress3", area1);
		enterById("offPinCode", pincode1);
		enterById("offState", state1);
		//city/town
		selectIndexByXpath(" //*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[20]/div[5]/div[2]/select", Integer.parseInt(city1));
		waitProperty(3000);	
		//Post Office 
		selectVisibleTextByXpath("//*[@id='divMain']/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[20]/div[5]/div[4]/select", postoffice1);
		enterById("offPhone", phone1);
		enterByXpath("//html/body", Keys.PAGE_DOWN);
		//Terms and Conditions 
		clickByXpath("//input[@type='checkbox'and @class='ng-dirty ng-valid ng-touched']");
		//*[@id="divMain"]/div/app-user-registration/div[2]/div/div[2]/div[4]/form/div[22]/div/input
		//input[@type='checkbox'and @class='ng-dirty ng-valid ng-touched']
	
}}
