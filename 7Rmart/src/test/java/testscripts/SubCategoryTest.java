package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageCategoryPage;
import pages.SubCategoryPage;
import utilities.ExcelUtility;
import utilities.RandomUtility;

public class SubCategoryTest extends Base{
	@Test(retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user able to add sub category successfully in subcategory page ")
	public void verifywhetherUserAbletoAddSubCatergorySuccessfullyinManageCategoryPage() {
		String username=ExcelUtility.getString(1, 0, "LoginPage") ;
		String password=ExcelUtility.getString(1, 1, "LoginPage") ;
		String managecategoryurl=ExcelUtility.getString(1, 0, "SubCategoryPage") ;
		String newcatergory= new RandomUtility().generateRandomCategoryName();
		String subcategory=ExcelUtility.getString(1, 3, "SubCategoryPage") ;
		String filepath=ExcelUtility.getString(1, 2, "SubCategoryPage") ;
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
		loginpage.navigateToSubCategorypage(managecategoryurl);
		SubCategoryPage subcategorypage=new SubCategoryPage(driver);
		subcategorypage.clickOnNewButton().selectCategoryfromdropdown(newcatergory).enterSubCategory(subcategory).selectfiletoupload(filepath).clickonSave();
		boolean categoryaddedsuccessfullalert=subcategorypage.isCategoryCreated();
		assertTrue(categoryaddedsuccessfullalert," User unable to Add subCategory in Sub Category Page");
			}
}
