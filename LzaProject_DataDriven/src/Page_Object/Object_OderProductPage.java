package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import UI_Map.UI_OderProductPage;
public class Object_OderProductPage {
UI_OderProductPage ObjOderProduct;

public Object_OderProductPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	ObjOderProduct=new UI_OderProductPage(driver);
}

	//Click Menu Electronic
	public void Click_Menu_Electronic(){
		ObjOderProduct.getMenuElectronic().click();
	}
	
	//Click Menu Mobile
	public void Click_Menu_Mobile(){
		ObjOderProduct.getMenuMobile().click();
	}
	
	//Click Product Title
	public void Click_TitleProduct(){
		ObjOderProduct.getProductTile().click();
	}
	
	//Click ATC
	public void Click_ATC(){
		ObjOderProduct.getATC().click();
	
	}

	// Click icon Close
	public void Click_Close(){
		ObjOderProduct.getIconclose().click();
	}

	//Click icon ATC button
	public void Click_IconATC(){
		ObjOderProduct.getIconATC().click();
	}
	
	//Click Checkout
	public void Click_Checkout(){
		ObjOderProduct.getCheckout().click();
	}
	
	//Enter Email
	public void setEmail(String strEmail){
		ObjOderProduct.getEmail().sendKeys(strEmail);
	}
	
	//Enter Name
	public void setName(String strName){
		ObjOderProduct.getName().sendKeys(strName);
	}
	
	//City
	public void setCity(String City){
		new Select(ObjOderProduct.getCity()).selectByVisibleText(City);
	}
	
	//Districts
	public void setDistrict(String District){
		new Select(ObjOderProduct.getDistrict()).selectByVisibleText(District);
	}
	
	//Phuong/xa
	public void setPhuong(String phuong){
		new Select(ObjOderProduct.getPhuong()).selectByVisibleText(phuong);
	}
	
	//Comment
	public void setComment(String comment){
		ObjOderProduct.getComment().sendKeys(comment);
	}
	
	//Phone number
	public void setPhone(String Phone){
		ObjOderProduct.getPhone().sendKeys(Phone);
	}
	
	//Submit continue
	public void SubmitContinue(){
		ObjOderProduct.getSubmit().click();
	}
	
	//Submit Accepted oder
	public void SubmitAccept(){
		ObjOderProduct.getAccepOder().click();
	}
	
	//Oder success
	public String OderSuccess(){
		return ObjOderProduct.getOderSuccess().getText();
	}
}
