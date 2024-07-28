package testscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Loginpage;

public class LoginTest extends Base {
	
	
@Test
public void verifyWhetherUserabletoLoginWithCorrectUserNamePwd() {
String username="admin";
String password="admin";
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username);
loginpage.enterPasswordonPasswordfield(password);
loginpage.submitButtonfield();
boolean dashboardelement=loginpage.isDashboardDisplayed();
assertTrue(dashboardelement,"User is able to login with wrong credentials");
}
	
	
@Test
public void verifyWhetherUserUnabletoLoginWithInCorrectUserNameCorrectPwd()
{
String username="test";
String password="admin";    
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username);
loginpage.enterPasswordonPasswordfield(password);
loginpage.submitButtonfield();
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}


@Test
public void verifyWhetherUserUnabletoLoginWithCorrectUserNameInCorrectPwd() {
String username="admin";
String password="test";
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();//chaining
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}


@Test
public void verifyWhetherUserUnabletoIncorrectUserNameInCorrectPwd() {
String username="testwrong";
String password="test";
Loginpage loginpage=new Loginpage(driver);
loginpage.enterUserNameonUserNamefield(username).enterPasswordonPasswordfield(password).submitButtonfield();//chaining
boolean alertstatus=loginpage.isAlertBoxDisplayed();
assertTrue(alertstatus," Login is successfull with invalid username and password");
}
}

	