package checkbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testSprint.Base;

public class FramesHandling extends Base {

	public void frames() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframes=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframes));
	
		driver.switchTo().frame(iframes);//first we switch to iframe, inorder to locate
	WebElement jmeter=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
	jmeter.click();
		}
	public static void main(String[] args) {
		FramesHandling frameshandling=new FramesHandling();
		frameshandling.initializeBrowser();
		frameshandling.frames();
	}

}
