package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP9 {
	@DataProvider(name="TC009fetchData")
	public static String[][] getdata() throws IOException {		
		FileInputStream fis=new FileInputStream("./testdata/TC009.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();		
		String[][] testData=new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++){
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columncount;j++){	
			 String cellData=row.getCell(j).getStringCellValue();
			  System.out.println("The data of row "+i+"and column"+j+"is "+cellData);
			       testData[i-1][j]=cellData;		
		}	
		
		
		
	
	}
		return testData;
	
	}}	
			


