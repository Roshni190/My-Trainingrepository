package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class ManageFooterTextPage {
	public WebDriver driver;
	PageUtilities pageutilities;
	WaitUtility waitutility;
	
	public ManageFooterTextPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	PageUtilities pageutilities=new PageUtilities();
	WaitUtility waitutility=new WaitUtility();
	}

	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")  private WebElement Editbutton ;
	@FindBy(xpath="//textarea[@id='content']") private WebElement Address;
	@FindBy(xpath="//button[@name='Update']") private WebElement Updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement Alertsuccessful;
	
	public ManageFooterTextPage clickonEditbutton()
    {   
		Editbutton.click();
    	return this;	
    }
    public ManageFooterTextPage editAddress(String editaddress)
    {   
    	Address.sendKeys(editaddress);
    	return this;
    	}
    public ManageFooterTextPage clickOnUpdateButton()
    {   
    	Updatebutton.click();
    	return this;
    	}
    
    public boolean isFootertextPageUpdated()
    {   
    	boolean isFootertextPageUpdated=Alertsuccessful.isDisplayed();
    		
    
    			return isFootertextPageUpdated;
    	}
}
