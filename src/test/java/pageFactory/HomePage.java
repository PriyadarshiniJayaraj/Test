package pageFactory;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.*;

public class HomePage {
 public WebDriver driver;
 ReuseableLibrary reuseable;
	//WebDriverWait wait = new WebDriverWait(driver,30);
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
		ActionClass.driver=driver;
	}
	 
	@FindBy(xpath = "//*[contains(text(),'Items') and @class='cbx-vendor-dashboard-kpi-module-label z-label']")
	@CacheLookup
	WebElement lnkItem;
//	
//	@FindBy(id = "gLuP84")
//	@CacheLookup
//	WebElement lnkItem;
	
	@FindBy(xpath = "//*[contains(text(),'Create') and @class='z-menu-text']")
	@CacheLookup
	WebElement lnkCreate;
	
	@FindBy(xpath = "//*[contains(text(),'New Item') and @class='z-menuitem-text']")
	@CacheLookup
	WebElement lnkNewItem;
	
	
	@FindBy(xpath = "//*[text()='Item No.:']/following::div[1]/input")
	@CacheLookup
	WebElement txtItem_No;
	
	@FindBy(xpath = "//*[text()='Short Desc:']/following::div[1]/input")
	@CacheLookup
	WebElement txtShort_Desc;
	
	
	
	
	@FindBy(xpath = "//*[text()='Item Desc:']/../../../div[2]/div/textarea")
	@CacheLookup
	WebElement txtItem_Desc;
	
