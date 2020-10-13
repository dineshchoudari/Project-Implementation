package wrappers;
import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
public class GenewirWrappers implements Wrappers{
	RemoteWebDriver driver;	
	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The element with id "+idValue+" entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+idValue+" is not found in DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idValue+" is not stable in application");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The browser got closed due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The Element with Name"+nameValue+"entered with data"+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element with Name"+nameValue+"is not found in the DOM");
		}catch (ElementNotVisibleException e){
			System.err.println("The Element with Name"+nameValue+"is not visisble in application ");
		}catch (ElementNotInteractableException e){
			System.err.println("The Element with Name"+nameValue+"is not interacatble ");
		}catch (StaleElementReferenceException e){
			System.err.println("The Element with Name"+nameValue+"is not stable in the application");
		}catch(WebDriverException e){
			System.err.println("The element with name"+nameValue+" is not entered with data "+data);
		}finally{
			takeSnap();
		}				
	}

	public void enterByXpath(String xpathValue, Keys pageDown) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(pageDown);
			 System.out.println("The element with XPath "+xpathValue+" is entered with data "+pageDown);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			 System.err.println("The Element with xpath"+xpathValue+"is not found  in the dom ");		 
		}catch(ElementNotVisibleException e) { 
			 System.err.println("The Element with xpath"+xpathValue+"is not visible in the application ");
	   } catch(StaleElementReferenceException e){
		     System.err.println("The Element with xpath"+xpathValue+"is not stable in the application");
	   
	   } catch(ElementNotInteractableException e){	
		     System.err.println( "The Element with xpath"+xpathValue+"is not interactable ");
	   }catch(WebDriverException e){		   
		     System.err.println("The element with name"+xpathValue+" is not entered with data "+pageDown );
	   }finally{
		    takeSnap();
	   }
		   
	   }
		

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			    String actualTitle=driver.getTitle();
			if(actualTitle.equals(title))
			{
				System.out.println("The title"+title+"is  verified sccessfully");
			}else{
				//System.out.println("failed ");			
			}
		} catch (WebDriverException e) {	
			    System.err.println("The title"+title+"is  not verified sccessfully");	
		}  finally{
			
		   takeSnap();
		}
			
		
	}
	// TODO Auto-generated catch block
			
	public void verifyTextById(String id, String text) {
	
		try {
			String actualtext=driver.findElementById(id).getText();
			if(actualtext.equals(text)){
				System.out.println("Verified ");
			}else{
				System.out.println("Failed");
			}
			System.out.println("The text "+text+"is verified by using the locator id "+id);
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    System.err.println("The Element with id "+id+ "is not found on the dom ");
		}catch(ElementNotVisibleException e){
			
			System.err.println("The Element with id"+id+ "is not visible on the application ");
			
		}catch(WebDriverException e){
			System.err.println( "The text"+text+ "is not verified by using locator id +id+");
		}finally{
			takeSnap();
		}
	}
	public void verifyTextByXpath(String xpath, String expectedText) {
		// TODO Auto-generated method stub
		String	actualText = null; 
		try {
			  actualText=driver.findElementByXPath(xpath).getText();
			 if(actualText.equals(expectedText)){
			 System.out.println("Verified");
			 }else{
		     System.out.println("failed");
			 }
			 System.out.println("The text"+actualText+"is verified by using the locator id"+xpath);
		 }   catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
             System.err.println("The element with id"+xpath+"is not found on the dom ");
		}    catch (ElementNotVisibleException e){
			 System.err.println("The element with id"+xpath+"is not visible  on  the application "+xpath);
		}    catch(WebDriverException e ){
			 System.err.println("The text"+actualText+"is not verified by using locator id "+xpath);
		}finally{
			takeSnap();
		}
	    	 
	
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String	actualtext=driver.findElementByXPath(xpath).getText();
			if(actualtext.equals(text)){
				System.out.println("verified");
			}else if(actualtext.contains(text)){
				System.out.println("verified");
				}else{
				System.out.println("failed ");
				}
			    System.out.println("The text"+text+" is verified by using the locator id "+xpath);
		} catch (NoSuchElementException e) {
			    System.err.println("The text"+text+ "is not found on the DOM ");
		}catch (ElementNotVisibleException e){
			    System.err.println("The text"+text+"is not visible in the Application ");
		}catch (WebDriverException e){
			    System.err.println("The text"+text+"is not verified by using  locator id "+xpath);
			
		}finally{
			
		takeSnap();
		}
			
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("The Element is able to click with the locator id"+id);
		} catch (ElementClickInterceptedException e) {
			System.err.println("The Element with id"+id+"is concealing  the element which was requested to clicked");
		} catch(NoSuchElementException e){
			System.err.println("The Element with id"+id+"is not able to found in  the DOM ");
		} catch(WebDriverException e){
			System.err.println("The Element is not able to click with locator id"+id);
		}finally{
		   takeSnap();
		}				
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The Element is able to click with the locator classname "+classVal);
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
		    System.err.println("The Element with classname"+classVal+"is concealing the element which was requested to click ");
		}catch(NoSuchElementException e){
			System.err.println("The Element with classname"+classVal+" is not able to found in the DOM ");
		}catch(ElementNotVisibleException e){
			System.err.println("The Element with classname"+classVal+ "is not visible in the application ");	
		}catch(WebDriverException e){
			System.err.println("The Element is not able to click with locator classname "+classVal);			
		}finally{
			takeSnap();
		}
		}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			 System.out.println("The Element is able to click with the locator name"+name);
		} catch (ElementClickInterceptedException e) {
			 System.err.println("The Element with name "+name+"is concealing the element which was requested to click");		
		}catch(ElementNotInteractableException e){
		     System.err.println("The element with name" +name+ "is able to found in the DOM, but cannot interact with the element");	
		}catch(NoSuchElementException e){		
			 System.err.println("The Element with name"+name+"is not able to found in the DOM");
		}catch(WebDriverException e){
			 System.err.println("The Element is not able to click with locator name"+name);
		}finally{			
		takeSnap();			
		}
}
		

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The Element is able to click with the locator  linktext"+name);
		} catch (ElementClickInterceptedException e) {
			System.err.println("The Element with linktext "+name+ "is concealing the element which was requested to click ");			
		}catch(ElementNotInteractableException e){
			System.err.println("The Element with linktext"+name+"is able to found in the DOM ,but cannot interact with the element");
		}catch(NoSuchElementException e){
		    System.err.println("The Element with linktext"+name+"is not able to find in the DOM   ");
		}catch(WebDriverException e){
			System.err.println("The Element is not able to click with locator linktext "+name);
		}finally{
			takeSnap();	
		}
	}
	public void clickByLinkNoSnap(String name) {
     try {
		driver.findElementByLinkText(name).click();
		System.out.println("The Element is able to click with the locator linktext"+name);		
	}catch(NoSuchElementException e){
		System.err.println("The Element with linktext"+name+"is not able to found inthe DOM");		
	}catch(ElementNotVisibleException e){
		System.err.println("The Element with linktext"+name+"is not visible in the application ");	
	}catch(ElementClickInterceptedException e){
		System.err.println("The Element with linktext"+name+"is concealing the element which was requested to click ");
	}catch(ElementNotInteractableException e){
		System.err.println("The Element with linktext"+name+"is able to found in the Dom ,but cannot interact with the element ");	
	}catch(WebDriverException e){
		System.err.println("The Element is not able to click with locator linktext"+name);		
	}	
	}
	public void clickByXpath(String xpathVal) {
       try {
   		driver.findElementByXPath(xpathVal).click();
	     	System.out.println("The Element is able to click with the locator xpathVal"+xpathVal);
	  }  catch (NoSuchElementException e){
		    System.err.println("The Element with xpathVal"+xpathVal+"is not able to found inthe DOM ");
	}    catch(ElementNotVisibleException e){
		    System.err.println("The Element with xpathVal"+xpathVal+"is not visible in the application");			
	    }catch(ElementClickInterceptedException e){
			System.err.println("The Element with xpathVal"+xpathVal+"is concealing the element which was requested to click ");
		}catch(ElementNotInteractableException e){
			System.err.println("The Element with xpathVal"+xpathVal+"is able to found in the DOM ,but cannot interact with the element ");
		}catch(WebDriverException e){
			System.err.println("The Element is not able to click with the locator xpathVal"+xpathVal);
		}finally{
			takeSnap();
		}
	}	
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		 try {
				driver.findElementByXPath(xpathVal).click();
				System.out.println("The Element is able to click with the locator xpath"+xpathVal);		
			}catch(NoSuchElementException e){
				System.err.println("The Element with xpath"+xpathVal+"is not able to found inthe DOM");		
			}catch(ElementNotVisibleException e){
				System.err.println("The Element with xpath"+xpathVal+"is not visible in the application ");	
			}catch(ElementClickInterceptedException e){
				System.err.println("The Element with xpath"+xpathVal+"is concealing the element which was requested to click ");
			}catch(ElementNotInteractableException e){
				System.err.println("The Element with xpath"+xpathVal+"is able to found in the Dom ,but cannot interact with the element ");	
			} catch(WebDriverException e){
				System.err.println("The Element is not able to click with locator xpathVal"+xpathVal);		
			}		
	}
