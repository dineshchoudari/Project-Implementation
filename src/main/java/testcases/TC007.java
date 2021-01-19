package testcases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utils.DP7;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	@Test(dataProvider="TC007fetchData",dataProviderClass=DP7.class)
	public void BookHotels (String start,String boardst,String room1,String email,String mobileno,String passenger1firstname,String passenger1lastname,
			String passenger1age,String passenger1gender,String passenger2firstname,String passenger2lastname,
			String passenger2age,String passenger2gender,String passenger3firstname,String passenger3lastname,
			String passenger3age,String passenger3gender,String nomineename,String relationwithpassenger,String contactno,String phoneno,
			String faxno,String address,String street,String state,String idcardtype,String idcardno){
		
		mouseOverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a");
		waitProperty(5000);
		clickByLink("Lounge");
		switchToLastWindow();
		clickByXpath("/html/body/app-root/homeheader/nav/div/div[2]/a[3]");
		clickByLink("Hill Railways");
		switchToLastWindow();
		waitProperty(3000);
		clickByXpath("//*[@id='test2']/div[1]/h3/a[3]");
		switchToLastWindow();
		waitProperty(2000);
		clickByXpath("/html/body/app-root/ng-component/div/div/div/div/a");
		waitProperty(2000);
		selectVisibleTextByName("country",start);
		waitProperty(2000);
		selectValueByName("boardst",boardst );
		waitProperty(3000);
		clickByXpath(" /html/body/app-root/tourpackagebooking/main/div/section/div/div/div/div[3]/form/div[3]/button");
         waitProperty(3000);
         //11
         selectVisibleTextByXpath("//*[@id='selectID0']",room1);
         waitProperty(4000);
        clickByXpath("/html/body/app-root/tourpackagebooking/main/div/section/div/div/div/div[3]/form/div[4]/button");
        waitProperty(2000);
        clickByXpath("/html/body/app-root/booklogin/main/div/section/div/div/div/div[2]/div/div/div/ul/li[2]/a");
        waitProperty(2000);
        enterByName("email", email);
        enterByName("mobileNo", mobileno);
        waitProperty(3000);
        clickByXpath("/html/body/app-root/booklogin/main/div/section/div/div/div/div[2]/div/div/div/div/div[2]/form/div/div[3]/button");
        waitProperty(2000);
        
        
        enterByName("item.firstName", passenger1firstname);
        enterByName("item.lastName",passenger1lastname);
        waitProperty(2000);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[1]/td[3]/span/input",passenger1age);
        selectIndexByName("item.gender",Integer.parseInt(passenger1gender));
        waitProperty(2000);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[2]/div/div[1]/input",passenger2firstname);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[2]/div/div[2]/input",passenger2lastname);
        
        waitProperty(2000);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[3]/span/input",passenger2age);
        selectIndexByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[2]/td[4]/select",Integer.parseInt(passenger2gender));
        waitProperty(2000);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div/div[1]/input",passenger3firstname);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[2]/div/div[2]/input",passenger3lastname );
        waitProperty(2000);
        enterByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[3]/input",passenger3age);
        selectIndexByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[3]/table/tbody/tr[3]/td[4]/select",Integer.parseInt(passenger3gender));
        waitProperty(2000);
        enterByName("nomineeName",nomineename);
        enterByName("RelationwithPassenger", relationwithpassenger);
        enterByName("contactNo", contactno);
        enterByName("phoneNo", phoneno);
        waitProperty(2000);
        enterByName("faxNo",faxno);      
        enterByName("address", address);
        enterByName("street",street);
        waitProperty(2000);
        selectVisibleTextByName("state",state);
    
        waitProperty(2000);       
        selectIndexByName("idcardType",Integer.parseInt(idcardtype));    
        
        waitProperty(2000);
        enterByName("idcardno", idcardno);
        waitProperty(2000);
        
        clickByXpath("/html/body/app-root/passangers/main/div/section/div/div/form/div/div[7]/button[2]");
        
        getTextByXpath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[5]/div[2]/div/table/tbody/tr[4]/td[2]");
        waitProperty(2000);
        enterByXpath( "//html/body", Keys.PAGE_DOWN);
        clickByXpath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[6]/div/div/label/span");
        waitProperty(2000);
        clickByXpath("/html/body/app-root/summery/main/div/section/div/div/form/div/div[7]/button[2]");
        waitProperty(2000);
        getAttValByXpath("//*[@id='payform']/div/div/div/div/div[1]/input", "value");
        getAttValByXpath("//*[@id='payform']/div/div/div/div/div[2]/input", "value ");
       
}}
