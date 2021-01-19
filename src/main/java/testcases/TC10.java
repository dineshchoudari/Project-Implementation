package testcases;

import org.testng.annotations.Test;

import utils.DP10;
import wrappers.ProjectWrappers;
public class TC10 extends ProjectWrappers{
		@Test(dataProvider="TC10fetchData",dataProviderClass=DP10.class)
		public void Formc(String userid,String userpassword,String userrepassword,String secq,String secans,	
			String username,String gender,String dateofbirth,String designation,String emailid,String mobile,String phone,String nationality,
			String name,String capacity,String address,String state,String city,String acctype,String starrating,String email,String mcontact,
			String contact,String passenger1name,String passenger1address,String passenger1state,String passenger1citydistrict,String passenger1emailid,
			String passenger1phoneno,String passenger1mobile,String passenger2name,String passenger2address,String passenger2state,String passenger2citydistrict,String passenger2emailid,
			String passenger2phoneno,String passenger2mobile,String passenger3name,String passenger3address,String passenger3state,String passenger3citydistrict,String passenger3emailid,
			String passenger3phoneno,String passenger3mobile)
		
		{
			clickByXpath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a");
			enterByName("u_id", userid);
			enterById("u_pwd", userpassword);
			enterById("u_repwd",userrepassword);
			selectVisibileTextById("u_secques", secq);
			waitProperty(2000);
			enterById("u_secans", secans);
			enterByName("u_name",username);
			waitProperty(2000);
			selectValueById("u_gender",gender);
			waitProperty(2000);			
			enterById("u_dob", dateofbirth);
			enterById("u_designation",designation);
			enterById("u_emailid",emailid);
			enterById("u_mobile",mobile);
			enterById("u_phone",phone);
			selectIndexById("u_nationality", Integer.parseInt(nationality));
			waitProperty(2000);
			enterByName("name",name);
			enterById("capacity", capacity);
			enterById("address",address);
			waitProperty(2000);
		    selectVisibileTextById("state",state);
			waitProperty(2000);
			selectValueById("city_distr",city );
			waitProperty(2000);
			selectVisibileTextById("acco_type", acctype);
			waitProperty(2000);
			selectVisibileTextById("star_rat",starrating);
			waitProperty(2000);
			enterByName("email",email);
			waitProperty(2000);
			enterByName("mcontact",mcontact);
			waitProperty(2000);		
			enterByName("contact",contact);
			waitProperty(2000);			
			enterByName("name_o", passenger1name);
			enterByName("address_o",passenger1address);
			waitProperty(2000);
			selectVisibleTextByName("state_o", passenger1state);
			waitProperty(2000);
			selectValueByName("citydistr_o",passenger1citydistrict);
			waitProperty(2000);
			enterByName("emailid_o", passenger1emailid);
			enterByName("phoneno_o", passenger1phoneno);
			waitProperty(2000);
			enterByName("mobile_o",passenger1mobile );
			waitProperty(3000);
			clickByName("add");
			enterByName("name_o", passenger2name);
			enterByName("address_o", passenger2address);
			waitProperty(2000);
			selectVisibleTextByName("state_o",passenger2state);
			waitProperty(2000);
			selectValueByName("citydistr_o", passenger2citydistrict);
			waitProperty(2000);
			enterByName("emailid_o", passenger2emailid);
			enterByName("phoneno_o", passenger2phoneno);
			waitProperty(2000);
			enterByName("mobile_o",passenger2mobile);
			waitProperty(3000);
			clickByName("add");
			enterByName("name_o", passenger3name);
			enterByName("address_o", passenger3address);
			waitProperty(2000);
			selectVisibleTextByName("state_o", passenger3state);		
			waitProperty(2000);
			selectValueByName("citydistr_o", passenger3citydistrict);
			waitProperty(2000);
			enterByName("emailid_o",passenger3emailid );
			enterByName("phoneno_o",passenger3phoneno);
			waitProperty(2000);
			enterByName("mobile_o", passenger3mobile);
			waitProperty(3000);
			clickByName("add");
			waitProperty(6000);
            
	}

	}


