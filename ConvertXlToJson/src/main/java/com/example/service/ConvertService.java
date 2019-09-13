package com.example.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


@Component("convertService")
@Service
public class ConvertService {
	

	public void upload() throws Exception {
		File myFile = new File("C:/Users/pallab/Documents/EmployeeData.xlsx");
	    FileInputStream fis = new FileInputStream(myFile);

	    // Finds the workbook instance for XLSX file
	    XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
	   
	    // Return first sheet from the XLSX workbook
	    XSSFSheet mySheet = myWorkBook.getSheetAt(0);
	   
	    // Get iterator to all the rows in current sheet
	    Iterator<Row> rowIterator = mySheet.iterator();
	   
	    // Traversing over each row of XLSX file
	    while (rowIterator.hasNext()) {
	        Row row = rowIterator.next();

	        // For each row, iterate through each columns
	        Iterator<Cell> cellIterator = row.cellIterator();
	        while (cellIterator.hasNext()) {

	            Cell cell = cellIterator.next();

	            switch (cell.getCellType()) {
	            case STRING:
	                System.out.print(cell.getStringCellValue() + "\t");
	                break;
	            case NUMERIC:
	                System.out.print(cell.getNumericCellValue() + "\t");
	                break;
	            case BOOLEAN:
	                System.out.print(cell.getBooleanCellValue() + "\t");
	                break;
	            default :
	         
	            }
	        }
	        System.out.println("");
	    }
		}
	String msg;
	List<String> list1 = new ArrayList<String>();
	List<String> list2 = new ArrayList<String>();
	List<String> list3 = new ArrayList<String>();
	//Map<String, String> map = new HashMap<String, String>();
	
	
	public List result() throws Exception {
		Fillo fillo = new Fillo();
		Connection connection=fillo.getConnection("C:/Users/pallab/Documents/EmployeeData.xlsx");
		
		String strQuery="Select * from Sheet1";
		Recordset recordset=connection.executeQuery(strQuery);
		
	
		while(recordset.next()){
			
			list1.add(recordset.getField("EmpName"));
			
			//map.put( recordset.getField("EmpName"), recordset.getField("EmpName"));
			
		System.out.println(recordset.getField("EmpName"));
			}
		
		recordset.close();
		connection.close();
		
		return list1;
		//return map;
		
	}
	
	public int updateData(String company) throws Exception {
		
		Fillo fillo = new Fillo();
		Connection connection=fillo.getConnection("C:/Users/pallab/Documents/EmployeeData.xlsx");
		String strQuery="Update Sheet1 Set Company= 'q' where EmpName='John' and Department='1'";
	
		
		int result = connection.executeUpdate(strQuery);
			connection.close();
		return result;
		
	}

	
}
