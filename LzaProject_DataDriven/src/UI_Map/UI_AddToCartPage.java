package UI_Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UI_AddToCartPage {

 //Start contructor
 public UI_AddToCartPage(WebDriver driver) {
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
}