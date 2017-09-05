package UI_Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UI_SearchPage {
	
	public UI_SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	// Fill textbox search
	@FindBy(xpath="//*[@class='c-header-search__input-group-textbox c-header-search__input-group-textbox_search']")
	private WebElement TxtSearch;
	
	// Fill icon search
	@FindBy(xpath="//*[@class='c-header-search__input-group-button-container']")
	private WebElement Search;
	
	//Get Error Search Failed
	@FindBy(xpath="")
	private WebElement msgErrorFailer;
	
	//Fill Txt Search
	public WebElement GetTxtSearch(){
		return TxtSearch;
	}
	
	public void SetTxtSearch(WebElement TxtSearch){
		this.TxtSearch=TxtSearch;
	}
	
	//Fill icon Seach
	public WebElement getIconSeach(){
		return Search;
	}
	
	public void setIconSearch(WebElement IconSearch){
		this.Search=IconSearch;
	}
	
	//Error Search Failed
	public WebElement getErrorFailer(){
		return msgErrorFailer;
	}
	
	public void setErrorFailer(WebElement msgFailer){
		this.msgErrorFailer=msgFailer;
	}
}
