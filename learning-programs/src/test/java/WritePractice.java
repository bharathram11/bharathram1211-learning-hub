

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritePractice {
    public static void main(String[] args) throws Exception {
  
    	FileInputStream file=new FileInputStream("src\\test\\resources\\exceldata\\Data.xlsx");
    	XSSFWorkbook wb=new XSSFWorkbook(file);
    	XSSFSheet sh=wb.createSheet("SHEET3");
    	XSSFRow row=sh.createRow(0);
    	row.createCell(0).setCellValue("ravi");
    	row.createCell(1).setCellValue("sasa");
    	XSSFRow row1=sh.createRow(1);
    	row1.createCell(0).setCellValue("aaaa");
    	row1.createCell(1).setCellValue("aaaa");
    	XSSFRow row2=sh.createRow(0);
    	row2.createCell(0).setCellValue("ravi");
    	row2.createCell(1).setCellValue("sasa");
    	XSSFRow row3=sh.createRow(0);
    	row3.createCell(0).setCellValue("ravi");
    	row3.createCell(1).setCellValue("sasa");
    	file.close();
    	FileOutputStream file1=new FileOutputStream("src\\test\\resources\\exceldata\\Data.xlsx");
    	wb.write(file1);
    	file1.close();
    }
}
