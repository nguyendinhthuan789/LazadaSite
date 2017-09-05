package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Object_HomePage {
	
	protected WebDriver driver;
	
	public Object_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	//Verify Page Title Login
	public boolean verifyPageTitle() {
		String PageTitle = "Lazada - My account";
		return getPageTitle().contains(PageTitle);
	}
	
	//Verify Page Title LogOut
	public boolean verifyPageTitleLogOut(){
		String PageTitleLogOut="LAZADA Vietnam™ - Mua Hàng Trực Tuyến Giá Tốt";
		return getPageTitle().contains(PageTitleLogOut);
	}
	
	//Verify Page Title Search Mobile valid
	public boolean verifyPagteTitleSearchMobile(){
		String PageTileSearch="Điện Thoại Di Động Chính Hãng, Uy Tín, Giá Tốt | Lazada";
		return getPageTitle().contains(PageTileSearch);
	}
}

