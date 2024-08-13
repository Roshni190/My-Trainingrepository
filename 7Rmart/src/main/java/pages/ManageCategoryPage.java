package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	PageUtilities pageutilities;
	WaitUtility waitutility;
	
	public ManageCategoryPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement NewButton;
	@FindBy(xpath="//input[@id='category']") WebElement Categoryfield;
	@FindBy(xpath = "//li[@id='134-selectable']") WebElement SelectGroupfield;
	@FindBy(xpath="//[@id='main_img']") WebElement FileUploadfield; 
	@FindBy(xpath="(//input[@value='yes'])[1]")WebElement ShowonTopMenuRadioButtonYes;
	@FindBy(xpath="(//input[@value='no'])[1]")WebElement ShowonTopMenuRadioButtonNo;
    @FindBy(xpath="(//input[@value='yes'])[2")WebElement ShowonleftMenuRadioButtonYes;
    @FindBy(xpath="(//input[@value='no'])[2]")WebElement ShowonleftMenuRadioButtonNo;
    @FindBy(xpath="//button[@name='create']")WebElement SaveButton;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successMessageAlert;
    
    public ManageCategoryPage clickOnNewButton()
    {   
    	NewButton.click();
       return this;
    }
    public ManageCategoryPage enterValueinCategoryfield(String newcatergory)
    {   
    	Categoryfield.sendKeys(newcatergory);
       return this;
    }
    public ManageCategoryPage selectGroups()
    {   
    	SelectGroupfield.click();
    	return this;
    	
    }
    
    public ManageCategoryPage uploadImage(String filepath)
    {   
    	FileUploadfield.sendKeys(filepath);
    	return this;
    }

    public ManageCategoryPage clickOnTopMenuRadioButton()
    {
    	pageutilities.selectRadioButton(ShowonTopMenuRadioButtonYes);
        return this;
    }
    
    public ManageCategoryPage clickOnLeftMenuRadioButton() 
    {
    	pageutilities.selectRadioButton(ShowonleftMenuRadioButtonNo);
        return this;
    }
    
    public ManageCategoryPage clickOnSaveButton() 
    {
    	waitutility.waitUsingElementToBePresent(driver, SaveButton);
    	SaveButton.click();
    	return this;
    }
    
    public boolean isCategoryCreated() 
    {
        boolean isCategoryCreated=successMessageAlert.isDisplayed();
        return isCategoryCreated;
    }

}

