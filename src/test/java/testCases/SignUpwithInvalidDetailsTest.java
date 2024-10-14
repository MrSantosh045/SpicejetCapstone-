package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.SignUpPage;
import testBase.BaseClass;

public class SignUpwithInvalidDetailsTest extends BaseClass {
	
	@BeforeTest
	public void testDetails() {
		testName = "TC004_SignUpwithInvalidDetails";
		testDescription = "Create an account on Spicejet website with invalid credentials";
		testAuthor = "Santosh Sonawane";
	}
	
	@Test
	public void TC004_SignUpwithInvalidDetails() throws IOException {
		
		SignUpPage signup = new SignUpPage();
		signup.SignUpInvalid();
		Assert.assertEquals(signup.errorText(), "Please fill all mandatory fields marked with an '*' to proceed");
		
		if (signup.signInText().contains("Please fill all mandatory fields marked with an '*' to proceed")) {
			test.pass("SignUp with invalid details test passed");
		} else
			test.fail("SignUp with invalid details test failed");

		takeScreenshot("TC004_SignUpwithInvalidDetails");
	}
}
