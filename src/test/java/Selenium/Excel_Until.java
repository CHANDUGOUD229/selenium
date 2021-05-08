
package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Until {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public String path;
	

	public Excel_Until(String path) throws IOException {
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
	}

	public int get_Row_Count(String sheetname) {
		return wb.getSheet(sheetname).getLastRowNum();

	}

	public short get_Colum_Count(String sheetname, int rowNum) {
		return wb.getSheet(sheetname).getRow(rowNum).getLastCellNum();
	}

	public String get_Cell_Data(String sheetname, int rowNum, int colNum) throws IOException {
		sheet = wb.getSheet(sheetname);
		row = sheet.getRow(rowNum);
		cell = row.getCell(colNum);
		String data;
		DataFormatter dt = new DataFormatter();
		try {
			data = dt.formatCellValue(cell);
		} catch (Exception e) {
			data = "";
		}
		wb.close();
		fi.close();
		return data;

	}

	public void set_Cell_Data(String sheetName, int rowNum, int ColumNum, String setData) throws IOException {
		sheet = wb.getSheet(sheetName);
		row =sheet.getRow(rowNum);
		cell =row.getCell(ColumNum);
		fo=new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}

}
