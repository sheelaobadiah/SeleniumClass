package com.poi.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws Exception {
	File f=new File("C:\\Users\\WIN7\\eclipse-workspace\\SoftwareTesting\\Library\\Book1.xlsx");
	FileInputStream f1=new FileInputStream(f);
	
	Workbook wb=new XSSFWorkbook(f1);
	
	Sheet sheet = wb.getSheetAt(0);
	
	int usedrowsize = sheet.getPhysicalNumberOfRows();
	
	for(int i=0; i<usedrowsize;i++)
	{
		 Row row = sheet.getRow(i);
		
		
	int usedcellsize = row.getPhysicalNumberOfCells();
	for(int j=0;j<usedcellsize;j++)
	{
		Cell cell = row.getCell(j);
		CellType celltype = cell.getCellType();
		if(celltype.equals(CellType.STRING))
		{
			String cellvaluetype = cell.getStringCellValue();
			System.out.println(cellvaluetype);
			
		}
		else if(celltype.equals(CellType.NUMERIC)) {
		 double d = cell.getNumericCellValue();
		 long l = (long) d;
		 String valueOf = String.valueOf(l);
		 System.out.println(valueOf);
		}
			
		}
	}
	
	}

}
