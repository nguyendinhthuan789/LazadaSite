package Page_ScrollCommon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollCommon {
	
	/*
	 * Scroll Add To Cart Product / Oder product
	 */
	//Scolling Category
		public void ScrollCategory(WebDriver driver) throws Exception{    
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("javascript:window.scrollBy(0,1000)"); 
		} 
		
	//Scolling product detail
		public void ScroDownProductDetail(WebDriver driver) throws Exception{    
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("javascript:window.scrollBy(0,90)"); 
		}
}
