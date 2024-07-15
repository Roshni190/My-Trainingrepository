package testSprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {

	public void tagAndid() { //tag #id


		WebElement CssSelectorid2=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement CssSelecid4=driver.findElement(By.cssSelector("div#message-one"));
	}
	public void tagAndclass() { //tag.class
	WebElement tagclass1=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement tagclass2=driver.findElement(By.cssSelector("div.header-top"));
	WebElement tagclass3=driver.findElement(By.cssSelector("section.clearfix"));
	}
	public void tagandAttribute() { //tag [attribute=value]
		WebElement tagandatrv1=driver.findElement(By.cssSelector("div[class=\"mb-sec\"]"));
		WebElement taganddatrv2=driver.findElement(By.cssSelector("button[class=\"navbar-toggler\"]"));
		WebElement taganddatrv3=driver.findElement(By.cssSelector("button[data-toggle=\"collapse\"]"));
	}
	public void tagClassandAttribute() { //tag.classname[attribute=value]
		WebElement tagclsatr1=driver.findElement(By.cssSelector("div.mb-sec[class=\"mb-sec\"]"));
		WebElement tagclsatr2=driver.findElement(By.cssSelector("div.header-top[class=\"header-top\"]"));
		WebElement tagclsatr3=driver.findElement(By.cssSelector("section.clearfix[class=\"clearfix\"]"));
	}
	public static void main(String[] args) {
		CssSelector cssselector=new CssSelector();
		cssselector.initializeBrowser();
		cssselector.tagandAttribute();
		cssselector.tagAndclass();
		cssselector.tagClassandAttribute();

	}

}
