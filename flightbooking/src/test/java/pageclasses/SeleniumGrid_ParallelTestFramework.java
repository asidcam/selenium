package pageclasses;

import org.testng.annotations.Test;

import pageclasses.TestSuiteBase;

import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;

public class SeleniumGrid_ParallelTestFramework extends TestSuiteBase {
	
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
	}
	
	@Test
	public void serachFlights() {
	search.clickFlightTab();
	search.setOriginCity("New York");
	search.setDestinationCity("Chicago");
	search.setDepartureDate("04/17/2020");
	search.setReturningDate("04/25/2020");
	
}

	@AfterClass
	public void afterClass() {
	}

}
