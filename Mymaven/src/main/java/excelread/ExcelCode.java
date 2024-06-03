package excelread; 
  
 import java.io.FileInputStream; 
 import java.io.IOException; 
  
 import org.apache.poi.xssf.usermodel.XSSFCell; 
 import org.apache.poi.xssf.usermodel.XSSFRow; 
 import org.apache.poi.xssf.usermodel.XSSFSheet; 
 import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
  
 public class ExcelCode { 
 	 
 	static FileInputStream file; 
 	static XSSFWorkbook wb; 
 	static XSSFSheet sh; 
 	 
 	public static String readStringData(int i,int j) throws IOException { 
 	 
 		file=new FileInputStream("C:\\Users\\Roshni\\git\\My-Trainingrepository\\Mymaven\\src\\main\\resources\\Test Data.xlsx"); 
 	    wb=new XSSFWorkbook(file); 
 	    sh=wb.getSheet("Sheet1"); 
 		XSSFRow row=sh.getRow(i); 
 		XSSFCell cell=row.getCell(j); 
 		 
 		return cell.getStringCellValue(); 
 	} 
 	 
 	public static String readIntegerData(int i, int j) throws IOException { 
 		 
 		file=new FileInputStream("C:\\Users\\Roshni\\git\\My-Trainingrepository\\Mymaven\\src\\main\\resources\\Test Data.xlsx"); 
 	    wb=new XSSFWorkbook(file); 
 	    sh=wb.getSheet("Sheet1"); 
 		XSSFRow row=sh.getRow(i); 
 		XSSFCell cell=row.getCell(j); 
 		 
 		int value=(int) cell.getNumericCellValue(); 
 		return String.valueOf(value); 
 	} 
  
 }