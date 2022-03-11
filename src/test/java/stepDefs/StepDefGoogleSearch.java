package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import java.io.IOException;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefGoogleSearch {
	WebDriver driver;
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayn\\webdriver\\chromedriver.exe");
		//WebDriverManager().ChromeDriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    	}
	@When("User enters JAva Tutorial")
	public void user_enters_j_ava_tutorial() {
		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchbox.sendKeys("java tutorial");
		
		searchbox.submit();



	}
	@Then("Should display Java result Page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(),"java tutorial - Google Search");


	}
	

	@When("User enters Selenium Tutorial")
	public void user_enters_selenium_tutorial() {
		WebElement searchbox = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
		searchbox.sendKeys("Selenium tutorial");
		
		searchbox.submit();

	}
	@Then("Should display Selenium result Page")
	public void should_display_selenium_result_page() {
		Assert.assertEquals(driver.getTitle(),"Selenium tutorial - Gogle Search");
	}
	
//	@After
//	public void generateScreenshot(Scenario scenario) throws IOException {
//		if(scenario.isFailed()) {}
//		
//	}
	





	

}
