import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;


public class IOException {
	public static void main(String[] args) throws IOException1, java.io.IOException {
	
	//create a object of file class to open xlx file
	File file = new File("C:\\INPUTSHEET.xls");
	//create an object of FileInputStream class to read excel file
	FileInputStream inputStream = new FileInputStream(file);
	Workbook Workbook = null;
	
	Workbook = new HSSFWorkbook(inputStream);
	//read sheet inside the workbook by its name
	HSSFSheet Sheet = (HSSFSheet) Workbook.getSheetAt(0);
	//find number of rows in excel file
	int rowcount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();	
	for(int i=1; i<rowcount; i++)
	{
		Row row = Sheet.getRow(i);
		//create a new row and append it at last of sheet
		String F_NAME = row.getCell(0).getStringCellValue();
		String L_Name = row.getCell(1).getStringCellValue();
		Cell cell = row.createCell(2);
		cell.setCellValue(F_NAME+""+L_Name);
		
	}
	inputStream.close();
	//create na onjet of FileOutputStream class to create write data in excel file
	FileOutputStream outputStream = new FileOutputStream("C:\\OUTPUTSHEET.xls");
	//write data in excel file
	Workbook.write(outputStream);
	//close output stream
	outputStream.close();

}
}
