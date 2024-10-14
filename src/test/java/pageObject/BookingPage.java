package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testBase.BaseClass;

public class BookingPage extends BaseClass {

	@FindBy(xpath = "//div[@data-testid='check-in-horizontal-nav-tabs']")
	private WebElement checkinTab;

	@FindBy(xpath = "//div[@data-testid='flight status-horizontal-nav-tabs']")
	private WebElement flightstatusTab;

	@FindBy(xpath = "//div[@data-testid='manage booking-horizontal-nav-tabs']")
	private WebElement managebookingTab;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement from;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement toDestination;

	@FindBy(xpath = "//div[@data-testid='one-way-radio-button']")
	private WebElement onewaytrip;

	@FindBy(xpath = "//div[@data-testid='round-trip-radio-button']")
	private WebElement roundtrip;
	
	@FindBy(xpath = "//div[contains(text(),'Departure Date')]")
	private WebElement departureDate;

	/*@FindBy(xpath = "//div[@data-testid='undefined-month-May-2024']//div[@data-testid='undefined-calendar-day-20']")
	private WebElement datefordeparture;*/
	
	@FindBy(xpath= "//div[@data-testid='undefined-month-September-2024']//div[@data-testid='undefined-calendar-day-27']")
	private WebElement datefordeparture;
	
	@FindBy(xpath = "//div[@data-testid='undefined-month-September-2024']//div[@data-testid='undefined-calendar-day-29']")
	private WebElement roundtripdatedeparture;

	@FindBy(xpath = "//div[@data-testid='undefined-month-September-2024']//div[@data-testid='undefined-calendar-day-30']")
	private WebElement roundtripdatereturn;

	@FindBy(xpath = "//div[contains(text(),'Passengers')]")
	private WebElement passengers;

	@FindBy(xpath = "//div[@data-testid='Adult-testID-plus-one-cta']")
	private WebElement adult;

	@FindBy(xpath = "//div[@data-testid='Children-testID-plus-one-cta']")
	private WebElement children;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	private WebElement searchFlight;

	@FindBy(xpath = "(//span[@class='css-76zvg2 css-16my406 r-homxoj r-1s6pnzw'])[1]")
	private WebElement searchResultText;

	@FindBy(xpath = "(//div[contains(.,'Round Trip')])[9]")
	private WebElement searchResultRoundTripText;

	@FindBy(xpath = "//div[text()='Please select a date for the return trip']")
	private WebElement roundTripTextErrorText;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']")
	private WebElement formElement;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-1qxgc49']")
	private WebElement onewaytriperrorText;

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	public void checkNavigationTabs() {
		String checkinText = checkinTab.getText();
		Assert.assertEquals(checkinText, "Check-In");
		String flightstatustext = flightstatusTab.getText();
		Assert.assertEquals(flightstatustext, "Flight Status");
		String managebookingtext = managebookingTab.getText();
		Assert.assertEquals(managebookingtext, "Manage Booking");
	}

	public String managebookingtext() {
		return managebookingTab.getText();
	}

	public void oneWayTripBooking() {
		onewaytrip.click();
		from.sendKeys("CJB");
		toDestination.clear();
		toDestination.sendKeys("MAA");
		datefordeparture.click();
		passengers.click();
		implicitWait();
		searchFlight.click();
		wait(searchResultText);
	}

	public String onewaytripText() {
		return searchResultText.getText();
	}

	public String onewaytriperrorText() {
		return onewaytriperrorText.getText();
	}

	public void roundtripBooking() throws InterruptedException {
		roundtrip.click();
		from.clear();
		from.sendKeys("CJB");
		toDestination.clear();
		toDestination.sendKeys("MAA");
		roundtripdatedeparture.click();
		roundtripdatereturn.click();
		passengers.click();
		adult.click();
		children.click();
		movetoelement(searchFlight);
		searchFlight.click();
		Thread.sleep(2000);
		wait(searchResultRoundTripText);
	}

	public String roundtripText() {
		return searchResultRoundTripText.getText();
	}

	public String roundtripErrorText() {
		return roundTripTextErrorText.getText();
	}

	public void roundtripInvalidBooking() throws InterruptedException {
		roundtrip.click();
		from.clear();
		from.sendKeys("Coimbatore");
		toDestination.clear();
		toDestination.sendKeys("Chennai");
		roundtripdatedeparture.click();
		formElement.click();
		movetoelement(searchFlight);
		searchFlight.click();
		wait(roundTripTextErrorText);
	}

	public void onewayTripInvalid() {
		onewaytrip.click();
		from.sendKeys("Chennai");
		toDestination.clear();
		datefordeparture.click();
		passengers.click();
		adult.click();
		searchFlight.click();
		wait(onewaytriperrorText);
	}
}
