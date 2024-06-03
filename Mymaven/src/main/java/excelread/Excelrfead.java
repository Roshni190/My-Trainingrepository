package excelread; 
  
 import java.io.IOException; 
  
 public class Excelrfead { 
  
 	public static void main(String[] args) throws IOException { 
 	String data = ExcelCode.readStringData(1, 0);   //() 
 	String intData= ExcelCode.readIntegerData(1, 1); 
 	System.out.println(data); 
 	System.out.println(intData); 
  
 	} 
  
 }