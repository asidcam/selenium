package pageclasses;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkTestCaseForGrid {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactoryForGrid searchPage;


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		searchPage = new SearchPageFactoryForGrid(driver);
		
		//Maximize browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void test() {
		searchPage.clickFlightTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("Chicago");
		searchPage.setDepartureDate("04/17/2020");
		searchPage.setReturningDate("04/25/2020");
		//searchPage.searchButton.click();
	}

	@After
	public void tearDown() throws Exception {
	}

}
