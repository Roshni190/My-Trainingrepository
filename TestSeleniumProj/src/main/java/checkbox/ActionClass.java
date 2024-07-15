package checkbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testSprint.Base;

public class ActionClass extends Base{
	public void actionTest() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);//create object for action class and we pass driver
		//actions.moveToElement(drag1).build().perform();//to move cursor to this webElement
		//actions.doubleClick(drag1).build().perform();
		actions.dragAndDrop(drag1, drop2).build().perform();
		//actions.contextClick(drag1).build().perform();//to rightclick
		//actions.dragAndDrop(drag1, drop2).build().perform();

	}

	public static void main(String[] args) {
		ActionClass actionclass=new ActionClass();
		actionclass.initializeBrowser();
		actionclass.actionTest();
	}

}
