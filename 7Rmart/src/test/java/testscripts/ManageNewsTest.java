package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageNewsPage;
import utilities.ExcelUtiltiy;

public class ManageNewsTest extends Base {

	@Test
public void verifywhetherUserAbletoGotoManageNewsPageByclickingManageNewsMoreinfolink() {
	String username=ExcelUtiltiy.getString(1, 0, "LoginPage") ;
	String password=ExcelUtiltiy.getString(1, 1, "LoginPage") ;
	String managenewsurl=ExcelUtiltiy.getString(1, 0, "ManageNewsPage") ;
	Loginpage loginpage=new Loginpage(driver);
	loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
	loginpage.navigateToManageNewsPage(managenewsurl);
	ManageNewsPage managenewsPage=new ManageNewsPage(driver);
	boolean managenewspage=managenewsPage.isManageNewsLabelDisplayed();
	assertTrue(managenewspage," User unable to go to Manage News Page by clicking on Manage News Page More info link");
	}
public void verifywhetherUserAbletoAddNewsSuccessfullyinManageNewsPage() {
	String username=ExcelUtiltiy.getString(1, 0, "LoginPage") ;
	String password=ExcelUtiltiy.getString(1, 0, "LoginPage") ;
	String managenewsurl=ExcelUtiltiy.getString(1, 0, "ManageNewsPage") ;
	String news=ExcelUtiltiy.getString(1, 1, "ManageNewsPage") ;
	Loginpage loginpage=new Loginpage(driver);
	loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
	loginpage.navigateToManageNewsPage(managenewsurl);
	ManageNewsPage managenewsPage=new ManageNewsPage(driver);
	managenewsPage.clickonNewButton().enterNewsField(news);
	boolean newsaddedsuccessfullalert=managenewsPage.isNewsCreated();
	assertTrue(newsaddedsuccessfullalert," User unable to Add News in Manage News Page");
		}
		}


