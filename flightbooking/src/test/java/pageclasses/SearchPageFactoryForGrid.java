package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactoryForGrid {
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
	
	public SearchPageFactoryForGrid(WebDriver driver ) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	/**
	 * Click flight tab
	 */
	
	public void clickFlightTab() {
		flightTab.click();
	}
	
	/**
	 * Send keys to origin city
	 */
	
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
		
	}
	
	/**
	 * Send keys to destination city
	 */
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}
	
	/**
	 * Send departure date
	 */
	
	public void setDepartureDate(String departuredate) {
		departureDate.sendKeys(departuredate);
	}
	
	/**
	 * Send returning date
	 */
	
	public void setReturningDate(String returningdate) {
		returningDate.sendKeys(returningdate);
		returningDate.sendKeys(Keys.TAB);
	}
	
	/**
	 * Click on search button
	 */ 
	
	public void clickOnSearchButton(WebDriver driver) {
		searchButton.click();
		
	}
	/**
	 * Clear all the fields on the search page
	 */ 
	
	public void clearAllFields() {
		driver.findElement(By.id("flight-origin-hp-flight")).clear();
		driver.findElement(By.id("flight-destination-hp-flight")).clear();
		driver.findElement(By.id("flight-departing-hp-flight")).clear();
		driver.findElement(By.id("flight-returning-hp-flight")).clear();
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(Keys.TAB);
		

}
}
