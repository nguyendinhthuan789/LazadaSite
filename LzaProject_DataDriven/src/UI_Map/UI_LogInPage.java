package UI_Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UI_LogInPage {

	//Start Contructor
	public UI_LogInPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	}
	
	// Link text LogIn
	@FindBy (xpath="//a[@class='c-top-bar__item-caption']")
	private WebElement LinkLogIn;
	
	//Link Text UserName
	@FindBy(id="LoginForm_email") 
//	@FindBy (xpath="//div[@class='ui-inputText']")
//	@FindBy(name="LoginForm[email]")
	private WebElement UserNameLogIn;
	
	//Link Text PassWord
	@FindBy(id="LoginForm_password")
	private WebElement PassWordLogIn;
	
	//Link Submit Button
//	@FindBy(xpath="//input[@type='submit']")
	@FindBy(xpath="//*[@class='ui-button ui-buttonCta']")
	private WebElement SubmitLogIn;
	
	// Link Wrong UserName
	@FindBy(xpath="//*[@class='s-error msg']")
	private WebElement Error_WrongUserName;
	
	//Link Wrong Pass
	@FindBy(xpath="//*[@class='s-error msg']")
	private WebElement Error_WrongPassword;
	
	
	
	// Link LogIn
	public WebElement getlinkLogIn(){
		return LinkLogIn;
	}
	
	public void setlinkLogIn(WebElement LinkLogIn){
		this.LinkLogIn=LinkLogIn;
	}
	
	//Fill in Username
	public WebElement getUserName(){
		return UserNameLogIn;
	}
	
	public void setUserNameLogIn(WebElement Username){
		this.UserNameLogIn=Username;
	}
	
	//Fill in Password
	public WebElement getPassWord(){
		return PassWordLogIn;
	}
	
	public void setPassWord(WebElement PassWord){
		this.PassWordLogIn=PassWord;
	}
	
	//Fill in Click LogIn
	public WebElement getSubmitLogIn(){
		return SubmitLogIn;
	}
	
	public void setSubmitLogIn(WebElement SubmitLogIn){
		this.SubmitLogIn=SubmitLogIn;
	}
	
	//Fill in Wrong UserName (email)
	public WebElement getError_Wrong_UserName(){
		return Error_WrongUserName;
	}
	
	public void setError_Wrong_UserName(WebElement ErrorName){
		this.Error_WrongUserName=ErrorName;
	}
	
	//Fill in Wrong PassWord
	public WebElement getError_Wrong_PassWord(){
		return Error_WrongPassword;
	}
	
	public void setError_Wrong_PassWord(WebElement ErrorPass){
		this.Error_WrongPassword=ErrorPass;
	}
}
