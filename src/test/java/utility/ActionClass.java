package utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.*;

import com.google.common.base.Function;

public class ActionClass {
	public static  WebDriver driver;
	
	public ActionClass(WebDriver driver){
		//this.driver=driver;
	}
	 
	
	public static void executeJScript(String action, WebElement element) throws IOException, InterruptedException {
        try {
                       JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(action, element);
             
            //updateStep("Javascript Command", "Pass");
        } catch (Exception e) {
            //updateStep("Error in Executing Javascript", "Fail - Exception: "+ "\n\t\t" + e.getClass().getSimpleName());
        }
    }
	public static void waitForElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitTillElementFound(WebElement ElementTobeFound,
			int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
	}

	public static void takeScreenshotOfWebelement(WebDriver driver,
			WebElement element, String Destination) throws Exception {
		File v = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage bi = ImageIO.read(v);
		org.openqa.selenium.Point p = element.getLocation();
		int n = element.getSize().getWidth();
		int m = element.getSize().getHeight();
		BufferedImage d = bi.getSubimage(p.getX(), p.getY(), n, m);
		ImageIO.write(d, "jpg", v);

		FileUtils.copyFile(v, new File(Destination));
	}

	public static void takeScreenshotMethod()
			throws Exception {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\pjayaraj\\DssAutomationWorkspace\\Test\\Screenshot"));
	}
	
	public static void sendkey(WebElement element,String Input) {
		element.sendKeys(Input);
		}

	public static void pressKeyDown(WebElement element) {
		element.sendKeys(Keys.DOWN);
	}

	public void pressKeyEnter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	public static void pressKeyUp(WebElement element) {
		element.sendKeys(Keys.UP);
	}

	public static void moveToTab(WebElement element) {
		element.sendKeys(Keys.chord(Keys.ALT, Keys.TAB));
	}

	public static void waitTillPageLoad(int i) {

		driver.manage().timeouts().pageLoadTimeout(i, TimeUnit.SECONDS);

	}
	public static void launch_URL(String url) {
		driver.navigate().to(url);
	}


	public static void navigate_forward() {
		driver.navigate().forward();
	}

