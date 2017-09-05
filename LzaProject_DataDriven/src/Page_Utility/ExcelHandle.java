package Page_Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandle {
	FileInputStream File;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String vl;
	String filePath = "D://Selenium//LzaProject_DataDriven//data//testData.xlsx";
	public ExcelHandle(){
		try {	
		File=new FileInputStream(filePath);
		workbook= new XSSFWorkbook(File);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}
	//Read Exel Data
	@SuppressWarnings({ "static-access" })
	public String getCellData(String SheetName, int colName, int rowNum){
		try {
			//Read excel sheet by sheet name 
			int index= workbook.getSheetIndex(SheetName);			
			//Get a specific sheet
			sheet= workbook.getSheetAt(index); 
						
			cell=sheet.getRow(rowNum).getCell(colName);
			
			if(cell.getCellType()==cell.CELL_TYPE_STRING){
				vl = cell.getStringCellValue();				
			}else
				if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){		
					vl=NumberToTextConverter.toText(cell.getNumericCellValue());
				}
					else
					if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
						vl=String.valueOf(cell.getBooleanCellValue());					
					}
						else
							if(cell.getCellType()==cell.CELL_TYPE_FORMULA){
								vl=cell.getCellFormula();
						}
							else									
								if(cell.getCellType()==cell.CELL_TYPE_BLANK){
									vl="";
									}								
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			vl = null;			
		}		
		return vl;	
	}
	
	//Write Excel data
	@SuppressWarnings({ })
	public void setCellData(String SheetName, int colName, int rowNum, String Result){		
		try{			
		FileInputStream input=new FileInputStream(filePath);
		workbook=new  XSSFWorkbook(input);
		sheet=workbook.getSheet(SheetName);
		row=sheet.getRow(rowNum);
		FileOutputStream output= new FileOutputStream(filePath);
		row.createCell(colName).setCellValue(Result);
		workbook.write(output);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public int getRowCount(String sheetName){
		try{
		
		int index=workbook.getSheetIndex(sheetName);
		if(index==-1){
			return 0;
		}else{
			sheet=workbook.getSheetAt(index);
			int number=sheet.getLastRowNum()+1;
			return number;
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	public int getColumnCount(String sheetName){
		try{
		int index=workbook.getSheetIndex(sheetName);
		if(index==-1){
			return 0;
		}else{
			sheet=workbook.getSheet(sheetName);
			row=sheet.getRow(0);
			return row.getLastCellNum();
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
		return 0;	
	}
}
