package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
public static final long ExplicitWait=10;
	public void waitUntilElementtoBeClickable() {
		
	}
	public void waitUsingElementToBePresent(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element.getAttribute("xpath")))); 
    }

    
    public void waitUsingElementToContainText(WebDriver driver, WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
        
    }
    public void waitForFrameToBeAvailableAndSwitch(WebDriver driver, By frameLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }

  
    public void waitForAlertPresence(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.alertIsPresent());
    }

  
    public void waitForElementAttributeToBe(WebDriver driver, WebElement element, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
    }

    
    public void waitForElementAttributeToContain(WebDriver driver, WebElement element, String attribute, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.attributeContains(element, attribute, value));
    }


    public void waitForElementToBeInvisible(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(ExplicitWait));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    

}



