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
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement usernamefield;//equavalent to driver.findelementby
	@FindBy(xpath="//input[@name='password']")private WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement submitbutton;
	@FindBy(xpath="//aside[@class='main-sidebar elevation-4 sidebar-light-dark']")private WebElement loginpage;
	@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")private WebElement alertbox;

	
	public Loginpage enterUserNameonUserNamefield(String username) { //access modifier- we give as class name for chaining.
		PageUtilities pageutilities=new PageUtilities();
		pageutilities.sendKeysToElement(usernamefield, username);
		
		return this;
	}
	public Loginpage enterPasswordonPasswordfield(String password) {
		passwordfield.sendKeys(password);
		return this;
	}
	public Loginpage submitButtonfield() {
		
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
	    public ManageNewsPage navigateToManageNewsPage(String managenewsurl)
	    {
	    	driver.navigate().to(managenewsurl);
			return new ManageNewsPage(driver);
	    }

	    public ManageCategoryPage navigateToManageCategoryPage(String managecategoryurl)
	    {
	    	driver.navigate().to(managecategoryurl);
	    	return new ManageCategoryPage(driver);
	    			
	    }
	    public AdminPage navigateToAdminpage(String adminurl)
	    {
	    	driver.navigate().to(adminurl);
	    	return new AdminPage(driver);
	    }

	    public SubCategoryPage navigateToSubCategorypage(String subcategoryurl )
	    {
	    	driver.navigate().to(subcategoryurl);
	    	return new SubCategoryPage(driver);
	    }
	    public ManageFooterTextPage navigateToManagefooter(String managefooterurl)
	    {
	    	driver.navigate().to(managefooterurl);
	    	return new ManageFooterTextPage(driver);
	    }
		
}

	
	



