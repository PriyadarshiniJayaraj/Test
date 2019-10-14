package pageFactory;

import junit.framework.Assert;
import manager.FileReaderManager;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ActionClass;

 

public class HomePage{
	public WebDriver driver;
	public String url;

	
 	  

	public HomePage(WebDriver driver) {
		url=FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
		PageFactory.initElements(driver, this);
		this.driver=driver;
		ActionClass.driver=driver;
		
	}
	
	@FindBy(linkText="AliExpress")
	@CacheLookup
	WebElement lnkTitle;

	
	@FindBy(xpath="//*[@class='search-key-box']/input")
	@CacheLookup
	WebElement txtSearchBar;
	
	@FindBy(xpath="//*[@class='searchbar-operate-box']/input")
	@CacheLookup
	WebElement btProductSearchIcon;
	
	@FindBy(xpath="//*[@class='next-input next-small min-price']/input")
	@CacheLookup
	WebElement txtMinPriceSearch;
	
	@FindBy(xpath="//*[@class='next-input next-small']/input")
	@CacheLookup
	WebElement txtMaxPriceSearch;
	
	@FindBy(linkText="OK")
	@CacheLookup
	WebElement btnPriceRangeOk;
	
	
	@FindBy(id="switcher-info")
	@CacheLookup
	WebElement lnkShipTo;
	
	@FindBy(xpath="//*[@class='address-select-trigger' and @data-role='country']")
	@CacheLookup
	WebElement lstCountry;
	
	@FindBy(xpath="//*[@class='switcher-currency-c language-selector' and @data-role='language-container']")
	@CacheLookup
	WebElement lstLanguage;
	
	@FindBy(xpath="//*[@class='switcher-currency-c' and @data-role='switch-currency']")
	@CacheLookup
	WebElement lstCurrency;
	
	@FindBy(xpath="//*[@id='nav-global']/div[4]/div/div/div/div[3]/div/div/input")
	@CacheLookup
	WebElement txtSearchCurrency;
	
	@FindBy(xpath="//*[@id='nav-global']/div[4]/div/div/div/div[3]/div/div/i")
	@CacheLookup
	WebElement btnSearchIconCurrency;
	
	@FindBy(xpath="//*[@class='ui-button ui-button-primary go-contiune-btn' and @data-role='save']")
	@CacheLookup
	WebElement btnSave;
	
	
 
	@SuppressWarnings("deprecation")
	public void verifyApplicationTitle(String title){
		String actualTitle=ActionClass.getText(lnkTitle);
		Assert.assertEquals(title, actualTitle);	
		
	}
	
	public void clickShipTo(){
		ActionClass.click(lnkShipTo);
	}
	
	 
	
	public void selectCurrency(String Currency){
		ActionClass.click(lnkShipTo);
		ActionClass.click(lstCurrency);
		ActionClass.sendkey(txtSearchCurrency, Currency);
		ActionClass.click(btnSearchIconCurrency);
		ActionClass.click(btnSave);
		
	}
	
	public void searchProduct(String product){
		try {
			ActionClass.sendkey(txtSearchBar, product);
			ActionClass.click(btProductSearchIcon);
		} catch (Exception e) {
			ActionClass.alertAccept();
			e.printStackTrace();
		}
		
	}
	 
	
	public void priceRange(String min,String max){
		try {
			ActionClass.sendkey(txtMinPriceSearch, min);
			ActionClass.sendkey(txtMaxPriceSearch, max);
			ActionClass.click(btnPriceRangeOk);
		} catch (Exception e) {
			 ActionClass.alertDismiss();
			e.printStackTrace();
		}
	}
	
	
public void login(){
    ActionClass.launch_URL(this.url);
	 
}


 public void logout() throws InterruptedException{
 // ActionClass.close();
	 
 }


}