public void verifyTextByClassName(String classname, String text) {
		
		try {
			String actualtext=driver.findElementByClassName(classname).getText();
			if (actualtext.equals(text)) {
				System.out.println("verified");
			}else {
				System.out.println("Failed");
			}
			System.out.println("The text "+text+" is verified by using the locator classname "+classname);
			
		} catch (NoSuchElementException e) {
		
			System.err.println("The element with classname "+classname+" is not found in the DOM");
			
		}catch (ElementNotVisibleException e) {
		
			System.err.println("The element with classname "+classname+" is not visible in the application");
			
		}catch (WebDriverException e) {
		
			System.err.println("The text "+text+" is not verified by using locator classname "+classname);
		
		}finally {
			
		}
	}
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			text=driver.findElementById(idVal).getText();
			System.out.println("Text");
			System.out.println("The Element is able to get the text with the locator id"+idVal);
		} catch (NoSuchElementException e) {		
	        System.err.println("The Element with locator id"+idVal+"is not able to found in the DOM");
		}catch(ElementNotVisibleException e){
			System.err.println("The Element with locator id"+idVal+"is not visible in the applicaton ");
		}catch(ScriptTimeoutException e){
			System.err.println("Script takes more time to find the element than the specified time to return the value ");
		}catch(WebDriverException e ){
			System.err.println("The element with locator id"+idVal+"is not able to get the text ");
		}finally {
			takeSnap();
		}
		return text;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).getText();
			System.out.println("Text");
			System.out.println("The Element is able to get the text with the locator xpath"+xpathVal);
		} catch (NoSuchElementException e) {		
	        System.err.println("The Element with locator xpath"+xpathVal+"is not able to found in the DOM");
		}catch(ElementNotVisibleException e){
			System.err.println("The Element with locator xpath"+xpathVal+"is not visible in the applicaton ");
		}catch(ScriptTimeoutException e){
			System.err.println("Script takes more time to find the element than the specified time to return the value ");
		}catch(WebDriverException e ){
			System.err.println("The element with locator xpath"+xpathVal+"is not able to get the text ");
		}finally {
			takeSnap();
		}
		return null;
	}
	

	public void selectVisibileTextById(String id, String value) {
		try {
			WebElement dropdown=driver.findElementById(id);
			Select d=new Select(dropdown);
			d.selectByVisibleText(value);
			System.out.println("The Element with locator"+id+"is able to select the dropdown by visible text value "+value );			
		} catch (NoSuchElementException e) {
			System.err.println("The Element with locator id"+id+"is not able to found in the DOM");
		}catch(ElementNotVisibleException e){
      		System.err.println("The Element with locator id"+id+"is not visible in the application ");			
		}catch(ElementNotSelectableException e){
			System.err.println("The Element with locator id"+id+"is presented in the DOM ,but not able to selectable with the textvalue "+value );
		}catch(WebDriverException e){
			System.err.println("The Element with locator id" +id+"is not able to select with the drop down by  visible text value "+value  );
		}finally{
			takeSnap();
		}
	}

	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown=driver.findElementByXPath(xpath);
			Select d=new Select(dropdown);
			d.selectByVisibleText(value);
			System.out.println("The element with locator xpath "+xpath+" is able to select the drop down by visible text value "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with locator xpath "+xpath+" is not able to locate the text value"+value);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is present in the DOM, but not able to select the text value "+value);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is not able to select the drop down by visible text value "+value);
		}finally {
			takeSnap();
		
		}					
	}
	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown=driver.findElementByXPath(xpath);
			Select d=new Select(dropdown);
			d.selectByIndex(value);
			System.out.println("The element with locator xpath "+xpath+" is able to select the drop down with index "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with locator xpath "+xpath+" is not able to locate with index "+value);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is present in the DOM, but not able to select with index value "+value);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is not able to select the drop down with index "+value);
		}finally {
			takeSnap();
		
		}			
	}
	public void selectValueById(String id, String value) {
		
		try {
			WebElement dropdown=driver.findElementById(id);
			Select d=new Select(dropdown);
			d.selectByValue(value);
			System.out.println("The element with locator "+id+" is able to select the drop down by value "+value);
			
		} catch (NoSuchElementException e) {
			
			System.err.println("The element with locator id "+id+" is not able to locate the value"+value);
			
		}catch (ElementNotVisibleException e) {
			
			System.err.println("The element with locator id "+id+" is not visible in the application");
			
		}catch (ElementNotSelectableException e) {
			
			System.err.println("The element with locator id "+id+" is present in the DOM, but not able to select the value "+value);
			
		}catch (WebDriverException e) {
			
			System.err.println("The element with locator id "+id+" is not able to select the drop down by value "+value);
			
		}				
		}
