package stepDefinitions;

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

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import manager.*;
import freemarker.cache.WebappTemplateLoader;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.ProductPage;
import utility.ActionClass;
import utility.GetterSetter;
import utility.TestContext;

public class StepDefinitions {

	public static  WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	ProductPage productPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	private Properties properties;
	ConfigFileReader configFileReader;
	TestContext testContext;
	ActionClass reuseactionmethods;
    GetterSetter getterSetter;
	 
	String url = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
	String username = FileReaderManager.getInstance().getConfigReader().getUserName();
	String password = FileReaderManager.getInstance().getConfigReader().getPassword();
 	
	 
//	@Before public void setUp(){ 
//		   webDriverManager = new WebDriverManager();
//			driver = webDriverManager.getDriver();
//	       
//	    		loginPage=new LoginPage(this.driver);
//			loginPage.login();
//	      
//	   }
//	   
//	   @After public void tearDown() throws InterruptedException{
//		   try {
//			loginPage.logout();
//		} catch (InterruptedException e) {
//			loginPage.acceptMessageandLogout();
//			e.printStackTrace();
//		}
//	   }
	
	@Given("^Login Dss\\+ Application with Valid User Details$")
	public void login_Dss_Application_with_Valid_User_Details()
			throws Throwable {
    	webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
       
    		loginPage=new LoginPage(this.driver);
		loginPage.login();

	}

	@When("^User is on Home Page Click on New Item Tab and Click Create New Item$")
	public void user_is_on_Home_Page_Click_on_New_Item_Tab_and_Click_Create_New_Item()
			throws Throwable {
		 
		homePage=new HomePage(this.driver);
		homePage.clickNewItem();

	}
	
	@When("^Enter the Required Field Values for Colour Tab$")
	public void enter_the_Required_Field_Values_for_Colour_Tab() throws Throwable {
	    productPage=new ProductPage(this.driver);
	    homePage=new HomePage(driver);
	    homePage.searchKeyword(GetterSetter.getItem_No());
		homePage.clickItemNo();
		String ItemNoCreated=homePage.getItemNo();
 
		Assert.assertEquals(ItemNoCreated, GetterSetter.getItem_No());
	    productPage.clickColourTab();
	    productPage.selectColour();
	     
	    
	}
	 
	
	@When("^Enter the Required Field Values for Requirement Tab$")
	public void enter_the_Required_Field_Values_for_Requirement_Tab() throws Throwable {
	    productPage=new ProductPage(this.driver);
	    homePage=new HomePage(driver);
	    productPage.selectRequirement();
 
	     
	    
	}
	 
	
	
	@When("^Enter the Required Field Values for Specification Tab$")
	public void enter_the_Required_Field_Values_for_Specification_Tab() throws Throwable {
	    productPage=new ProductPage(this.driver);
	    homePage=new HomePage(driver);
	    productPage.selectSpecification();
	    productPage.generalInformation();
 
 
	     
	    
	}
	
 

	@Then("^The Values Should be Saved Successfully$")
	public void the_Values_Should_be_Saved_Successfully() throws Throwable {
		
		loginPage=new LoginPage(this.driver);
		homePage=new HomePage(driver);
		 
		homePage.searchKeyword(GetterSetter.getItem_No());
		homePage.clickItemNo();
		String ItemNoCreated=homePage.getItemNo();
 
		Assert.assertEquals(ItemNoCreated, GetterSetter.getItem_No());
 
		 loginPage.logout();
		
	}
	
	 
	
	

@Then("^The Warning Message Should be displayed Successfully as \"([^\"]*)\"$")
public void the_Warning_Message_Should_be_displayed_Successfully_as(String expectedMessage) throws Throwable {
	homePage=new HomePage(this.driver);
	loginPage=new LoginPage(this.driver);
	
    homePage.alertDismiss();
    String warningMessage=homePage.getMessage();
	 Assert.assertEquals(expectedMessage, warningMessage);
	 
	loginPage.acceptMessageandLogout();
}
	
	
	@When("^Enter the Required Field Values for \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"in Header Tab and Click Save$")
	public void enter_the_Required_Field_Values_for_in_Header_Tab_and_Click_Save(String Item_No, String Short_Desc, String Item_Desc,
			String Est_FF_Due_Date,String CPMCategory, String Season, String Year, String Story,
			String Line_Type, String Sell_Unit, String Department,
			String Brand_Label_Type, String Brand_Name, String Buy_Code) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 
		
		// Item_No = currentDateTime(Item_No);
  		GetterSetter.setItem_No(currentDateTime(Item_No));
		GetterSetter.setShort_Desc(Short_Desc);
		GetterSetter.setItem_Desc(Item_Desc);
	 	GetterSetter.setEst_FF_Due_Date(currentDate());
		GetterSetter.setSeason(Season);
		GetterSetter.setYear(Year);
		GetterSetter.setStory(Story);
		GetterSetter.setLineType(Line_Type);
		GetterSetter.setSell_Unit(Sell_Unit);
		GetterSetter.setDepartment(Department);
		GetterSetter.setBrand_Label_Type(Brand_Label_Type);
		GetterSetter.setBrand_Name(Brand_Name);
		GetterSetter.setBuy_Code(Buy_Code);
		//homePage.enterHeaderTabItemDetails(getterSetter.getItem_No(), Short_Desc, Item_Desc, Est_FF_Due_Date,CPMCategory, Season, Year, Story, Line_Type, Sell_Unit, Department, Brand_Label_Type, Brand_Name, Buy_Code);
		homePage.enterHeaderTabItemDetails(GetterSetter.getItem_No(), Short_Desc, Item_Desc, Est_FF_Due_Date,CPMCategory, Season, Year, Story, Line_Type, Sell_Unit, Department, Brand_Label_Type, Brand_Name, Buy_Code);
		
	}

	private String currentDateTime(String Item_No) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 
		 Date date = new Date();
		 
		 String currentdate= dateFormat.format(date);
		 String itemString=Item_No+"_"+currentdate;
		 Item_No=itemString;
		return Item_No;
	}

	private String currentDate(){
		DateFormat todayDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String todaydate = todayDateFormat.format(date);
		System.out.println(todaydate);
		return todaydate;
	}

	
	
	   
}
