package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import UI_Map.UI_RegisterPage;

public class Object_RegisterPage {
	
	// cac ham chuc nang cua page nen de luon trong page object, 

	UI_RegisterPage ObjRegisterPage;

	public Object_RegisterPage(WebDriver driver) {
		// tuong tu, tiep tuc khoi tao RegisterPage voi driver da dc init 
		ObjRegisterPage = new UI_RegisterPage(driver);
	}

	// Click Register button
	public void ClickRegiste_Label() {
		ObjRegisterPage.getLinkRegister().click();
		// driver.findElement(Register).click();
	}

	// Set Gender Male
	public void setGenderMale() {
		ObjRegisterPage.getRadio_Male().click();
		// driver.findElement(Gender_Male).click();
	}

	// Set Gender Flame
	public void setGenderFmale() {
		ObjRegisterPage.getRadio_Flame().click();
		// driver.findElement(Gender_Male).click();
	}

	// Clear Email
	public void clearEmail() {
		ObjRegisterPage.getTxtEmail().clear();
	}

	// Set Email on textbox
	public void setEmail(String strEmail) {
		ObjRegisterPage.getTxtEmail().sendKeys(strEmail);
		// driver.findElement(Email).sendKeys(strEmail);
	}

	// Clear username
	public void clearUserName() {
		ObjRegisterPage.getTxtName().clear();
	}

	// Set Name on textbox
	public void setName(String strName) {
		ObjRegisterPage.getTxtName().sendKeys(strName);
		// driver.findElement(Email).sendKeys(strName);
	}

	// Set Date on Combobox
	public void setDate(String strDate) {
		new Select(ObjRegisterPage.getComboDate()).selectByVisibleText(strDate);

		// driver.findElement(Date).sendKeys(strDate);
	}

	// Set Month on Combobox
	public void setMonth(String strMoth) {
		new Select(ObjRegisterPage.getComboMoth()).selectByVisibleText(strMoth);
		// driver.findElement(Moth).sendKeys(strMoth);
	}

	// Set Year on Combobox
	public void setYear(String strYear) {
		new Select(ObjRegisterPage.getComboYear()).selectByVisibleText(strYear);
		// driver.findElement(Year).sendKeys(strYear);
	}

	// Set Password on textbox
	public void setPassword(String strPassword) {
		ObjRegisterPage.getTxtPass().sendKeys(strPassword);
		// driver.findElement(Password).sendKeys(strPassword);
	}

	// Set Conforn-Pass on textbox
	public void setCon_Password(String strConPasswor) {
		ObjRegisterPage.getTxtConfirPass().sendKeys(strConPasswor);
		// driver.findElement(Con_Password).sendKeys(strConPasswor);
	}

	// Click Register button
	public void Submit_Button() {
		ObjRegisterPage.getBtnLogin().click();
		// driver.findElement(Submit).click();
	}

	// Get error message
	public String getErrorMessage() {
		return ObjRegisterPage.getMsgError().getText();
	}

	// Get error message Email Exist
	public String getErrorMessagePassNotMatch() {
		return ObjRegisterPage.getMsgErrorPassNotMatch().getText();
	}

	// To check element in page is displayed or not
	public boolean isSignInLinkTextDisplayed() {
		boolean isDisplayed = false;
		if (ObjRegisterPage.getLinkRegister().isDisplayed()) {
			isDisplayed = true;
		}
		return isDisplayed;
	}
	// To Check Gender Radio button
	public void setForGender(String gender){
		switch (gender) {
		case "Male":
			this.setGenderMale();
			break;
		case "Female":
			this.setGenderFmale();
			break;
		default:
			throw new IllegalArgumentException("Something went wrong!");
		}
	}
	// To Check DD/MM/YEAR combobox
	public void setForDateTime(String DateTime){
		for (int i = 1; i <= 31; i++) {
			this.setDate(DateTime);
			this.setMonth(DateTime);
			this.setYear(DateTime);
			}
		}
}