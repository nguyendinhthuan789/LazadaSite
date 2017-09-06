package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Object_HomePage {
	
	protected WebDriver driver;
	
	public Object_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	//Verify Page Title Login
	public String verifyPageTitle() {
		String PageTitle=Test_Data.GlobalVariables.Login_Successfully.toString();
		 getPageTitle().contains(PageTitle);
		return PageTitle;
	}
	
	//Verify Page Title LogOut
	public String verifyPageTitleLogOut(){
		String PageTitleLogOut=Test_Data.GlobalVariables.Logout_Successfully.toString();
		getPageTitle().contains(PageTitleLogOut);
		return PageTitleLogOut;
	}
	
	//Verify Page Title Search Mobile valid
	public String verifyPagteTitleSearchMobile(){
		String PageTileSearch=Test_Data.GlobalVariables.Search_Successfully.toString();
		getPageTitle().contains(PageTileSearch);
		return PageTileSearch;
	}
}

