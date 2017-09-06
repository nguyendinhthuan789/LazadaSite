package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Object_AddToCartPage;
import Page_ScrollCommon.ScrollCommon;
import Page_Setup.PageSetupBase;
public class Scripts_AddToCartPage extends PageSetupBase{


//Click ATC
@Test(priority=1)
public void AddToCart() throws Exception{
 
Object_AddToCartPage ObjATC=new Object_AddToCartPage(driver);
 //Click menu dien Tu
 ObjATC.Click_Menu_Electronic();
 
 //Click menu dien thoai
 ObjATC.Click_Menu_Mobile();
 
 //Thread.sleep(10000);
 //scroll xuong cai dien thoai de vao detail
 ScrollCommon category=new ScrollCommon();
 category.ScrollCategory(driver);
 
 //Click image dien thoai
 ObjATC.Click_TitleProduct();
 
 ScrollCommon proDetail=new ScrollCommon();
 proDetail.ScroDownProductDetail(driver);
 
 Thread.sleep(3000);
 
 //Click add to cart 
 ObjATC.Click_ATC();
 Thread.sleep(3000);
 
 //Click icon Close
 ObjATC.Click_Close();
 
 //Click gio hang
 Thread.sleep(3000);
 ObjATC.Click_IconATC();

 Assert.assertTrue(ObjATC.checkMatchingValues("Samsung Galaxy J7 2016 16GB (Đen) - Hàng phân phối chính thức", "Samsung Galaxy J7 2016 16GB (Đen) - Hàng phân phối chính thức"));
}
}