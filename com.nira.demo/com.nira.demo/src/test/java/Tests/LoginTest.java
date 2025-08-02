package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.AppManagerBaseClass;
import Pages.LoginPage;


public class LoginTest extends AppManagerBaseClass {

	 @Test
	    public void testValidMobileNumber() {
	        LoginPage login = new LoginPage(driver);
	        login.enterPhoneNumber("5785785788");
	        login.tapGetOtp();
	       
	    }

	    @Test
	    public void testInvalidMobileNumber() {
	        LoginPage login = new LoginPage(driver);
	        login.enterPhoneNumber("123");
	        login.tapGetOtp();
	       
	    }
	    @Test
	    public void testEmptyMobileNumber() {
	        LoginPage login = new LoginPage(driver);
	        login.enterPhoneNumber("");
	        login.tapGetOtp();
	   
	    }

	    @Test
	    public void testAlphaNumericMobileNumber() {
	        LoginPage login = new LoginPage(driver);
	        login.enterPhoneNumber("abc1234567");
	        login.tapGetOtp();
	      
	    }

	    @Test
	    public void testShortMobileNumber() {
	        LoginPage login = new LoginPage(driver);
	        login.enterPhoneNumber("12345");
	        login.tapGetOtp();
	   
	    }
}
