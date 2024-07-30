package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageNewsPage {
	public WebDriver driver;
	PageUtilities pageutilities;

	public ManageNewsPage(WebDriver driver)//constructor
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	PageUtilities pageutilities=new PageUtilities();
	}
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']") WebElement Managenewslabel;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement New;
	@FindBy(xpath="//textarea[@id='news']") WebElement Enternewsfield;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement Save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement Alertdisplayingsuccessful;


public ManageNewsPage clickonNewButton() {
	New.click();
	return this;
}
public ManageNewsPage enterNewsField(String news) {
	Enternewsfield.sendKeys(news);
	Save.click();
	return this;
}
public boolean isManageNewsLabelDisplayed() 
{
    boolean managenewspage=Managenewslabel.isDisplayed();
    return managenewspage;
}
public boolean isNewsCreated() 
{
    boolean isNewsCreated=Alertdisplayingsuccessful.isDisplayed();
    return isNewsCreated;
}

}
