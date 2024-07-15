package checkbox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testSprint.Base;

public class MultipleWindowAssgnment extends Base {
	public void multipleWindow() {
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement LikeUsFb=driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		LikeUsFb.click();
		WebElement FollowAll=driver.findElement(By.xpath("//a[@title='Follow @obsqurazone']"));
		FollowAll.click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent"+parent);
	Set<String> allWindows=driver.getWindowHandles();
	for(String temp:allWindows) {
		if(!temp.equals(parent)) {
			System.out.println("Windows"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("**********************************************");
		}
	}
		
		
	}
	
	public static void main(String[] args) {
		MultipleWindowAssgnment multiplewindowassgnment=new MultipleWindowAssgnment();
		multiplewindowassgnment.initializeBrowser();
		multiplewindowassgnment.multipleWindow();
	}

}
