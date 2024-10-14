package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.BookingPage;
import testBase.BaseClass;

public class SearchForFlightRoundTripTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC006_searchFlightforRoundTrip";
		testDescription = "Searching for flight on Spicejet website for round trip";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC006_searchFlightforRoundTripTest() throws InterruptedException, IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.roundtripBooking();
		Assert.assertTrue(bookingpage.roundtripText().contains("Coimbatore to Chennai"));
		takeScreenshot("TC006_searchFlightforRoundTripTest");
		if (bookingpage.roundtripText().contains("Coimbatore to Chennai")) {
			test.pass("Round trip flight search test passed");
		} else
			test.fail("Round trip flight search test failed");

	}

}
