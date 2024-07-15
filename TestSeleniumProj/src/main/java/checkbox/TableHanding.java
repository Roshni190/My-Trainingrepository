package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testSprint.Base;

public class TableHanding extends Base {
public void tablePrinting() { // to print table
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tableprint=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
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
	List<WebElement>tablecolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
for(WebElement menu:tablecolumn)
{
	System.out.println(menu.getText()); //text of one column
}
}

	public static void main(String[] args) {
		TableHanding tablehanding= new TableHanding();
		tablehanding.initializeBrowser();
		//tablehanding.tablePrinting();
		//tablehanding.tableRowPrinting();
		//tablehanding.tableRowValuePrintig();
		tablehanding.columnPrint();
	}

}
