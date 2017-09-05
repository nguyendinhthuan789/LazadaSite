package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Object_HomePage;
import Page_Object.Object_LogOutPage;
import Page_Setup.PageSetupBase;
import Test_Scripts.Scripts_LogInPage;

public class Scripts_LogOutPage extends PageSetupBase{

	
	Object_LogOutPage objLogOut;
	Object_HomePage objHome;
	Scripts_LogInPage ObjLogIn;

	
	@Test
	public void LogOutPage() {
		
	//Call to LogIn success
//	ObjLogIn= new Scripts_LogInPage();
//	ObjLogIn.Testcase003_LogIn_Valid();
	
	
	//Click LogOut
	objLogOut.ClickLogOut();
	
	//Verify LogOut  
	Object_HomePage objHome = new Object_HomePage(driver);
	Assert.assertTrue(objHome.verifyPageTitleLogOut());
	}
}
