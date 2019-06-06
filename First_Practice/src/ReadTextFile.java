import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
//import jxl.write.Label;
//import jxl.write.Number;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;

//import org.apache.poi.ss.usermodel.Row;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import jxl.*;
//import jxl.read.biff.BiffException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException
	{
		//create a object of file class to open xlx file
		File file = new File("C:\\INPUTSHEET.xls");
		//create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		//Workbook workbook = null;
		//workbook = Workbook
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		//read sheet inside the workbook by its name
		//workbook = Workbook.getWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheetAt(0);
		//find number of rows in excel file
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println(rowcount);
		for(int i=1; i<rowcount; i++)
		{
			Row row = sheet.getRow(i);
			//create a new row and append it at last of sheet
			String F_NAME = row.getCell(0).getStringCellValue();
			String L_Name = row.getCell(1).getStringCellValue();
			Cell cell = row.createCell(2);
			cell.setCellValue(F_NAME+" "+L_Name);
			
		}
		inputStream.close();
		//create na object of FileOutputStream class to create write data in excel file
		FileOutputStream outputStream = new FileOutputStream("C:\\OUTPUTSHEET.xls");
		//write data in excel file
		workbook.write(outputStream);
		//close output stream
		outputStream.close();	
	}
		// TODO Auto-generated method stub
		
		

	

}
