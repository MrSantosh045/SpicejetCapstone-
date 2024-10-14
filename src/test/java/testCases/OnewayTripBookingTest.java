package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.BookingPage;
import pageObject.PassengerDetailsPage;
import testBase.BaseClass;

public class OnewayTripBookingTest extends BaseClass {

	@BeforeTest
	public void testDetails() {
		testName = "TC007_onewaytripbookingTest";
		testDescription = "Booking a flight for oneway trip by providing passenger and payment details";
		testAuthor = "Santosh Sonawane";
	}

	@Test
	public void TC007_onewaytripbookingTest() throws InterruptedException, IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.oneWayTripBooking();
		PassengerDetailsPage details = new PassengerDetailsPage();
		details.bookFlight();
		Assert.assertEquals(details.paymenterrorText(), "Please enter a valid card");
		takeScreenshot("TC007_onewaytripbookingTest");
		if (details.paymenterrorText().contains("Please enter a valid card")) {
			test.pass("Flight booking test passed");
		} else
			test.fail("Flight Booking test failed");
	}
}
