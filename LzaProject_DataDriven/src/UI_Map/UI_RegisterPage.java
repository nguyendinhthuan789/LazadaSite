package UI_Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UI_RegisterPage {
	
		public UI_RegisterPage(WebDriver driver) {
			// constructor
			PageFactory.initElements(driver, this);
		}
	
		// Link text register	
		
		//@FindBy(xpath = "ul/li[contains(text(), 'Ä�Äƒng kÃ½')]")  //IE element
		
		@FindBy(xpath = "//a[@href='/customer/account/create']")
		private WebElement linkRegister;
		
		// Link text Gender_Male
		@FindBy(id = "RegistrationForm_gender_0")
		private WebElement Gender_Male;
		
		// Link text Gender_Flame
		@FindBy(id = "RegistrationForm_gender_1")
		private WebElement Gender_Flame;
		
		// Link text Email
		@FindBy(id = "RegistrationForm_email")
		private WebElement Email;	
		
		// Link text Name
		@FindBy(id = "RegistrationForm_first_name")
		private WebElement Name;
		
		// Link text Date
		@FindBy(id = "RegistrationForm_day")
		private WebElement Date;
		
		// Link text Moth
		@FindBy(id = "RegistrationForm_month")
		private WebElement Moth;
		
		// Link text Year
		@FindBy(id = "RegistrationForm_year")
		private WebElement Year;
		
		// Link text Password
		@FindBy(id = "RegistrationForm_password")
		private WebElement Password;	
		
		// Link text Con_Password
		@FindBy(id = "RegistrationForm_password2")
		private WebElement Con_Password;
		
		// Link text Submit
		@FindBy(id = "send")
		private WebElement Submit;	
		
		// Error message Email Exist
		@FindBy(xpath = "//*[@class='message-box _text']")
		private WebElement msgError_Email_Exist;
				
		// Error message Password not match
		@FindBy(xpath = "//*[@class='s-error']")
		private WebElement msgError_Pass_Not_Match;	
	
	/*public RegisterPage() {
			// TODO Auto-generated constructor stub
		}*/
		
	//Link Register
	public WebElement getLinkRegister() {
		return linkRegister;
	}

	public void setLnkSignIn(WebElement lnkRegister) {
		this.linkRegister = lnkRegister;
	}
	
	//Select Radio Male
	public WebElement getRadio_Male() {
		return Gender_Male;
	}

	public void setRad_Male(WebElement Rad_Male) {
		this.Gender_Male = Rad_Male;
	}
	
	//Select Radio Flame
	public WebElement getRadio_Flame() {
		return Gender_Flame;
	}
	
	public void getRad_Flame(WebElement Rad_Flame) {
		this.Gender_Flame = Rad_Flame;
	}

	// Fill in Email
	public WebElement getTxtEmail() {
		return Email;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.Email = txtEmail;
	}
	
	// Fill in Name
	public WebElement getTxtName() {
		return Name;
	}

	public void setTxtName(WebElement txtName) {
		this.Name = txtName;
	}
	
	//Fill in Combo Date
	public WebElement getComboDate() {
		return Date;
	}

	public void setRadDate(WebElement ComboDate) {
		this.Date = ComboDate;
	}

	//Fill in Combo Month
	public WebElement getComboMoth() {
		return Moth;
	}

	public void setComboMonth(WebElement ComboMonth) {
		this.Moth = ComboMonth;
	}
	
	//Fill in Combo Year
	public WebElement getComboYear() {
		return Year;
	}

	public void setComboYear(WebElement ComboYear) {
		this.Year = ComboYear;
	}
	
	//Fill in Pass
	public WebElement getTxtPass() {
		return Password;
	}

	public void setTxtPass(WebElement TxtPass) {
		this.Password = TxtPass;
	}
	
	//Fill in confirm Pass
	public WebElement getTxtConfirPass() {
		return Con_Password;
	}

	public void setTxtConfirPassr(WebElement TxtConfi_Pass) {
		this.Con_Password = TxtConfi_Pass;
	}
	
	//Fill in Submit
	public WebElement getBtnLogin() {
		return Submit;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.Submit = btnLogin;
	}
	
	//Fill in Error Email Exist
	public WebElement getMsgError() {
		return msgError_Email_Exist;
	}

	public void setMsgError(WebElement msgErrorMailExist) {
		this.msgError_Email_Exist = msgErrorMailExist;
	}
	
	//Fill in Error pass not math
	public WebElement getMsgErrorPassNotMatch() {
		return msgError_Pass_Not_Match;
	}

	public void setMsgErrorPassNotMatch(WebElement msgErrorPasNotMatch) {
		this.msgError_Pass_Not_Match = msgErrorPasNotMatch;
	}
}