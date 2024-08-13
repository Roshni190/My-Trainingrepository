package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminPage;
import pages.Loginpage;
import utilities.ExcelUtility;

public class AdminTest extends Base {
    @Test(retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user able to add admin user")
    public void verifyIfAnAdminUserCanBeAdded() {
        
    	String username=ExcelUtility.getString(1, 0, "LoginPage") ;
		String password=ExcelUtility.getString(1, 1, "LoginPage") ;
		String adminurl=ExcelUtility.getString(1, 0, "AdminPage") ;
		String adminusername=ExcelUtility.getString(1, 1, "AdminPage") ;
		String adminpassword=ExcelUtility.getString(1, 2, "AdminPage");
		String usertype=ExcelUtility.getString(1, 3, "AdminPage");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
		loginpage.navigateToAdminpage(adminurl);
         AdminPage adminpage = new AdminPage(driver);
         adminpage.clickingNewButton().enteringValueInUsernameField(adminusername).enteringValueInPasswordField(adminpassword).choosingUserTypeFieldFromdropdown(usertype).clickingOnSaveButton();
         boolean useraddedsuccessfullalert=adminpage.isUserCreated();
     	assertTrue(useraddedsuccessfullalert," Unable to Add New user in Admin Page");
    

    }
}
