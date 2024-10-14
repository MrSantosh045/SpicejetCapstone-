package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.BookingPage;
import testBase.BaseClass;

public class RoundtripFlightSearchInvalidTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC009_RoundtripFlightSearchInvalid";
		testDescription = "Searching for flight on Spicejet website for round trip";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC009_RoundtripFlightSearchInvalid() throws InterruptedException, IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.roundtripInvalidBooking();
		Assert.assertEquals(bookingpage.roundtripErrorText(), "Please select a date for the return trip");
		takeScreenshot("TC009_RoundtripFlightSearchInvalid");
		if (bookingpage.roundtripErrorText().contains("Please select a date for the return trip")) {
			test.pass("Round trip Flight search with invalid search deatils test passed");
		} else
			test.fail("Round trip Flight search with invalid search deatils test failed");
	}
}
