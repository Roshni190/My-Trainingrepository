package checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testSprint.Base;

public class TableHandlingAssignment extends Base {
	
	public void tablePrinting() { // to print table
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableprint=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println(tableprint.getText());
	}
	
	public void tableRowPrinting() { // to print row
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(tablerow.getText());
	}
	public void tableRowValuePrintig() { //to print value from row
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablerowvalue=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));//from 2nd row and 3rd value we give tr[2]/td[3]
		System.out.println(tablerowvalue.getText());
	}
	public void columnPrint() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement>tablecolumn1=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement menu:tablecolumn1)
	{
		System.out.println(menu.getText()); //text of one column
	}
	
	}
public void meth() {
	String input="Ashton Cox";
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement>tablevalue=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
	for(WebElement menu:tablevalue) {
		if(menu.getText().equals(input))
		{
		System.out.println(menu.getText());	
		System.out.println("Both are same");
		}
		
	}

	
}
	public static void main(String[] args) {
		TableHandlingAssignment tablehandlingassignment=new TableHandlingAssignment();
		tablehandlingassignment.initializeBrowser();
		//tablehandlingassignment.tablePrinting();
		//tablehandlingassignment.tableRowPrinting();
		//tablehandlingassignment.tableRowValuePrintig();
		//tablehandlingassignment.columnPrint();
		tablehandlingassignment.meth();

	}

}
