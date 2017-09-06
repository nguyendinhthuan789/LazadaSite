package Test_Scripts;

import static Test_Data.GlobalVariables.CONFIR_PASSWORD;
import static Test_Data.GlobalVariables.CONFIR_PASSWORD_NOT_MATCH;
import static Test_Data.GlobalVariables.DATE_REGISTER;
import static Test_Data.GlobalVariables.EMAIL_EXIST_REGISTER;
import static Test_Data.GlobalVariables.EMAIL_REGISTER;
import static Test_Data.GlobalVariables.MONTH_REGISTER;
import static Test_Data.GlobalVariables.NAME_REGISTER;
import static Test_Data.GlobalVariables.PASS_REGISTER;
import static Test_Data.GlobalVariables.YEAR_REGISTER;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Object_HomePage;
import Page_Object.Object_RegisterPage;
import Page_Setup.PageSetupBase;
import Page_Utility.ExcelHandle;
public class Scripts_RegisterPage extends PageSetupBase {
	Object_RegisterPage ObjRegister;
	Object_HomePage ObjHome;
	PageSetupBase setupbase;

		//Register Email Exist
	@Test
	public void Testcase001_Register_Email_Exist(){
		// Start Object
		ObjRegister = new Object_RegisterPage(driver);
		ExcelHandle Obj= new ExcelHandle();

		// Click Register button
		ObjRegister.ClickRegiste_Label();

		// Fill in Gender
		String Gender= Obj.getCellData("Register", 3, 1);
		ObjRegister.setForGender(Gender);
		//ObjRegister.setGenderMale();

		// Fill in Email
		String Email=Obj.getCellData("Register", 4, 1);
		ObjRegister.setEmail(Email);
		//ObjRegister.setEmail(EMAIL_EXIST_REGISTER);

		// Fill in Name
		String StrName= Obj.getCellData("Register", 5, 1);
		ObjRegister.setName(StrName);
		//ObjRegister.setName(NAME_REGISTER);

		// Fill in Date
		String Date=Obj.getCellData("Register", 6, 1);
		ObjRegister.setDate(Date);
		//ObjRegister.setDate(DATE_REGISTER);

		// Fill in Month
		String Moth=Obj.getCellData("Register", 7, 1);
		ObjRegister.setMonth(Moth);
		//ObjRegister.setMonth(MONTH_REGISTER);

		// Fill in Year
		String Year=Obj.getCellData("Register", 8, 1);
		ObjRegister.setYear(Year);
		//ObjRegister.setYear(YEAR_REGISTER);

		// Fill in Password
		String Password=Obj.getCellData("Register", 9, 1);
		ObjRegister.setPassword(Password);
		//ObjRegister.setPassword(PASS_REGISTER);

		// Fill in Confirm Password
		String CfPass=Obj.getCellData("Register", 10, 1);
		ObjRegister.setCon_Password(CfPass);
		//ObjRegister.setCon_Password(CONFIR_PASSWORD);

		// Fill in Year
		ObjRegister.Submit_Button();

		// Verify Error Enail Exist
		Object_RegisterPage objRegEmailExist = new Object_RegisterPage(driver);
		//Assert.assertTrue(objRegEmailExist.getErrorMessage().contains(Test_Data.GlobalVariables.Register_Email_Exist));
		
		switch (objRegEmailExist.getErrorMessage()) {
		case Test_Data.GlobalVariables.Register_Email_Exist:
			Obj.setCellData("Register", 11, 1, "FAILED");
			break;
		default:
			Obj.setCellData("Register", 11, 1, "NOT START");
			break;
		}
		
	}
	
	//Register Pass Not Math
	@Test
	public void Testcase002_Register_PassWorNotMatch() {
		// Start Object
		ObjRegister = new Object_RegisterPage(driver);

		// Click Register button
		ObjRegister.ClickRegiste_Label();

		// Fill in Gender
		ObjRegister.setGenderFmale();

		// Fill in Email
		ObjRegister.setEmail(EMAIL_EXIST_REGISTER);

		// Fill in Name
		ObjRegister.setName(NAME_REGISTER);

		// Fill in Date
		ObjRegister.setDate(DATE_REGISTER);

		// Fill in Month
		ObjRegister.setMonth(MONTH_REGISTER);

		// Fill in Year
		ObjRegister.setYear(YEAR_REGISTER);

		// Fill in Password
		ObjRegister.setPassword(PASS_REGISTER);

		// Fill in Confirm Password
		ObjRegister.setCon_Password(CONFIR_PASSWORD_NOT_MATCH);

		// Fill in Year
		ObjRegister.Submit_Button();

		// Verify Error Enail Exist
		Object_RegisterPage objRegPassNotMatch = new Object_RegisterPage(driver);
		Assert.assertTrue(objRegPassNotMatch.getErrorMessagePassNotMatch().contains("Passwords did not match"));
	}

	//Register Valid
	@Test
	public void Testcase003_Register_Valid_Data() throws Exception {

		// Start Object
		ObjRegister = new Object_RegisterPage(driver);

		// Click Register button
		ObjRegister.ClickRegiste_Label();

		// Fill in Gender
		ObjRegister.setGenderFmale();

		// Fill in Email
		ObjRegister.setEmail(EMAIL_REGISTER);

		// Fill in Name
		ObjRegister.setName(NAME_REGISTER);

		// Fill in Date
		ObjRegister.setDate(DATE_REGISTER);

		// Fill in Month
		ObjRegister.setMonth(MONTH_REGISTER);

		// Fill in Year
		ObjRegister.setYear(YEAR_REGISTER);

		// Fill in Password
		ObjRegister.setPassword(PASS_REGISTER);

		// Fill in Confirm Password
		ObjRegister.setCon_Password(CONFIR_PASSWORD);

		// Fill in Year
		ObjRegister.Submit_Button();

		// Verify Home Page
		Object_HomePage ObjHome = new Object_HomePage(driver);
		//Assert.assertTrue(ObjHome.verifyPageTitle());
		Assert.assertTrue(ObjHome.verifyPageTitle().equals(Test_Data.GlobalVariables.Register_Successfully));
	}
}