package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class Loginpage { //in page we write test step
	public WebDriver driver;
	PageUtilities pageutilities;
	WaitUtility waitutility;
	public Loginpage(WebDriver driver)//constructor
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);//this is a class and have a method initelements which is used to initiliaze elements in your pagefile
	}
	@FindBy(xpath="//input[@placeholder='Username']") WebElement usernamefield;//equavalent to driver.findelementby
	@FindBy(xpath="//input[@placeholder='password']") WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']") WebElement submitbutton;
	@FindBy(xpath="//aside[@class='main-sidebar elevation-4 sidebar-light-dark']") WebElement loginpage;
	@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement alertbox;

	
	public Loginpage enterUserNameonUserNamefield(String username) { //access modifier- we give as class name for chaining.
		PageUtilities pageutilities=new PageUtilities();
		pageutilities.sendKeysToElement(usernamefield, username);
		
		return this;
	}
	public Loginpage enterPasswordonPasswordfield(String password) {
		waitutility.waitUsingElementToBePresent(driver, passwordfield);
		pageutilities.sendKeysToElement(passwordfield, password);
		return this;
	}
	public Loginpage submitButtonfield() {
		waitutility.waitUsingElementToBePresent(driver, submitbutton);
		submitbutton.click();
		return this;
	}
	public boolean isDashboardDisplayed() 
	{
        boolean dashboardelement=loginpage.isDisplayed();
        return dashboardelement;
    }
	    public boolean isAlertBoxDisplayed() 
    {
    	boolean alertstatus=alertbox.isDisplayed();
        return alertstatus;
    }
	    public void navigateToManageNewsPage(String managenewsurl)
	    {
	    	driver.navigate().to(managenewsurl);
	    }

	    public void navigateToManageCatrgoryPage(String managecategoryurl)
	    {
	    	driver.navigate().to(managecategoryurl);
	    }

    
}

	
	



