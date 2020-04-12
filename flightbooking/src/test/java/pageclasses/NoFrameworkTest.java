package pageclasses;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoFrameworkTest {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		//Maximize browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("New York");
		driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Chicago");
		driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("03/17/2020");
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("04/21/2020");
		driver.findElement(By.id("traveler-selector-hp-flight")).click();
		driver.findElement(By.cssSelector(
				"#traveler-selector-hp-flight > div > ul > li > div > div > div > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon > svg")).click();
		driver.findElement(By.xpath("//label[@class='col search-btn-col']")).click();
	}

	@After
	public void tearDown() throws Exception {
	}

}
