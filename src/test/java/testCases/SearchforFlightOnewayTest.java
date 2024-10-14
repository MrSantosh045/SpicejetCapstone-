package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.BookingPage;
import testBase.BaseClass;

public class SearchforFlightOnewayTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC005_searchFlightforOneWayTrip";
		testDescription = "Searching for flight on Spicejet website for one way trip";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC005_searchFlightforOneWayTrip() throws IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.oneWayTripBooking();
		Assert.assertTrue(bookingpage.onewaytripText().contains("Coimbatore to Chennai"));
		takeScreenshot("TC005_searchFlightforOneWayTrip");
		if (bookingpage.onewaytripText().contains("Coimbatore to Chennai")) {
			test.pass("Oneway Flight search test passed");
		} else
			test.fail("Oneway Flight search test failed");
	}
}
