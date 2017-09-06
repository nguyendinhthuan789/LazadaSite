package Page_Object;

import org.openqa.selenium.WebDriver;
import UI_Map.UI_AddToCartPage;
public class Object_AddToCartPage {
UI_AddToCartPage ObjAddtoCart;
 WebDriver driver;
 
 public Object_AddToCartPage(WebDriver driver) {
  // TODO Auto-generated constructor stub
  this.driver = driver;
  ObjAddtoCart= new UI_AddToCartPage(driver);
 }
 
 //Click Menu Electronic
 public void Click_Menu_Electronic(){
  ObjAddtoCart.getMenuElectronic().click();
 }
 
 //Click Menu Mobile
 public void Click_Menu_Mobile(){
  ObjAddtoCart.getMenuMobile().click();
 }
 
 //Click Product Title
 public void Click_TitleProduct(){
  ObjAddtoCart.getProductTile().click();
 }
 
 //Click ATC
 public void Click_ATC(){
  ObjAddtoCart.getATC().click();
  //this.scrollAndClick(ObjAddtoCart.getATC());
 }
 
/* private void scrollAndClick(WebElement element) {
  try {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
        Thread.sleep(3000);
  element.click();
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }*/
 
 // Click icon Close
 public void Click_Close(){
	 ObjAddtoCart.getIconclose().click();
 }
 
 	//To check element in page is displayed or not
	public boolean Click_Close1() {
		boolean isDisplayed = false;
		if (ObjAddtoCart.getIconclose().isDisplayed()) {
			isDisplayed = true;
		}
		return isDisplayed;
}
	//Click icon ATC button
	public void Click_IconATC(){
		ObjAddtoCart.getIconATC().click();
	}
	
	//To check compare title product
	  public boolean checkMatchingValues(Object actualValue, Object expectedValue) {  
		        String successMessage = "\t* The Expected and Actual Values match. (PASS)\n";  
		        String failureMessage = "\t* The Expected and Actual Values do not match! (FAIL)\n";  
		      
		        boolean doesPriceMatch = false;  
		      
		        System.out.println("\t* Expected Value: " + expectedValue);  
		        System.out.println("\t* Actual Value: " + actualValue);  
		    
		        if (actualValue.equals(expectedValue)) {  
		          System.out.println(successMessage);  
		          doesPriceMatch = true;  
		        } else {  
		          System.out.println(failureMessage);  
		          doesPriceMatch = false;  
		        }  
		        return doesPriceMatch;  
		      }  
}