public void selectVisibleTextByName(String name, String value) {
		
		try {
			WebElement dropdown=driver.findElementByName(name);
			Select d=new Select(dropdown);
			d.selectByVisibleText(value);
			System.out.println("The element with locator name "+name+" is able to select the drop down by value "+value);
			
		} catch (NoSuchElementException e) {
		
			System.err.println("The element with locator name "+name+" is not able to locate the value"+value);
			
		}catch (ElementNotVisibleException e) {
		
			System.err.println("The element with locator name "+name+" is not visible in the application");
			
		}catch (ElementNotSelectableException e) {
		
			System.err.println("The element with locator name "+name+" is present in the DOM, but not able to select the value "+value);

		}catch (WebDriverException e) {
		
			System.err.println("The element with locator name "+name+" is not able to select the drop down by value "+value);
			
		}finally {
			
		
		}				
	}
public void selectIndexByName(String name, int value) {
		
		try {
			WebElement dropdown=driver.findElementByName(name);
			Select d=new Select(dropdown);
			d.selectByIndex(value);
			System.out.println("The element with locator name "+name+" is able to select the drop down with index "+value);
			
		} catch (NoSuchElementException e) {
		
			System.err.println("The element with locator name "+name+" is not able to locate with index "+value);
			
			}catch (ElementNotVisibleException e) {
			
			System.err.println("The element with locator name "+name+" is not visible in the application");
				
		}catch (ElementNotSelectableException e) {
		
			System.err.println("The element with locator name "+name+" is present in the DOM, but not able to select with index value "+value);
			
		}catch (WebDriverException e) {
		
			System.err.println("The element with locator name "+name+" is not able to select the drop down with index "+value);
			
		}			
	}


	public void selectIndexById(String id, int string) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown=driver.findElementById(id);
			Select d=new Select(dropdown);
			d.selectByIndex(string);
			System.out.println("The Element with locator"+id+"is able to select the dropdown with index "+string );			
		} catch (NoSuchElementException e) {
			System.err.println("The element with locator id "+id+" is not able to locate with index "+string);
		}catch(ElementNotVisibleException e){
      		System.err.println("The Element with locator id"+id+"is not visible in the application ");			
		}catch(ElementNotSelectableException e){
			System.err.println("The Element with locator id"+id+"is presented in the DOM ,but not able to selectable with the indexvalue "+string );
		}catch(WebDriverException e){
			System.err.println("The Element with locator id" +id+"is not able to select with the drop down by  index value "+string  );
		}finally{
			takeSnap();
		}
	}
	
	public void selectValueByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown=driver.findElementByXPath(xpath);
			Select d=new Select(dropdown);
			d.selectByValue(value);
			System.out.println("The element with locator xpath "+xpath+" is able to select the drop down by value "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with locator xpath "+xpath+" is not able to locate the value"+value);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with locator xpath "+xpath+" is present in the DOM, but not able to select the value "+value);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.out.println(e);
			System.err.println("The element with locator xpath "+xpath+" is not able to select the drop down by value "+value);
		}finally {
			takeSnap();
		
		}					
	}
	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown=driver.findElementByName(name);
			Select d=new Select(dropdown);
			d.selectByValue(value);
			System.out.println("The element with locator name "+name+" is able to select the drop down by value "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with locator name "+name+" is not able to locate the value"+value);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with locator name "+name+" is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with locator name "+name+" is present in the DOM, but not able to select the value "+value);
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with locator name "+name+" is not able to select the drop down by value "+value);
		}finally {
			takeSnap();
		
		}					
	}

	public void switchToParentWindow() {		
    try {
		Set<String> allwindowids = driver.getWindowHandles();	
		    System.out.println("all window ids are"+allwindowids);
		for(String parentwindow:allwindowids){
			System.out.println("parent window id is"+parentwindow);
			driver.switchTo().window(parentwindow);
			break;
			}
			System.out.println("The Window is sucessfully swithced to parent window ");		
	} catch (SessionNotCreatedException e) {
		    System.err.println("A New Session Cannot be created sucessfully ");
	}catch(NoSuchWindowException e){
		    System.err.println("The Target window to switch is not exist ");		
	}catch(WebDriverException e){
		    System.err.println("The Window is not sucessfully switched to parent window ");
	}finally{
		takeSnap();
	}		
	}

	public void switchToLastWindow() {
		try {
			Set<String>allwindowids=driver.getWindowHandles();
				System.out.println("all windowids are"+allwindowids);
				for(String lastwindowid:allwindowids){
					System.out.println("last window is "+lastwindowid);
					driver.switchTo().window(lastwindowid);
										
				}
		} catch (SessionNotCreatedException e) {
			System.err.println("A New Session Cannot be created sucessfully");
		}catch(NoSuchWindowException e){		
			System.err.println("The Target window to switch is not exist ");
		}catch(WebDriverException e){
			System.err.println("The Window is not sucessfully switched to last window ");
		}finally{
			takeSnap();	
		}}
		
	

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().getText();
			System.out.println("The opened Alert is sucessfully accepted ");
		} catch (NoAlertPresentException e) {
			System.err.println("switch to not presented  alert ");
		}catch(UnhandledAlertException e ){
			System.err.println("Webdriver is unable to perform  alert operation ");
		}catch(WebDriverException e ){
			System.err.println("The opened Alert is not able to accept by  webdriver");
		}finally {
			takeSnap();
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();;
			System.out.println("The opened Alert is sucessfully dissmiss ");
		} catch (NoAlertPresentException e) {
			System.err.println("switch to not presented  alert ");
		}catch(UnhandledAlertException e ){
			System.err.println("Webdriver is unable to perform  alert operation ");
		}catch(WebDriverException e ){
			System.err.println("The opened Alert is not able to dismiss by webdriver ");
		}finally {
			takeSnap();
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub		
		try {
			driver.switchTo().alert().getText();
			System.out.println("text");
			System.out.println("The Text is able to gathered from the opened alert ");			
		} catch (NoAlertPresentException e) {
			System.err.println("switched to not presented  alert");		
		}catch(UnhandledAlertException e){
			System.err.println("Webdriver is unable to perform  alert operation ");
		}catch(ScriptTimeoutException e ){
			System.err.println("Script takes more time than the given time limit to return the value ");
		}catch(WebDriverException e ){
			System.err.println("The text is not able to gather from opened alert ");
		}finally {
			takeSnap();
		}
		return null;
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("The current browser  is sucessfully closed ");
		} catch (WebDriverException e) {
			System.err.println("The current browser  is not sucessfully  closed  ");
		}finally{
			takeSnap();
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("All browsers are closed sucessfully  ");
		} catch (WebDriverException e) {
			System.err.println("All browsers are not closed sucessfully ");
		}finally {
			takeSnap();
		}
	
		
	}
	public void mouseOverByXpath(String xpath) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElementByXPath(xpath)).perform();
			System.out.println("The mouse pointer is focused over the webelement with the XPATH: '" + xpath + "' successfully.");
			
		} catch (NoSuchElementException e) {
			System.err.println("The webelement with the XPATH: '" + xpath + "' is not found.");
			
		} catch (ElementNotVisibleException e) {
			System.err.println("The webelement with the XPATH: '" + xpath + "' is not visible.");
			
		} catch (ElementNotInteractableException e) {
			System.err.println("The webelement with the XPATH '" + xpath + "' is not enabled.");
			
		} catch (WebDriverException e) {
			System.err.println("The application got crashed for unknown error.");
			
		} 
	}
	
	public String getAttValByXpath(String xpathVal, String strAttribute) {
		String strText = null;
		try {
			strText = driver.findElementByXPath(xpathVal).getAttribute(strAttribute);
			System.out.println("The webelement with the XPATH: '" + xpathVal + "' and having attribute '" + strAttribute+ "' is identified successfully and the available text is '" + strText + "'.");			
		} catch (NoSuchElementException e) {
			System.err.println("The webelement with the XPATH: '" + xpathVal + "' is not found.");			
		} catch (ElementNotVisibleException e) {
			System.err.println("The webelement with the XPATH: '" + xpathVal + "' is not visible.");			
		} catch (ElementNotInteractableException e) {
			System.err.println("The webelement with the XPATH: '" + xpathVal + "' is not enabled.");
		} catch (WebDriverException e) {
			System.err.println("The application got crashed for unknown error.");
		} 
		return strText;
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void enterByXpath(String xpathValue, String data) {
			// TODO Auto-generated method stub
			try {
				driver.findElementByXPath(xpathValue).sendKeys(data);
				 System.out.println("The element with XPath "+xpathValue+" is entered with data "+data);
			} catch (StaleElementReferenceException e) {
				// TODO Auto-generated catch block
				System.err.println("The element with xpath "+xpathValue+" is detached from the DOM");
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				System.err.println("The element with xpath"+xpathValue+" is not found in the DOM");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			}catch (WebDriverException e) {
				// TODO: handle exception
				System.err.println("The element with XPath "+xpathValue+" is not entered with data "+data);
			}finally {
				takeSnap();
			} 
		}

		public void invokeApp(String browser, String url) {
			    try {
				if(browser.equalsIgnoreCase("chrome")){
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					 driver = new ChromeDriver();
				}else if(browser.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					 driver = new FirefoxDriver();
				}else if(browser.equalsIgnoreCase("ie")){
					System.setProperty("webdriver.ie.driver", "./drivers/iedriver.exe");
					 driver = new InternetExplorerDriver();
				}
				driver.manage().window().maximize();
				driver.get(url);
				System.out.println("The browser "+browser+" is launched successfully with url "+url);
			} catch (SessionNotCreatedException e) {
				// TODO Auto-generated catch block
				System.err.println("The browser "+browser+" is not launched due to session not created error");
			} catch (WebDriverException e) {
				// TODO: handle exception
				System.out.println("The browser "+browser+" is not launched due to known error");
			}finally {
				takeSnap();
			}	
			
		}
			
		}

		
	




		
