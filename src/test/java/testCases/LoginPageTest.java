package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import testBase.BaseClass;

public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC001_LoginTest";
		testDescription = "Login to Spicejet website with valid credentials";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC001_LoginTest() throws Exception {
		LoginPage login = new LoginPage();
		login.login();
		Assert.assertEquals(login.loginText(), "Hi Santosh");
		
		if (login.loginText().contains(testAuthor)) {
			test.pass("Login test passed");
		} else
			test.fail("Login test failed");
		takeScreenshot("TC001_LoginTest");
	}

}
