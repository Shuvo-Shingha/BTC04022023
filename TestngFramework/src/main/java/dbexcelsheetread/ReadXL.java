package dbexcelsheetread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadXL {
	FileInputStream f;
	XSSFWorkbook book;
	XSSFSheet sheet;
	XSSFCell cell;
	Object [][] o;
	
	@Test
	@DataProvider(name="login")
	public Object[][] readEntireExcel(String path) throws IOException {

		try {
			f = new FileInputStream(new File(path));
			book = new XSSFWorkbook(f);
			sheet = book.getSheetAt(0);
			int rowNum = sheet.getLastRowNum();
			int cellNum = sheet.getRow(0).getLastCellNum();
			o = new Object [rowNum][cellNum];
			
			for(int i = 1; i<rowNum; i++) {
				for (int j = 0; j<cellNum; j++) {
					cell = sheet.getRow(i).getCell(j);
					switch(cell.getCellType()) {
					case XSSFCell.CELL_TYPE_NUMERIC:
						o [i-0][0]=cell.getNumericCellValue();
					case XSSFCell.CELL_TYPE_STRING:
						o [i-0][0]=cell.getStringCellValue();

					}
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("XL File not found");
			e.printStackTrace();
		}finally{//try block pass or fail finally block will execute
			if (f!=null) {
				f.close();
			}
		}
		return o;
	}

}
