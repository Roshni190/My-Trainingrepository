package utilities;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

public class FileUploadUtility 
{
	  public void fileUploadUsingSendKeys(WebElement element, String filePath) 
	   {
	      element.sendKeys(filePath);
	   }
	  

}