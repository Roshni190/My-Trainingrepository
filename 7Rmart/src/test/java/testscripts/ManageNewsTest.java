package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base {

	@Test
public void verifywhetherUserAbletoGotoManageNewsPageByclickingManageNewsMoreinfolink() {
	String username="admin";
	String password="admin";
	String managenewsurl="https://groceryapp.uniqassosiates.com/admin/list-news";
	Loginpage loginpage=new Loginpage(driver);
	loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
	loginpage.navigateToManageNewsPage(managenewsurl);
	ManageNewsPage managenewsPage=new ManageNewsPage(driver);
	boolean managenewspage=managenewsPage.isManageNewsLabelDisplayed();
	assertTrue(managenewspage," User unable to go to Manage News Page by clicking on Manage News Page More info link");
	}
public void verifywhetherUserAbletoAddNewsSuccessfullyinManageNewsPage() {
	String username="admin";
	String password="admin";
	String managenewsurl="https://groceryapp.uniqassosiates.com/admin/list-news";
	String news="Test news";
	Loginpage loginpage=new Loginpage(driver);
	loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
	loginpage.navigateToManageNewsPage(managenewsurl);
	ManageNewsPage managenewsPage=new ManageNewsPage(driver);
	managenewsPage.clickonNewButton().enterNewsField(news);
	boolean newsaddedsuccessfullalert=managenewsPage.isNewsCreated();
	assertTrue(newsaddedsuccessfullalert," User unable to Add News in Manage News Page");
		}
		}


