package org.test.java.clas;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	public static void main(String[] args) throws Throwable   {
		File excelloc=new File("C:\\Users\\Best\\eclipse-workspace\\sindhu\\MavenProject\\excel\\EXCEL 1.xlsx");
		FileInputStream stream =new FileInputStream(excelloc);
	Workbook w= new XSSFWorkbook(stream);
	Sheet s =w.getSheet("Sheet1");
	Row r=s.getRow(2);
	Cell c=r.getCell(1);
	System.out.println(c);
	int rowcount=s.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	Row r1=s.getRow(2);
	int cellcount=r1.getPhysicalNumberOfCells();
	System.out.println(cellcount);
	Row r2=s.getRow(3);
	for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
		Cell c1=r.getCell(i);
	System.out.println(c1);
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c2=r.getCell(i);
	
		
		
	}
	}

	}}
