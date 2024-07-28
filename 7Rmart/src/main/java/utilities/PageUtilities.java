package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities { //to make this as common
	
	public void selectValueUsingSelectbyVisibleText(WebElement element, String text) {
	Select select=new Select(element);
	select.selectByVisibleText(text);
	}
    public void selectValueUsingIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectValueByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }
  //Frames
    public void switchToFrameByIndex(WebDriver driver, int index) {
    driver.switchTo().frame(index);
}

//Alerts
public void acceptAlert(WebDriver driver) {
    driver.switchTo().alert().accept();
}

public void dismissAlert(WebDriver driver) {
    driver.switchTo().alert().dismiss();
}

public void sendTextToAlert(WebDriver driver, String text) {
    driver.switchTo().alert().sendKeys(text);
}

//Navigation
public void navigateTo(WebDriver driver, String url) {
    driver.navigate().to(url);
}

public String getCurrentUrl(WebDriver driver) {
    return driver.getCurrentUrl();
}

public String getPageSource(WebDriver driver) {
    return driver.getPageSource();
}

//Sending keys
public void sendKeysToElement(WebElement element, String keys) {
    element.sendKeys(keys);
}

//Actions class methods
public void moveToElement(WebDriver driver, WebElement element) {
    Actions actions = new Actions(driver);
    actions.moveToElement(element).perform();
}
public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
    Actions actions = new Actions(driver);
    actions.dragAndDrop(source, target).perform();
}

public void contextClick(WebDriver driver, WebElement element) {
    Actions actions = new Actions(driver);
    actions.contextClick(element).perform();
}

public void doubleClick(WebDriver driver, WebElement element) {
    Actions actions = new Actions(driver);
    actions.doubleClick(element).perform();
}

//JavaScript Executor
public void scrollToView(WebDriver driver, WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,250)", "");
	js.executeScript("window.scrollBy(0,-250)", "");
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
}
//Checkbox and Radio Button
public void checkCheckbox(WebElement checkbox) {
    if (!checkbox.isSelected()) {
        checkbox.click();
    }
}

public void uncheckCheckbox(WebElement checkbox) {
    if (checkbox.isSelected()) {
        checkbox.click();
    }
}
public void selectRadioButton(WebElement radioButton) {
    if (!radioButton.isSelected()) {
        radioButton.click();
    }
}

//File upload using Robot class
public void fileUploadRobotclass() throws AWTException {
	StringSelection ss = new StringSelection("C:\\Users\\Roshni\\Desktop\\test.pdf"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); 
		Robot robot=new Robot(); 
		robot.delay(250); 
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER); 
	    robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.delay(90); 
		robot.keyRelease(KeyEvent.VK_ENTER);
					
}
 					
}