//	@FindBy(xpath= "//*[text()='Est. FF Due Date:']/../../../div[2]/span/a/i")
//	@CacheLookup
//	WebElement btnEst_FF_Due_Date;
	
	@FindBy(xpath= "//*[text()='Est. FF Due Date:']/../../../div[2]/span/input")
	@CacheLookup
	WebElement btnEst_FF_Due_Date;
	

	@FindBy(xpath = "//*[text()='Today']")
	@CacheLookup
	WebElement lnkToday;
	
	@FindBy(xpath = "//*[text()='Season:']/../../../div[2]/span/input")
	@CacheLookup
	WebElement dropDownSeason;
	
	@FindBy(xpath = "//*[text()='Year:']/following::div[1]/input")
	@CacheLookup
	WebElement txtYear;
	
	@FindBy(xpath = "//*[text()='Story:']/following::div[1]/input")
	@CacheLookup
	WebElement txtStory;
	
	@FindBy(xpath= "//*[text()='Line Type:']/following::div[1]/span/input")
	@CacheLookup
	WebElement dropDownLineType;
	
	@FindBy(id = "//*[text()='Sell Unit:']/../../../div[2]/span/input")
	@CacheLookup
	WebElement dropDowntxtSell_Unit;
	
	@FindBy(xpath = "//*[text()='Department:']/../../../td[2]/span/input")
	@CacheLookup
	WebElement dropDownDepartment;
	
	@FindBy(xpath= "//*[text()='Brand Label Type:']/following::div[1]/span/input")
	@CacheLookup
	WebElement dropDownBrand_Label_Type;
	

	@FindBy(xpath = "//*[text()='Brand Name:']/following::div[1]/span/input")
	@CacheLookup
	WebElement dropDownBrand_Name;
	
	@FindBy(xpath= "//*[text()='Buy Code:']/following::div[1]/span/input")
	@CacheLookup
	WebElement dropDownBuy_Code;
	
	@FindBy(xpath= "//*[text()='CPM Category:']/../../../div[2]/span/input")
	@CacheLookup
	WebElement dropCmpGenric;
	
	
	@FindBy(xpath= "//*[text()='Save']")
	@CacheLookup
	WebElement btnSave;
	
	//@FindBy(xpath= "//*[contains(text(),'Department:')])[1]/../span")
	@FindBy(xpath="//span[contains(text(),'missing')]")
	@CacheLookup
	WebElement warningMessage;
	
	
	@FindBy(xpath="//*[@value and @class='cbx-searchbox-inp']")
	@CacheLookup
	WebElement enterKeyword;
	
	@FindBy(xpath="//*[@class='cbx-searchbox-btn']")
	@CacheLookup
	WebElement searchButton;
	
	@FindBy(xpath="(//table)[2]/tbody/tr[1]/td[5]/a")
	@CacheLookup
	WebElement itemNo;
	
	@FindBy(id="(ModuleLink$home")
	@CacheLookup
	WebElement homeTab;
	
	@FindBy(xpath="//*[@value='Login anyway']")
	@CacheLookup
	WebElement loginAnyway;
	
	@FindBy(xpath="//*[@value='Login as another user']")
	@CacheLookup
	WebElement loginAsAnotherUser;
	
 
	public void clickNewItem() throws InterruptedException{
 		
		try {
			Thread.sleep(5000);
			ActionClass.click(lnkItem);

			Thread.sleep(10000);

			ActionClass.click(lnkCreate);

			Thread.sleep(5000);

			ActionClass.click(lnkNewItem);
		} catch (Exception e) {
			Thread.sleep(2000);
			 ActionClass.click(loginAnyway);
			 Thread.sleep(10000);
			 ActionClass.click(lnkItem);

				Thread.sleep(10000);

				ActionClass.click(lnkCreate);

				Thread.sleep(5000);

				ActionClass.click(lnkNewItem);
		}
	 
	}
	 
	public void enterHeaderTabItemDetails(String Item_No, String Short_Desc, String Item_Desc,
			String Est_FF_Due_Date,String CPMCategory, String Season, String Year, String Story,
			String Line_Type, String Sell_Unit, String Department,
			String Brand_Label_Type, String Brand_Name, String Buy_Code) throws InterruptedException{
		ActionClass.clearTextField(txtItem_No);
		ActionClass.clearTextField(txtItem_Desc);
		ActionClass.clearTextField(txtShort_Desc);
		ActionClass.clearTextField(txtStory);
		ActionClass.clearTextField(txtYear);
		ActionClass.clearTextField(dropCmpGenric);
		ActionClass.clearTextField(dropDownBrand_Label_Type);
		ActionClass.clearTextField(dropDownBrand_Name);
		ActionClass.clearTextField(dropDownBuy_Code);
		ActionClass.clearTextField(dropDownDepartment);
		ActionClass.clearTextField(dropDownLineType);
		ActionClass.clearTextField(dropDownSeason);
		ActionClass.clearTextField(enterKeyword);
	//	ActionClass.clearTextField(dropDowntxtSell_Unit);
		 
	 
		
		ActionClass.sendkey(txtItem_No,Item_No);
		ActionClass.sendkey(txtShort_Desc, Short_Desc);
		ActionClass.sendkey(txtItem_Desc,Item_Desc );
		ActionClass.sendkey(btnEst_FF_Due_Date, Est_FF_Due_Date);
		ActionClass.sendkey(dropCmpGenric, CPMCategory);
		ActionClass.sendkey(txtStory, Story);
		ActionClass.sendkey(txtYear, Year);
		
		ActionClass.sendkey(dropDownBrand_Label_Type, Brand_Label_Type);
		ActionClass.sendkey(dropDownBrand_Name, Brand_Name);
		ActionClass.sendkey(dropDownBuy_Code, Buy_Code);
		ActionClass.sendkey(dropDownLineType, Line_Type);
		ActionClass.sendkey(dropDownSeason, Season);
		ActionClass.sendkey(dropDownDepartment, Department);
		
		
		//ActionClass.sendkey(dropDowntxtSell_Unit, Sell_Unit);
		
		
	//	ActionClass.sendkey(dropDownBrand_Label_Type, Input);
	//	ActionClass.click(btnEst_FF_Due_Date);
		//ActionClass.click(lnkToday);
		//ActionClass.selectElementByIndexMethod(dropCmpGenric, 1);
//		ActionClass.selectElementByIndexMethod(dropDownBrand_Label_Type, 1);
//		ActionClass.selectElementByIndexMethod(dropDownBrand_Name, 1);
//		ActionClass.selectElementByIndexMethod(dropDownBuy_Code, 1);
//		ActionClass.selectElementByIndexMethod(dropDownDepartment, 1);
//		ActionClass.selectElementByIndexMethod(dropDownLineType, 1);
//		ActionClass.selectElementByIndexMethod(dropDownSeason, 1);
//		ActionClass.selectElementByIndexMethod(dropDowntxtSell_Unit, 1);
		ActionClass.click(btnSave);
		Thread.sleep(10000);
		ActionClass.refresh();
		 
		 
		
		
	}
	
	public void searchKeyword(String SearchText) throws InterruptedException{
		//ActionClass.click(homeTab);
		Thread.sleep(2000);
		ActionClass.clearTextField(enterKeyword);
		ActionClass.sendkey(enterKeyword, SearchText);
		ActionClass.click(searchButton);
		Thread.sleep(5000);
		 
		
	}
	
	public void clickItemNo(){
		
		ActionClass.click(itemNo);
	}
	 
   public String getMessage(){
	  String message =ActionClass.getText(warningMessage);
//	   Assert.assertEquals(expected, message);
	return message;
	   
   }
   
   public void alertAccept(){
	   ActionClass.alertAccept();
	   
   }
   public void alertDismiss(){
	   ActionClass.alertDismiss();
	   
   }
   
   public String getItemNo(){
	   String Item=ActionClass.getItemNo(itemNo);
	return Item;
   }
	
}
