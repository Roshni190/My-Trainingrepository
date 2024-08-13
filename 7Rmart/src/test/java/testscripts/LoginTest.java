package testscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import pages.Loginpage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	
@Test(groups= {"Reggression"},retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user can login with correct username and password")
public void verifyWhetherUserabletoLoginWithCorrectUserNamePwd() {
String username=ExcelUtility.getString(1, 0, "LoginPage") ;
String password=ExcelUtility.getString(1, 1, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
boolean dashboardelement=loginpage.isDashboardDisplayed();
assertTrue(dashboardelement,"User is able to login with wrong credentials");
}
	
	
@Test(groups= {"Smoke"},retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user unable to login with incorrect user name and password")
public void verifyWhetherUserUnabletoLoginWithInCorrectUserNameCorrectPwd()
{
String username=ExcelUtility.getString(1, 2, "LoginPage") ;
String password=ExcelUtility.getString(1, 1, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}


@Test(groups= {"Reggression"},retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user unable to login with correct user name and incorrect password")
public void verifyWhetherUserUnabletoLoginWithCorrectUserNameInCorrectPwd() {
String username=ExcelUtility.getString(1, 0, "LoginPage") ;
String password=ExcelUtility.getString(1, 3, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();//chaining
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}


@Test(dataProvider="LoginProvider",retryAnalyzer=retry.Retry.class,description="This test case is used to verify whether user unable to  login with incorrect user name and incorrect password")
public void verifyWhetherUserUnabletologinwithIncorrectUserNameInCorrectPwd(String username,String password) {

Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();//chaining
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}
@DataProvider(name = "LoginProvider")
public Object[][] getDataFromTestData() {
	return new Object[][] {
		
		new Object[]{ExcelUtility.getString(1, 2, "LoginPage"), ExcelUtility.getString(1, 3, "LoginPage") },
		new Object[]{"roshni", "wrongpaswd"  } 
	
	};
}
}

	