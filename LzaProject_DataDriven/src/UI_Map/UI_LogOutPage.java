package UI_Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UI_LogOutPage {
	
	WebDriver driver;
	
	public UI_LogOutPage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	// Fill LogOut Header        
	@FindBy(xpath="//*[@class='dropdown__toggle-text_style_ellipsis']")
	private WebElement LogOut_MenuHeader;
	
	// Click link LogOut 
	@FindBy(xpath="//*[@class='icon icon-account-pop-logout']")
	private WebElement linkLogOut;
	
	
	//Fill Link Logout Header  
	public WebElement getLogOutHeader(){
		return LogOut_MenuHeader;
	}
	
	public void setLogOutHeader(WebElement LogOut){
		this.LogOut_MenuHeader=LogOut;
	}
	
	//Click link LogOut
	public WebElement getlinkLogOut(){
		return linkLogOut;
	}
	public void setlinkLogOut(WebElement linkLogOut){
		this.linkLogOut=linkLogOut;
	}
}
