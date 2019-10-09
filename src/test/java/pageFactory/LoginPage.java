package pageFactory;

import manager.FileReaderManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ActionClass;

 

public class LoginPage{
	public WebDriver driver;
	public String url;
	public String username;
	public String password;
	
 	  

	public LoginPage(WebDriver driver) {
		url=FileReaderManager.getInstance().getConfigReader().getApplicationUrl();
		  username=FileReaderManager.getInstance().getConfigReader().getUserName();
		  password=FileReaderManager.getInstance().getConfigReader().getPassword();
		PageFactory.initElements(driver, this);
		this.driver=driver;
		ActionClass.driver=driver;
		
	}
	
@FindBy(id="username")
@CacheLookup
WebElement txtUsername;

@FindBy(id="password")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath="//input[@id='submit']")
@CacheLookup
WebElement btnLogin;

@FindBy(className="ForgotPassword")
@CacheLookup
WebElement lnkForgotPassword;

@FindBy(xpath="//div[contains(@class, 'userInfoContainer z-div')]/div[3]")
@CacheLookup
WebElement lnkProfileLook;



@FindBy(xpath="//span[contains(text(),'Logout')]")
@CacheLookup
WebElement lnkLogOut;

@FindBy(xpath="//*[@class='z-messagebox-button z-button']/../../../../tbody/tr/td[1]/button[1]")
@CacheLookup
WebElement btnMessageOk;

@FindBy(xpath="//*[@class='z-messagebox-button z-button']/../../../../tbody/tr/td[3]/button[1]")
@CacheLookup
WebElement btnMessageCancel;

 

 
public void login(){
    ActionClass.launch_URL(this.url);
	ActionClass.clearTextField(txtUsername);
	ActionClass.sendkey(txtUsername, this.username);
	ActionClass.clearTextField(txtPassword);
	ActionClass.sendkey(txtPassword,this.password);
	ActionClass.click(btnLogin);
}


 public void logout() throws InterruptedException{
	 Thread.sleep(5000);
	 
	 ActionClass.click(lnkProfileLook);
	 Thread.sleep(5000);
	 ActionClass.click(lnkLogOut);
	  lnkLogOut.click();
	  Thread.sleep(3000);
	 ActionClass.close();
	 
 }

 public void acceptMessageandLogout() throws InterruptedException{
	 
 	 ActionClass.click(lnkProfileLook);
		 
		 Thread.sleep(5000);
		 ActionClass.click(lnkLogOut);
		  
		  Thread.sleep(5000);
  	  ActionClass.click(btnMessageOk);
		 
		 ActionClass.close();
	 
 }
 

public void clickForgotPassword() {
	lnkForgotPassword.click();
}
}
