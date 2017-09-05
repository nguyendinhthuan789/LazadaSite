package Test_Scripts;
import static Test_Data.GlobalVariables.SEARCH;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Object_HomePage;
import Page_Object.Object_SearchPage;
import Page_Setup.PageSetupBase;
public class Scripts_SearchPage extends PageSetupBase {
	Object_SearchPage ObjSearch;

	// Fill in Txt Search
	@Test
	public void SearchPage_Valid() throws Exception {
		ObjSearch= new Object_SearchPage(driver);
		ObjSearch.EnterSearch(SEARCH);
	
		//Fill icon Search
		ObjSearch.Click_IconSearch();
		
		//Verify Search expected results
		Object_HomePage ObjHome= new Object_HomePage(driver);
		Assert.assertTrue(ObjHome.verifyPagteTitleSearchMobile());
	}
}
