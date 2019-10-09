package testRunner;

import java.io.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)

@CucumberOptions(

		features = "classpath:features",
		glue = {"classpath:stepDefinitions"},
		plugin = { 
				
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
				,"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/Cucumber.json",
				//"cucumber-reporting:target/cucumber-reports/cucumber-pretty",
				"junit:target/cucumber-reports/Cucumber.xml"
				
				 
 			 	
		} 
				
		)
		
				

public class TestRunner {
	@AfterClass
    public static void writeExtentReport() {
         Reporter.loadXMLConfig(new File("src\\test\\resources\\config\\Report.xml"));
         Reporter.setSystemInfo("user", System.getProperty("user.name"));
    
    }
	
	 
 

}
