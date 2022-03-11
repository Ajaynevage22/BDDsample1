package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginstep {
	WebDriver driver;
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayn\\webdriver\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
	//	driver.get("https://the-internet.herokuapp.com/iframe");
//	driver.switchTo().frame("mce_0_ifr");
//	//driver.switchTo().frame(0);->by id
//	WebElement inputTxt = driver.findElement(By.id("tinymce"));
//	inputTxt.clear();
//	inputTxt.sendKeys("Hello Welcome");
//	//Switch back to main frame
//	//driver.swithTo().parentFrame();
//	driver.switchTo().defaultContent();
//	driver.findElement(By.cssSelector("span.tox-statusbar__branding")).click();
	

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayn\\webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/login");

	}
	@When("User enter credentials")
	public void user_enter_credentials() {
	    driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
	    driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.cssSelector(".radiius")).click();
	    }
	@Then("Should display success message")
	public void should_display_success_message() {
		boolean isEl = driver.findElement(By.linkText("Elemental Selenium")).isDisplayed();
		Assert.assertTrue(isEl);
	}



	

}
