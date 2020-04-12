package pageclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class SeleniumGrid_ParallelTest {
	private WebDriver driver;
	private String baseUrl;
	private String nodeURL;
	
	SearchPageFactoryForGrid searchPage;

	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		baseUrl = "https://www.expedia.com/";
		nodeURL = "http://192.168.137.1:5555/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), caps);
		
		searchPage = new SearchPageFactoryForGrid(driver);
		
		//Maximize browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@Test
	public void searchFlights() {
		searchPage.clickFlightTab();
		searchPage.setOriginCity("New York");
		searchPage.setDestinationCity("Chicago");
		searchPage.setDepartureDate("04/17/2020");
		searchPage.setReturningDate("04/25/2020");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
