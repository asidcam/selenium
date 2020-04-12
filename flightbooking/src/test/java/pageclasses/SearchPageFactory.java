package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
private WebDriver driver;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement originCity;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement departureDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement returningDate;
	
	@FindBy(id="search-button-hp-package")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//@FindBy(id="flight-type-roundtrip-label-hp-flight")
	//WebElement roundTrip;
	
	//@FindBy(id="flight-type-one-way-label-hp-flight")
	//WebElement oneWay;
	
	//@FindBy(id="flight-type-multi-dest-label-hp-flight")
	//WebElement multiCity;
	
	//@FindBy(id="tab-hotel-tab-hp")
	//WebElement hotels;
	
	//@FindBy(id="hotel-multi-prop-checkbox-hp-hotel")
	//WebElement checkBox;
	
	
	public void clickFlightTab() {
		flightTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
		
}
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	public void setDepartureDate(String departuredate) {
		departureDate.sendKeys(departuredate);
	}
	
	public void setReturningDate(String returningdate) {
		returningDate.sendKeys(returningdate);
	}
	
	//public void clickOnSearchButton(WebDriver driver) {
		//searchButton.click();

}
