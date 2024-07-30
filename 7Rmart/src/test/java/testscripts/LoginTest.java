package testscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Loginpage;
import utilities.ExcelUtiltiy;

public class LoginTest extends Base {

	
@Test
public void verifyWhetherUserabletoLoginWithCorrectUserNamePwd() {
String username=ExcelUtiltiy.getString(1, 0, "LoginPage") ;
String password=ExcelUtiltiy.getString(1, 1, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
boolean dashboardelement=loginpage.isDashboardDisplayed();
assertTrue(dashboardelement,"User is able to login with wrong credentials");
}
	
	
@Test
public void verifyWhetherUserUnabletoLoginWithInCorrectUserNameCorrectPwd()
{
String username=ExcelUtiltiy.getString(1, 2, "LoginPage") ;
String password=ExcelUtiltiy.getString(1, 1, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}


@Test
public void verifyWhetherUserUnabletoLoginWithCorrectUserNameInCorrectPwd() {
String username=ExcelUtiltiy.getString(1, 0, "LoginPage") ;
String password=ExcelUtiltiy.getString(1, 3, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();//chaining
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}


@Test
public void verifyWhetherUserUnabletoIncorrectUserNameInCorrectPwd() {
String username=ExcelUtiltiy.getString(1, 2, "LoginPage") ;
String password=ExcelUtiltiy.getString(1, 3, "LoginPage") ;
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();//chaining
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}
}

	