package amazonYourAccountPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelData {

	public static String cellValue(String path, String Sheet, int r, int c) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		String data=sheet.getRow(r).getCell(c).toString();
		return data;
	}
	
	
	public static int rowCount(String path, String Sheet) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		
		int row=sheet.getLastRowNum();
		return row;
	}
	
	public static int cellCount(String path, String Sheet) throws IOException
	{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet(Sheet);
		
		int cell=sheet.getRow(0).getLastCellNum();
		return cell;
		
	}

}
