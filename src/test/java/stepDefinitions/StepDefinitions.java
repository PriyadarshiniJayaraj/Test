package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import manager.PageObjectManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.javafx.tk.quantum.MasterTimer;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import manager.*;
import freemarker.cache.WebappTemplateLoader;
import pageFactory.HomePage;
import utility.ActionClass;
import utility.GetterSetter;
import utility.TestContext;

public class StepDefinitions {

	public static WebDriver driver;
	HomePage homePage;

	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	private Properties properties;
	ConfigFileReader configFileReader;

	@Given("^Launch the Application$")
	public void launch_the_Application() throws Throwable {
		System.out.println("Launch Application");
	}

	@When("^\"([^\"]*)\" Dashboard is Launched$")
	public void dashboard_is_Launched(String title) throws Throwable {
		homePage.verifyApplicationTitle(title);

	}

	@When("^Change the Currency to \"([^\"]*)\"$")
	public void change_the_Currency_to_INR(String Currency) throws Throwable {
		homePage.selectCurrency(Currency);
	}

	@When("^Search for Product \"([^\"]*)\" in SearchBar$")
	public void search_for_Product_in_SearchBar(String Product)
			throws Throwable {
		homePage.searchProduct(Product);
	}

	@When("^Provide the Min Price as \"([^\"]*)\" and Max Price as \"([^\"]*)\"$")
	public void provide_the_Min_Price_as_and_Max_Price_as(String min, String max)
			throws Throwable {
		homePage.priceRange(min, max);
	}

	@Then("^Validate that  Categories List \"([^\"]*)\" and Shows Count of Product$")
	public void validate_that_Categories_List_and_Shows_Count_of_Product(
			String Product) throws Throwable {

	}

	@Before
	public void setUp() {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();

		homePage = new HomePage(this.driver);
		homePage.login();

	}

	@After
	public void tearDown() throws InterruptedException {

		homePage.logout();

	}

}
