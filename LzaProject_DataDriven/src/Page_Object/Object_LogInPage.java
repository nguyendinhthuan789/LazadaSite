package Page_Object;

import org.openqa.selenium.WebDriver;
import UI_Map.UI_LogInPage;

public class Object_LogInPage {
	//Start
	UI_LogInPage ObjLogInPage;
	
	//Data Driver init
	public Object_LogInPage(WebDriver driver){
		ObjLogInPage= new UI_LogInPage(driver);
	}
	
	//Click LogIn Link
	public void Click_LogIn_Label(){
		ObjLogInPage.getlinkLogIn().click();
	}
	
	//Clear UserName history
	public void Clear_UserName(){
		ObjLogInPage.getUserName().clear();
	}
	
	//Fill in UserName (Email)
	public void setUserName(String UserName){
		ObjLogInPage.getUserName().sendKeys(UserName);
	}
	
	//Clear PassWord history
	public void Clear_PassWord(){
	ObjLogInPage.getPassWord().clear();
	}
	
	// Fill in PassWord
	public void setPassWord(String Password){
		ObjLogInPage.getPassWord().sendKeys(Password);
	}
	
	//Click Submit button
	public void setSubmitLogIn(){
	ObjLogInPage.getSubmitLogIn().click();
	}
	
	//Verify Wrong Username (Email)
	public String setLogIn_Wrong_UserName(){
		return ObjLogInPage.getError_Wrong_UserName().getText();
	}
	
	//Verify Wrong Password
	public String setLogIn_Wrong_PassWord(){
		return ObjLogInPage.getError_Wrong_PassWord().getText();
	}
}
