package Page_Object;

import org.openqa.selenium.WebDriver;
import UI_Map.UI_SearchPage;
public class Object_SearchPage {
	protected WebDriver driver;
	UI_SearchPage ObjSearch;
	public Object_SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		ObjSearch=new UI_SearchPage(driver);
	}
	
	//Fill in TxtSearch
	public void EnterSearch(String TxtSearch){
		ObjSearch.GetTxtSearch().sendKeys(TxtSearch);
	}
	
	//Fill in Icon Search
	public void Click_IconSearch(){
		ObjSearch.getIconSeach().click();
	}
}
