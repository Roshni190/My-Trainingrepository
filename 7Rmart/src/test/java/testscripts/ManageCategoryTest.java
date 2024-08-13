package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageCategoryPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user able to add category successfully in manage category page")
	public void verifywhetherUserAbletoAddCatergorySuccessfullyinManageCategoryPage() {
		String username = ExcelUtility.getString(1, 0, "LoginPage");
		String password = ExcelUtility.getString(1, 1, "LoginPage");
		String managecategoryurl = ExcelUtility.getString(1, 0, "ManageCategoryPage");
		String newcatergory = ExcelUtility.getString(1, 1, "ManageCategoryPage");
		String filepath = ExcelUtility.getString(1, 2, "ManageCategoryPage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
		loginpage.navigateToManageCategoryPage(managecategoryurl);
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickOnNewButton().enterValueinCategoryfield(newcatergory).selectGroups()
				.uploadImage(filepath).clickOnTopMenuRadioButton().clickOnLeftMenuRadioButton().clickOnSaveButton();
		boolean categoryaddedsuccessfullalert = managecategorypage.isCategoryCreated();
		assertTrue(categoryaddedsuccessfullalert, " User unable to Add Category in Manage Category Page");
	}
}
