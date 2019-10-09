package utility;
import java.io.FileNotFoundException;

import manager.*;

public class TestContext {
	private WebDriverManager webDriverManager;
	 private PageObjectManager pageObjectManager;
	 
	 public TestContext() throws FileNotFoundException{
	 webDriverManager = new WebDriverManager();
	 pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	 }
	 
	 public WebDriverManager getWebDriverManager() {
	 return webDriverManager;
	 }
	 
	 public PageObjectManager getPageObjectManager() {
	 return pageObjectManager;
	 }
}