	public static void navigate_back() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}
    
	
	public static void close() {
		driver.close();
	}
	
	public static String fn_GetTimeStamp() {
		DateFormat DF = DateFormat.getDateTimeInstance();
		Date dte = new Date();
		String DateValue = DF.format(dte);
		DateValue = DateValue.replaceAll(":", "_");
		DateValue = DateValue.replaceAll(",", "");
		return DateValue;
	}

	public static void clearTextField(WebElement element) {
		element.clear();

	}
	
	public static String getText(WebElement element){
		String warningMessage=element.getText();
		System.out.println(warningMessage);
		return warningMessage;
	 
	}
	
	public static void alertAccept(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void alertDismiss(){
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static String getItemNo(WebElement element){
		String ItemNo=element.getText();
		System.out.println(ItemNo);
		return ItemNo;
	 
	}
	 
	public static void click( WebElement element) {
//		  WebDriverWait wait = new WebDriverWait(driver, 30);
//		 
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}
	 
   
	
	public static boolean xWaitForElementClickable(WebDriver driver, WebElement el, int timeWait) {
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		wait.until(ExpectedConditions.elementToBeClickable(el));
		
		return true;
	}
	public static void javascriptExecutorClick(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	public static void waitForElementPresent(WebElement element, int time_in_ms) {
        int waittime = 0;
        Boolean bln_found = false;
        while (waittime < time_in_ms) {
            try {
                //highlightElement(element);
                //updateStep("Element found", "Pass");
                bln_found = true;
                return;
            } catch (NoSuchElementException e) {
                waittime = waittime + 1000;
            }
        }
        if (bln_found == false) {
            //updateStep("Element Not  found", "Fail");
        }
    }
	
	public static void clickEnable(WebElement element) {
		try {
			boolean elementIsClickable = element.isEnabled();
			while (elementIsClickable) {
				element.click();
			}

		} catch (Exception e) {

			System.out.println("Element is not enabled");
			e.printStackTrace();
		}
	}

	public static void scrolltoElement(WebElement ScrolltoThisElement) {
		Coordinates coordinate = ((Locatable) ScrolltoThisElement)
				.getCoordinates();
		coordinate.onPage();
		coordinate.inViewPort();
	}

	public static void checkbox_Checking(WebElement checkbox) {
		boolean checkstatus;
		checkstatus = checkbox.isSelected();
		if (checkstatus == true) {
			System.out.println("Checkbox is already checked");
		} else {
			checkbox.click();
			System.out.println("Checked the checkbox");
		}
	}

	public static void radiobutton_Select(WebElement Radio) {
		boolean checkstatus;
		checkstatus = Radio.isSelected();
		if (checkstatus == true) {
			System.out.println("RadioButton is already checked");
		} else {
			Radio.click();
			System.out.println("Selected the Radiobutton");
		}
	}

	public static void checkbox_Unchecking(WebElement checkbox) {
		boolean checkstatus;
		checkstatus = checkbox.isSelected();
		if (checkstatus == true) {
			checkbox.click();
			System.out.println("Checkbox is unchecked");
		} else {
			System.out.println("Checkbox is already unchecked");
		}
	}

	public static void radioButton_Deselect(WebElement Radio) {
		boolean checkstatus;
		checkstatus = Radio.isSelected();
		if (checkstatus == true) {
			Radio.click();
			System.out.println("Radio Button is deselected");
		} else {
			System.out.println("Radio Button was already Deselected");
		}
	}

	public static void dragAndDrop(WebElement fromWebElement,
			WebElement toWebElement) {
		Actions builder = new Actions(driver);
		builder.dragAndDrop(fromWebElement, toWebElement);
	}

	public static void dropDownMenu_withclickAndHold(WebElement fromWebElement,
			WebElement toWebElement) {
		Actions builder = new Actions(driver);
		 
		Action dropDown = builder.clickAndHold(fromWebElement)
				.moveToElement(toWebElement).click(toWebElement).build();
		dropDown.perform();
	}

	public static void hoverWebelement(WebElement HovertoWebElement)
			throws InterruptedException {
		
		Actions builder = new Actions(driver);
		builder.moveToElement(HovertoWebElement).perform();
		Thread.sleep(2000);

	}

	public static void doubleClickWebelement(WebElement doubleclickonWebElement)
			throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.doubleClick(doubleclickonWebElement).perform();
		Thread.sleep(2000);

	}

	public static String getToolTip(WebElement toolTipofWebElement)
			throws InterruptedException {
		String tooltip = toolTipofWebElement.getAttribute("title");
		System.out.println("Tool text : " + tooltip);
		return tooltip;
	}

	public static void selectElementByNameMethod(WebElement element, String Name) {
		Select selectitem = new Select(element);
		selectitem.selectByVisibleText(Name);
	}

	public static void selectElementByValueMethod(WebElement element,
			String value) {
		Select selectitem = new Select(element);
		selectitem.selectByValue(value);
	}

	public static void selectElementByIndexMethod(WebElement element, int index) {
		Select selectitem = new Select(element);
		selectitem.selectByIndex(index);
	}

	public static void clickCheckboxFromList(String xpathOfElement,
			String valueToSelect) {

		List<WebElement> lst = driver.findElements(By.xpath(xpathOfElement));
		for (int i = 0; i < lst.size(); i++) {
			List<WebElement> dr = lst.get(i).findElements(By.tagName("label"));
			for (WebElement f : dr) {
				System.out.println("value in the list :" + f.getText());
				if (valueToSelect.equals(f.getText())) {
					f.click();
					break;
				}
			}
		}
	}

	public static void navigateToEveryLinkInPage() throws InterruptedException {

		List<WebElement> linksize = driver.findElements(By.tagName("a"));
		int linksCount = linksize.size();
		System.out.println("Total no of links Available:" + linksCount);
		String[] links = new String[linksCount];
		System.out.println("List of links Available:");
		// print all the links from webpage
		for (int i = 0; i < linksCount; i++) {
			links[i] = linksize.get(i).getAttribute("href");
			System.out.println(linksize.get(i).getAttribute("href"));
		}
		// navigate to each Link on the webpage
		for (int i = 0; i < linksCount; i++) {
			driver.navigate().to(links[i]);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
	}
}
