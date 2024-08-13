package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class AdminPage {
	public WebDriver driver;
	PageUtilities pageutilities;
	WaitUtility waitutility;
	
	public AdminPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//a[@onclick=\"click_button(1)\"]") WebElement Newbutton;
    @FindBy(xpath="//input[@id=\"username\"]") WebElement UsernameField; 
    @FindBy(xpath="//input[@id=\"password\"]") WebElement PasswordField;
    @FindBy(xpath="//select[@id=\"user_type\"]") WebElement Usertypefield; 
    @FindBy(xpath="//button[@name=\"Create\"]") WebElement Savebutton; 
    @FindBy(xpath="div[@class='alert alert-success alert-dismissible']") WebElement SuccessMessage;
    
    public AdminPage clickingNewButton()
    {
    	Newbutton.click();
       return this;
    }
    public AdminPage enteringValueInUsernameField(String adminusername) 
    {
    	UsernameField.sendKeys(adminusername);
    return this;
    }
    public AdminPage enteringValueInPasswordField(String adminusername) 
    {
    	PasswordField.sendKeys(adminusername);
    return this;
    }
    public AdminPage choosingUserTypeFieldFromdropdown(String usertype) 
    {
    	pageutilities.selectValueUsingSelectbyVisibleText(Usertypefield, usertype);
       	return this;
    }
    public AdminPage clickingOnSaveButton()
    {
    	Savebutton.click();
    	return this;
    }
    public boolean isUserCreated() 
    {
        boolean isUserCreated=SuccessMessage.isDisplayed();
        return isUserCreated;
    }
  }

