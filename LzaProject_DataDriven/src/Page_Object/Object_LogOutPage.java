package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import UI_Map.UI_LogOutPage;
import Test_Scripts.Scripts_LogInPage;
public class Object_LogOutPage {
	
	Scripts_LogInPage LogInPage;
	Object_HomePage objHome;
	UI_LogOutPage logOutPage;
	
	protected WebDriver driver;
		
	public Object_LogOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Click LogOut Header
	public void ClicklinkLogout(){
		
	//	logOutPage.getLogOutHeader().click();
		
		UI_LogOutPage LogOutPageheader = new UI_LogOutPage(driver);
		WebElement linkOutheader = LogOutPageheader.getLogOutHeader();
		linkOutheader.click(); 		
	}
	
	// Click Logout
	public void ClickLogOut(){
		UI_LogOutPage LogOutPage = new UI_LogOutPage(driver);
		WebElement LogOut = LogOutPage.getlinkLogOut();
		LogOut.click();
	}
}