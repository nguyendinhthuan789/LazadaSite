package Test_Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Object.Object_OderProductPage;
import Page_ScrollCommon.ScrollCommon;
import Page_Setup.PageSetupBase;
import Page_Utility.ExcelHandle;
public class Scripts_OderProductPage extends PageSetupBase{
Object_OderProductPage ObjOdeProduct;

@Test (priority=1)
public void TC_OderProduct() throws Exception{
	ObjOdeProduct=new Object_OderProductPage(driver);
	ExcelHandle ObjExel= new ExcelHandle();
	
	//Click menu dien Tu
	ObjOdeProduct.Click_Menu_Electronic();
	 
	 //Click menu dien thoai
	ObjOdeProduct.Click_Menu_Mobile();
	 
	 //Thread.sleep(10000);
	 //scroll xuong cai dien thoai de vao detail
	 ScrollCommon category=new ScrollCommon();
	 category.ScrollCategory(driver);
	 
	 //Click image dien thoai
	 ObjOdeProduct.Click_TitleProduct();
	 
	 ScrollCommon proDetail=new ScrollCommon();
	 proDetail.ScroDownProductDetail(driver);
	 
	 Thread.sleep(3000);
	 
	 //Click add to cart 
	 ObjOdeProduct.Click_ATC();
	 Thread.sleep(3000);
	 
	 //Click icon Close
	 ObjOdeProduct.Click_Close();
	 
	 //Click gio hang
	 Thread.sleep(3000);
	 ObjOdeProduct.Click_IconATC();
	 
	 //Click checkout
	 ObjOdeProduct.Click_Checkout();
	 
	 //Enter Email
	 String Email=ObjExel.getCellData("Oder", 3, 1);
	 ObjOdeProduct.setEmail(Email);
	 
	 //Enter Name
	 String Name=ObjExel.getCellData("Oder", 4, 1);
	 ObjOdeProduct.setName(Name);
	 
	 //City
	 String City=ObjExel.getCellData("Oder", 5, 1);
	 ObjOdeProduct.setCity(City);
	 
	 //District
	 String District=ObjExel.getCellData("Oder", 6, 1);
	 ObjOdeProduct.setDistrict(District);
	 
	 //Phuong/Xa
	 String Phuong=ObjExel.getCellData("Oder", 7, 1);
	 ObjOdeProduct.setPhuong(Phuong);
	 
	 //Comment
	 String Comment=ObjExel.getCellData("Oder", 8, 1);
	 ObjOdeProduct.setComment(Comment);
	 
	 //Phone number
	 String Phone=ObjExel.getCellData("Oder", 9, 1);
	 ObjOdeProduct.setPhone(Phone);
	 
	 //Submit continue
	 ObjOdeProduct.SubmitContinue();
	 
	 //Submit Accepted
	 Thread.sleep(3000);
	
	 ObjOdeProduct.SubmitAccept();
	 	
	 Assert.assertTrue(ObjOdeProduct.OderSuccess().contains("Xin chúc mừng!"));
	 
	 
}
	
}
