package TestScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	
	public static void main(String[] args) throws IOException {
		String path = "C://AutomationFramework//AutomationFramework//TestData//DemoFile.xlsx";
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		for(int i=0; i<=lastRow; i++){
		Row row = sheet1.getRow(i);
		Cell cell = row.createCell(2);

		cell.setCellValue("WriteintoExcel");

		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
		}

}
