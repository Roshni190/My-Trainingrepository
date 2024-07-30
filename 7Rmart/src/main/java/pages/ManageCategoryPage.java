package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageCategoryPage {
	public WebDriver driver;
	PageUtilities pageutilities;
	public ManageCategoryPage(WebDriver driver)//constructor
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	PageUtilities pageutilities=new PageUtilities();
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement NewButton;
	
}
