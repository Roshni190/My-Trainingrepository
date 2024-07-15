package testSprint;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys extends Base {

	public void test() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		message.sendKeys("Roshni"); // enter keys
		WebElement showmessage=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(showmessage));

		
		//fluent wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(showmessage));
		showmessage.click(); // to click button
		
		
	}
	public static void main(String[] args) {
		SendKeys sendkeys=new SendKeys();
		sendkeys.initializeBrowser();
		sendkeys.test();
		//sendkeys.driverQuitandClose();
	}


	
}