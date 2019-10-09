package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import utility.ActionClass;
import utility.ReuseableLibrary;

public class ProductPage {
	public WebDriver driver;
	ReuseableLibrary reuseable;

	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		ActionClass.driver = driver;
	}

	@FindBy(xpath = "//*[@class='z-tabs']/ul/li[2]/a/span")
	@CacheLookup
	WebElement lnkColourHeaderTab;
	
	@FindBy(xpath = "//*[@class='z-tabs']/ul/li[3]/a/span")
	@CacheLookup
	WebElement lnkRequirementHeaderTab;
	
	
	@FindBy(xpath = "//*[span='Specification']")
	@CacheLookup
	WebElement lnkSpecificationHeaderTab;
	
	@FindBy(xpath="//*[contains(text(),'Select Colours')]")
	@CacheLookup
	WebElement lnkSelectColours;
	
	
	@FindBy(xpath="//*[@class='cbx-searchbox']//input")
	@CacheLookup
	WebElement enterKeyword;
	
	@FindBy(xpath="//*[@class='cbx-searchbox']//input/following::div[1]")
	@CacheLookup
	WebElement searchIcon;
	
	@FindBy(xpath="//*[@class='cbx-searchViewGrid z-row z-grid-odd']/td[2]/span[1]")
	@CacheLookup
	WebElement colorItem;
	
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-hazardousGoods z-div']/span/input")
	@CacheLookup
	WebElement hazardousGoods;
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-hangerType z-div']/span/input")
	@CacheLookup
	WebElement hangerType;
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-hangerSubType z-div']/span/input")
	@CacheLookup
	WebElement hangerCode;
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-custText7 z-div']/input")
	@CacheLookup
	WebElement ageGrading;
	
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-custCodelist7 z-div']/span/input")
	@CacheLookup
	WebElement countryofOrigin;
	
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-custText8 z-div']/input")
	@CacheLookup
	WebElement colorVariations;
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-custText9 z-div']/input")
	@CacheLookup
	WebElement itemDescPacking;
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-custText10 z-div']/input")
	@CacheLookup
	WebElement sizeRangeDimension;
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-additionalDesc z-div']/div/textarea")
	@CacheLookup
	WebElement notesInstruction;
	
	
	@FindBy(xpath="//*[@class='cbx-field-value cbx-field-value-additionalDesc z-div']/div/span")
	@CacheLookup
	WebElement notesInstructionbtn;
	
	@FindBy(xpath="//*[@class='cbx-toolbar clearfix cbx-toolbar-bottom z-div'] /div[1]/button[1]")
	@CacheLookup
	WebElement btnOk;
	
	@FindBy(xpath= "//*[text()='Save']")
	@CacheLookup
	WebElement btnSave;
	
	
	@FindBy(linkText="Select...")
	@CacheLookup
	WebElement lnkSelect;
	
	
	@FindBy(xpath="//*[@class='z-window z-window-modal z-window-shadow']//following::table[2]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement chckRequirementItem;
	
	
	public void clickColourTab() throws InterruptedException{
		Thread.sleep(5000);
		ActionClass.click(lnkColourHeaderTab);
		ActionClass.click(lnkSelectColours);
		Thread.sleep(1000);
		ActionClass.click(searchIcon);
		
	}
	
	public void selectColour() throws InterruptedException{
		ActionClass.sendkey(enterKeyword, "pink");
		 ActionClass.click(searchIcon);
		Thread.sleep(2000);
		ActionClass.click(colorItem);
		ActionClass.click(btnOk);
		Thread.sleep(2000);
		ActionClass.click(btnSave);
		Thread.sleep(2000);
	}
	
	
	public void selectRequirement() throws InterruptedException{
		Thread.sleep(2000);
		ActionClass.click(lnkRequirementHeaderTab);
		Thread.sleep(1000);
		ActionClass.click(lnkSelect);
		ActionClass.sendkey(enterKeyword, "BPF Additional Info");
		ActionClass.click(searchIcon);
		Thread.sleep(1000);
		ActionClass.click(chckRequirementItem);
		ActionClass.click(btnOk);
		Thread.sleep(2000);
		ActionClass.click(btnSave);
		Thread.sleep(4000);
		
	}
	
	
	public void selectSpecification() throws InterruptedException{
		Thread.sleep(2000);
		ActionClass.click(lnkSpecificationHeaderTab);
		Thread.sleep(2000);
		ActionClass.clearTextField(hazardousGoods);
		ActionClass.clearTextField(hangerType);
		ActionClass.clearTextField(hangerCode);
		ActionClass.clearTextField(ageGrading);
		ActionClass.clearTextField(countryofOrigin);
		ActionClass.clearTextField(colorVariations);
		ActionClass.clearTextField(itemDescPacking);
		ActionClass.clearTextField(sizeRangeDimension);
		ActionClass.clearTextField(notesInstruction);
		
	}
     
	public void generalInformation(){
		ActionClass.sendkey(hazardousGoods, "Yes");
		ActionClass.sendkey(hangerType, "Bottoms - FIS");
		ActionClass.sendkey(hangerCode, "FIS_BH280BL_AC19-FIS - 280MM BOTTOM CLIP HNGR & SIZE CLIP");
		ActionClass.sendkey(ageGrading, "10");
		ActionClass.sendkey(countryofOrigin, "AU-Australia");
		ActionClass.sendkey(colorVariations, "Pink");
		ActionClass.sendkey(itemDescPacking, "Test");
		ActionClass.sendkey(sizeRangeDimension, "10");
		ActionClass.sendkey(notesInstruction, "Test");
		ActionClass.click(btnSave);
		
	}
	

}
