package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.BookingPage;
import testBase.BaseClass;

public class BookingPageNavigationTabsTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC010_checkNavigationTabs";
		testDescription = "Checking the tand on the booking page";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC010_checkNavigationTabs() throws IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.checkNavigationTabs();
		takeScreenshot("TC010_checkNavigationTabs");
		if (bookingpage.managebookingtext().contains("Manage Booking")) {
			test.pass("Navigation tabs test passed");
		} else
			test.fail("Navigation tabs test failed");
	}

}
