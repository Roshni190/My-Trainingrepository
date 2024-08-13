package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class SubCategoryPage {
	public WebDriver driver;
	PageUtilities pageutilities;
	WaitUtility waitutility;
	
	public SubCategoryPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	PageUtilities pageutilities=new PageUtilities();
	WaitUtility waitutility=new WaitUtility();
	}
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement NewButton;
	@FindBy(xpath="//select[@id='cat_id']") WebElement Categoryfield;
	@FindBy(xpath = "//input[@id='subcategory']") WebElement SubCategoryfield;
	@FindBy(xpath="//input[@id='main_img']" )WebElement FiletoUpload;
	@FindBy(xpath="//button[@name='create']" )WebElement Savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']" )WebElement AlertSuccessful;
	
	
	 public SubCategoryPage clickOnNewButton()
	    {   
	    	NewButton.click();
	       return this;
	    }
	    public SubCategoryPage selectCategoryfromdropdown(String usertype)
	    {   
	    	pageutilities.selectValueUsingSelectbyVisibleText(Categoryfield, usertype);
	       	return this;
	    }
	    public SubCategoryPage enterSubCategory(String subcategorytext)
	    {   
	    	SubCategoryfield.sendKeys(subcategorytext);
	    	return this;
	    	
	    }
	    public SubCategoryPage selectfiletoupload(String filepath)
	    {   
	    	SubCategoryfield.sendKeys(filepath);
	    	return this;	
	    }
	    public SubCategoryPage clickonSave()
	    {   
	    	Savebutton.click();
	    	return this;
	    	}
	    public boolean isCategoryCreated()
	    {   
	    	boolean isCategoryCreated=AlertSuccessful.isDisplayed();
	    		
	    
	    			return isCategoryCreated;
	    	}
	    	}
	    
