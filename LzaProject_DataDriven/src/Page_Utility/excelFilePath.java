package Page_Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class excelFilePath{

	public void  Filepath(){
	try{

	String excelFilePath = "Books.xlsx"; // can be .xls or .xlsx
	 
	FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	
	getWorkbook workbook = new getWorkbook();
	Workbook obj = workbook.getWorkbookFile(inputStream, excelFilePath);
	

	}
	catch(Exception e){
		e.printStackTrace();
	}
	}
}
