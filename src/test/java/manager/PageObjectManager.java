package manager;
import org.openqa.selenium.WebDriver;

import pageFactory.*;
public class PageObjectManager {
	private WebDriver driver;
	 
	 private HomePage loginPage;
	 private HomePage homePage;
	 
	 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
	 public HomePage getHomePage(){
		 
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
		 
		 }
	 
	 public HomePage getLoginPage() {
		 
		 return (loginPage == null) ? loginPage = new HomePage(driver) : loginPage;
		 
		 }
}
