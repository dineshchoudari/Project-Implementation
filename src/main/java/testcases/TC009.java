package testcases;
import org.testng.annotations.Test;

import utils.DP9;
import wrappers.ProjectWrappers;
public class TC009 extends ProjectWrappers{
	@Test(dataProvider="TC009fetchData",dataProviderClass=DP9.class)
	public void Bookmobile (String input){			
		clickByXpath("/html/body/div[2]/div/div/button");
		waitProperty(2000);
		enterByXpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input",input);
		waitProperty(2000);
		clickByXpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
		waitProperty(2000);
		clickByXpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]");		
		switchToLastWindow();
		getTextByXpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]");
		getTextByXpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span");
		waitProperty(2000);
		clickByXpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
		//*[@id="container"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button
		waitProperty(5000);
		getTextByXpath("//*[@id='container']/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[3]/div/span");
		waitProperty(2000);
		getTextByXpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/a");			
		
}

}
