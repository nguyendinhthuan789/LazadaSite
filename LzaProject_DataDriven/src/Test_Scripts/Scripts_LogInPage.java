package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Object_HomePage;
import Page_Object.Object_LogInPage;
import Page_Object.Object_LogOutPage;
import Page_Setup.PageSetupBase;

import Page_Utility.ExcelHandle;
public class Scripts_LogInPage extends PageSetupBase{
	
Object_LogInPage ObjLogInPage;
Object_LogOutPage LogoutPage;

		//Login Wrong UserName (Email)
	@Test
	public void Testcase001_LogInWrong_UserName(){
		//Start Object
		ObjLogInPage = new Object_LogInPage(driver);	
		ExcelHandle WriExl= new ExcelHandle();
		//Click Login
		ObjLogInPage.Click_LogIn_Label();
		
		//Fill in UserName
		ExcelHandle ObjUser= new ExcelHandle(); 
		String StrUser=ObjUser.getCellData("LogIn", 3, 1);
		System.out.println("Username: "+StrUser);
		ObjLogInPage.setUserName(StrUser);	
		//ObjLogInPage.setUserName(USERNAME_LOGIN);
		
		//Fill in Password
		ExcelHandle ObjPass= new ExcelHandle();
		String StrPass=ObjPass.getCellData("LogIn", 4, 1);
		System.out.println("Password: "+StrPass);
		ObjLogInPage.setPassWord(StrPass);
		//ObjLogInPage.setPassWord(PASS_LOGIN);
		
		//Click Submit
		ObjLogInPage.setSubmitLogIn();
		
		//Verify Login wrong username (email)
		Object_LogInPage ObjLogin=new Object_LogInPage(driver);
			
		//Assert.assertTrue(ObjLogin.setLogIn_Wrong_UserName().contains("Tên đăng nhập hoặc mật khẩu không hợp lệ"));
		//WriExl.setCellData("LogIn", 5, 1,"FAILED");
		
		switch (ObjLogin.setLogIn_Wrong_UserName()) {
		case Test_Data.GlobalVariables.LogInWrong_UserName:		
			WriExl.setCellData("LogIn", 5, 1,"FAILED");
			break;
		default:
			WriExl.setCellData("LogIn", 5, 1,"NOT START");
			break;
		}
	}
	
		//Login Wrong PassWord
	@Test
	public void Testcase002_LogInWrong_PassWord(){
		//Start Object
		ObjLogInPage = new Object_LogInPage(driver);
		ExcelHandle WriExl= new ExcelHandle();
	
		//Click Login
		//ObjHomePage.Click_LogIn_Label(); 
		
		//Fill in UserName
		ExcelHandle ObjUser= new ExcelHandle();
		String StrUser=ObjUser.getCellData("LogIn", 3, 2);
		System.out.println("====================\n");
		System.out.println("Username: "+StrUser);
		ObjLogInPage.setUserName(StrUser);
		//ObjLogInPage.setUserName(USERNAME_LOGIN);
		
		//Fill in Password
		ExcelHandle ObjPass= new ExcelHandle();
		String StrPass=ObjPass.getCellData("LogIn", 4, 2);
		System.out.println("Password: "+StrPass);
		ObjLogInPage.setUserName(StrPass);
		//ObjLogInPage.setPassWord(PASS_LOGIN);
		
		//Click Submit
		ObjLogInPage.setSubmitLogIn();
		
		//Verify Login wrong pass
		Object_LogInPage ObjLogin=new Object_LogInPage(driver);
		//Assert.assertTrue(ObjLogin.setLogIn_Wrong_PassWord().contains("Tên đăng nhập hoặc mật khẩu không hợp lệ"));
		
		switch (ObjLogin.setLogIn_Wrong_PassWord()) {
		case Test_Data.GlobalVariables.LogInWrong_Password:		
			WriExl.setCellData("LogIn", 5, 2,"FAILED");
			break;
		default:
			WriExl.setCellData("LogIn", 5, 2,"NOT START");
			break;
		}
	}
	
		//Login Valid
	@Test
	public void Testcase003_LogIn_Valid(){
		
		//Start Object
		ObjLogInPage = new Object_LogInPage(driver);	
		ExcelHandle WriExl= new ExcelHandle();
		
		//Click Login
		//ObjLogInPage.Click_LogIn_Label();
		
		// Clear fill UserName
		ObjLogInPage.Clear_UserName();
	
		//Fill in UserName
		ExcelHandle ObjUser= new ExcelHandle();
		String StrUser=ObjUser.getCellData("LogIn", 3, 3);
		System.out.println("====================\n");
		System.out.println("Username: "+StrUser);
		ObjLogInPage.setUserName(StrUser);
		//ObjLogInPage.setUserName(USERNAME_LOGIN);
		
		//Clear fill Password
		ObjLogInPage.Clear_PassWord();
		
		//Fill in Password
		ExcelHandle ObjPass= new ExcelHandle();
		String StrPass=ObjPass.getCellData("LogIn", 4, 3);
		System.out.println("Password: "+StrPass);
		ObjLogInPage.setPassWord(StrPass);
		//ObjLogInPage.setPassWord(PASS_LOGIN);
		
		//Click Submit
		ObjLogInPage.setSubmitLogIn();
		
		//Verify Login valid 	
		Object_HomePage Objhome=new Object_HomePage(driver);
		//Assert.assertTrue(Objhome.verifyPageTitle());
		
		switch (Objhome.verifyPageTitle()) {
		case Test_Data.GlobalVariables.Login_Successfully:		
			WriExl.setCellData("LogIn", 5, 3,"PASSED");
			break;
		default:
			WriExl.setCellData("LogIn", 5, 3,"FAILED");
			break;
		}
		
	}
	@Test
	public void Testcase004_Logout() throws Exception{
		
		//Start Object
		LogoutPage = new Object_LogOutPage(driver);
	
		//Click Header tab menu
		LogoutPage.ClicklinkLogout();  
		
		//Click LogOut
		LogoutPage.ClickLogOut();    
 	    	    
		//Verify Logout valid 	
		Object_HomePage objlogout = new Object_HomePage(driver);
		Assert.assertTrue(objlogout.verifyPageTitleLogOut().equals(Test_Data.GlobalVariables.Logout_Successfully));	
	}
} 



