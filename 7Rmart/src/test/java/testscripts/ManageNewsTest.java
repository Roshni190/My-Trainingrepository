package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
Loginpage loginpage;
ManageNewsPage managenewspage;
	@Test(retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user able to go to manange news page link by clicking on Manage news link")
public void verifywhetherUserAbletoGotoManageNewsPageByclickingManageNewsMoreinfolink() {
	String username=ExcelUtility.getString(1, 0, "LoginPage") ;
	String password=ExcelUtility.getString(1, 1, "LoginPage") ;
	String managenewsurl=ExcelUtility.getString(1, 0, "ManageNewsPage") ;
	loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
	loginpage.navigateToManageNewsPage(managenewsurl);
	ManageNewsPage managenewsPage=new ManageNewsPage(driver);
	boolean managenewspage=managenewsPage.isManageNewsLabelDisplayed();
	assertTrue(managenewspage," User unable to go to Manage News Page by clicking on Manage News Page More info link");
	}
	@Test(retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user able to add news successfully in manage news page")
public void verifywhetherUserAbletoAddNewsSuccessfullyinManageNewsPage() {
	String username=ExcelUtility.getString(1, 0, "LoginPage") ;
	String password=ExcelUtility.getString(1, 0, "LoginPage") ;
	String managenewsurl=ExcelUtility.getString(1, 0, "ManageNewsPage") ;
	String news=ExcelUtility.getString(1, 1, "ManageNewsPage") ;
	managenewspage=loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield().
	navigateToManageNewsPage(managenewsurl).clickonNewButton().enterNewsField(news);
	boolean newsaddedsuccessfullalert=managenewspage.isNewsCreated();
	assertTrue(newsaddedsuccessfullalert," User unable to Add News in Manage News Page");
		}
		}


