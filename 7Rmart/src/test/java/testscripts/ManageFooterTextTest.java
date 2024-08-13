package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Loginpage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	@Test (retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user able to update address in manage footer text page")
	public void verifywhetherUserAbletoupdateAddressinManagefooterTextPage() {
		String username=ExcelUtility.getString(1, 0, "LoginPage") ;
		String password=ExcelUtility.getString(1, 1, "LoginPage") ;
		String managefooterurl=ExcelUtility.getString(1, 0, "ManageFooterPage") ;
		String editaddress=ExcelUtility.getString(1, 1, "ManageFooterPage") ;
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
		loginpage.navigateToManagefooter(managefooterurl);
		ManageFooterTextPage managefootertextpage=new ManageFooterTextPage(driver);
		managefootertextpage.clickonEditbutton().editAddress(editaddress).clickOnUpdateButton();
		boolean addressupdatedsuccessfullalert=managefootertextpage.isFootertextPageUpdated();
		assertTrue(addressupdatedsuccessfullalert," User unable to Update Address in Manage FooterText Page");
			}
}

