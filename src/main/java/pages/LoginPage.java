package pages;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	//WebDriver wait;

	public LoginPage(WebDriver driver)  
	{
		this.driver = driver;
		
	}
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON_ELEMENT;
	
	@FindBy(xpath="//span[contains(text(),'List Accounts')]")
	WebElement LIST_ACCOUNT_ELEMENT;
	
	@FindBy(xpath="//button[contains(text(),'Add Account')]")
	WebElement ADD_ACCOUNT;
	
	@FindBy(id = "account_name")
	WebElement ACCOUNT_NAME_ELEMENT;
	
	@FindBy(id = "balance")
	WebElement INITIAL_BALANCE_ELEMENT;
	
	@FindBy(id = "account_number")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	
	@FindBy(id = "accountSave")
	WebElement ACCOUNT_SAVE_ELEMENT;
	
	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement TOAST_MESSAGE_ELEMENT;
	
	
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	

	public void clickListAccount()
	{
		LIST_ACCOUNT_ELEMENT.click();
	}
	
	public void clickAddAccount()
	{
		ADD_ACCOUNT.click();
	}
	
	public void insertAccountName(String accountName) 
	{
		ACCOUNT_NAME_ELEMENT.sendKeys(accountName);
	}
	
	public void insertInitialBalance(String  initialBalance) 
	{
		INITIAL_BALANCE_ELEMENT.sendKeys(initialBalance);
	}
	
	public void insertAccountNumber(String accountNumber) 
	{
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
	}
	
	public void clickSaveButton()
	{
		ACCOUNT_SAVE_ELEMENT.click();
	}
	
	public String getToastMessage()
	{
		
		String actualToastMsg=TOAST_MESSAGE_ELEMENT.getText();
		return actualToastMsg;
	}

	

}