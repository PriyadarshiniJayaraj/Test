package manager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.*;
public class WebDriverManager {
	private WebDriver driver;
	 private static DriverType driverType;
	 private static EnvironmentType environmentType;
	 public static String driverPath=System.getProperty("user.dir");
	 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	 private static final String FIREFOX_DRIVER_PROPERTY="webdriver.gecko.driver";
	 private static final String IE_DRIVER_PROPERTY="webdriver.ie.driver";
	 
	 public WebDriverManager() {
	 driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	 environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	 }
	 
	 public WebDriver getDriver() {
	 if(driver == null) driver = createDriver();
	 return driver;
	 }
	 
	 private WebDriver createDriver() {
	    switch (environmentType) {     
	         case LOCAL : driver = createLocalDriver();
	          break;
	         case REMOTE : driver = createRemoteDriver();
	          break;
	    }
	    return driver;
	 }
	 
	 private WebDriver createRemoteDriver() {
	 throw new RuntimeException("RemoteWebDriver is not yet implemented");
	 }
	 
	 private WebDriver createLocalDriver() {
	        switch (driverType) {     
	        case FIREFOX : 
	     //   System.setProperty(FIREFOX_DRIVER_PROPERTY,driverPath+FileReaderManager.getInstance().getConfigReader().getDriverPath());
	       System.setProperty(FIREFOX_DRIVER_PROPERTY, driverPath+"\\lib\\geckodriver.exe");
	        	driver= new FirefoxDriver(); 
	        break;
	        case CHROME : 
	        	  System.setProperty(CHROME_DRIVER_PROPERTY, driverPath+"\\lib\\chromedriver.exe");
	     //    System.setProperty(CHROME_DRIVER_PROPERTY,driverPath+ FileReaderManager.getInstance().getConfigReader().getDriverPath());
	         driver = new ChromeDriver();
	     break;
	     
	        case INTERNETEXPLORER : 
	        //	  System.setProperty(IE_DRIVER_PROPERTY,driverPath+ FileReaderManager.getInstance().getConfigReader().getDriverPath());
	        	System.setProperty(IE_DRIVER_PROPERTY, driverPath+"\\lib\\IEDriverServer.exe");
	        	driver = new InternetExplorerDriver();
	      
	     break;
	        }
	 
	        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
	 return driver;
	 } 
	 
	 public void closeDriver() {
	 driver.close();
	 driver.quit();
	 }
}
