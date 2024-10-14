package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import testBase.BaseClass;

public class LoginWithInvalidDetailsTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC002_LoginwithInvalidDetailsTest";
		testDescription = "Login to Spicejet website with invalid credentials";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC002_LoginwithInvalidDetailsTest() throws Exception {
		LoginPage login = new LoginPage();
		login.loginInvalid();
		Assert.assertEquals(login.loginErrortext(), "Please enter a valid email address");
		takeScreenshot("TC002_LoginwithInvalidDetailsTest");
		if (login.loginErrortext().contains("Please enter a valid email address")) {
			test.pass("Login with invalid details test passed");
		} else
			test.fail("Login with invalid details failed");
	}
}
