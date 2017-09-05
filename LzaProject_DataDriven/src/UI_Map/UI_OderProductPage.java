package UI_Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_Setup.PageSetupBase;

public class UI_OderProductPage extends PageSetupBase {
	

	 //Start contructor
	 public UI_OderProductPage(WebDriver driver) {
	  // TODO Auto-generated constructor stub
	  PageFactory.initElements(driver, this);
	 }
	 //Click Menu Electronic
	 //@FindBy (xpath="//span[@class='c-main-navigation__item-caption']")
	 @FindBy(xpath = "//span[@data-tracking-nav-header='Điện tử']")
	 private WebElement MenuElectronic;
	 
	 //Click Menu Mobile
	 @FindBy (xpath="//a[@data-tracking-nav-sub='Điện thoại']")
	 private WebElement MenuMobile;
	 
	 //Click Name Product 
	 @FindBy (xpath="(//a[starts-with(@href,'/samsung-galaxy-j7-2016-16gb-den-hang-phan-phoi-chinh-thuc-2161342.html')])[1]")
	 private WebElement ProductTitle;
	 
	 //Click ATC
	 @FindBy (xpath="//span[@class='submit_btn_text']")
	 private WebElement ATC; 
	 
	 //CLick Close
	 //@FindBy (xpath="//a[contains(@class,'nyroModalClose') and @title='close']")
	 @FindBy (xpath="//a[contains(@class,'nyroModalClose')][@title='close']")
	 private WebElement iconClose; 
	 
	 //Click Icon ATC
	 @FindBy (xpath="//span[contains(@class,'cart-button__icon')]")
	 private WebElement iconATC;
	 
	 //==========================================
	 /*
	  * deliveryinformation
	  */
	 //Button Checkout
	 @FindBy (xpath="//span[@class='btn-checkout-text']")
	 private WebElement btnCheckout;
	 
	 //Email
	 @FindBy (id="ThreeStepShippingAddressForm_email")
	 private WebElement txtEmail;
	 
	 //Name
	 @FindBy (id="ThreeStepShippingAddressForm_first_name")
	 private WebElement txtName;
	 
	 //Combo City
	 @FindBy (id="ThreeStepShippingAddressForm_location_0")
	 private WebElement comboCity;
	 
	 //Combo District
	 @FindBy (id="ThreeStepShippingAddressForm_location_1")
	 private WebElement comboDistrict;
	 
	 //Combo Phuong / xa
	 @FindBy (id="ThreeStepShippingAddressForm_location_2")
	 private WebElement comboPhuong;
	 
	 //Comment
	 @FindBy (id="ThreeStepShippingAddressForm_address1")
	 private WebElement txtComment;
	 
	 //Phone nummber
	 @FindBy (id="ThreeStepShippingAddressForm_phone")
	 private WebElement txtPhone;
	 
	 
	 //Submit
	 @FindBy (xpath="//*[contains(@class,'checkout-field _button')]")
	 private WebElement btnSubmit;
	 
	 
	 //Accep oder
	 @FindBy (id="placeYourOrderButtonText")
	 private WebElement btnAccept;
	 
	 //Oder success
	 @FindBy (xpath="//span[@class='heading_success_content']")
	 private WebElement Odersuccess;
	 
	 //==========================================
	 
	 //Menu Electronic
	 public WebElement getMenuElectronic(){
	  return MenuElectronic;
	 }
	 
	 public void setMenuElectronic(WebElement menuElectronic){
	  this. MenuElectronic=menuElectronic;
	 }
	 
	 //Menu Mobile
	 public WebElement getMenuMobile(){
	  return MenuMobile;
	 }
	 public void setMenuMobile(WebElement menuMobile){
	  this.MenuMobile=menuMobile;
	 }
	 
	 //Title product
	 public WebElement getProductTile(){
	  return ProductTitle;
	 }
	 public void SetProductTile(WebElement namePro){
	  this.ProductTitle=namePro;
	 }
	  
	 //Button ATC
	 public WebElement getATC(){
	  return ATC;
	 }
	 public void setATC(WebElement btnATC){
	  this.ATC=btnATC;
	 }
	 
	 //Icon Close
	 public WebElement getIconclose(){
		 return iconClose;
	 }
	 
	 public void setIconclose(WebElement iconClose){
		 this.iconClose=iconClose;
	 }
	 
	 //Icon Add To Card
	 public WebElement getIconATC(){
	  return iconATC;
	 }
	 public void setIconATC(WebElement iconATC){
	  this.iconATC=iconATC;
	 }
	 
	 //============================
	 /*
	  * deliveryinformation
	  */
	 
	 //Checkout
	 public WebElement getCheckout(){
		 return btnCheckout;
	 }
	 
	 public void setCheckout(WebElement btnCheckout){
		 this.btnCheckout=btnCheckout;
	 }
	 
	 //Email
	 public WebElement getEmail(){
		 return txtEmail;
	 }
	 
	 public void setEmail(WebElement txtEmail){
		 this.txtEmail=txtEmail;
	 }
	 
	 //Name
	 public WebElement getName(){
		 return txtName;
	 }
	 
	 public void setName(WebElement txtName){
		 this.txtName=txtName;
	 }
	 
	//City
	public WebElement getCity(){
		return comboCity;
	}
		 
	public void setCity(WebElement cmbCity){
		this.comboCity=cmbCity;
	}
	
	//Districst
	public WebElement getDistrict(){
		return comboDistrict;
	}
		 
	public void setDistrict(WebElement cmbDistric){
		this.comboDistrict=cmbDistric;
	}
	
	//Phuong/xa
	public WebElement getPhuong(){
		return comboPhuong;
	}
		 
	public void setPhuong(WebElement cmbphuong){
		this.comboPhuong=cmbphuong;
	}
	
	 //Comment
	 public WebElement getComment(){
		 return txtComment;
	 }
	 
	 public void setComment(WebElement txtcmt){
		 this.txtComment=txtcmt;
	 }
	 
	 //Phone number
	 public WebElement getPhone(){
		 return txtPhone;
	 }
	 
	 public void setPhone(WebElement txtphone){
		 this.txtPhone=txtphone;
	 }
	 
	 //Submit oder
	 public WebElement getSubmit(){
		 return btnSubmit;
	 }
	 
	 public void setSubmit(WebElement btnsubmit){
		 this.btnSubmit=btnsubmit;
	 }
	 
	 //Accept oder
	 public WebElement getAccepOder(){
		 return btnAccept;
	 }
	 
	 public void setAccepOder(WebElement btnAccep){
		 this.btnAccept=btnAccep;
	 }
	 
	 //Oder success
	 public WebElement getOderSuccess(){
		 return Odersuccess;
	 }
	 
	 public void getOderSuccess(WebElement success){
		 this.Odersuccess=success;
	 }
}
