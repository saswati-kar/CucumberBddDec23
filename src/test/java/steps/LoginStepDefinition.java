package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase
{ 
	LoginPage loginPage;
	@Given ("User is on codefios login page")
	public void userIsOnCodefiosLoginPage()
	{
		initDriver();
	}
	
	@When ("User enters username as {string}")
	public void user_enters_username_as(String username)
	{
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
	}
	
	@When("User enters password as {string}")
	public void user_enters_password_as(String password) 
	{
		loginPage.insertPassword(password);
	}
	
	@When ("User clicks on sign in button")
	public void user_clicks_on_sign_in_button()
	{
		loginPage.clickSigninButton();
	}
	
	@Then("User should be landing on dashboard page")
	public void user_should_be_landing_on_dashboard_page() 
	{
		String expectedTitle= "Codefios";
	    String actualTitle = loginPage.getPageTitle();
	    Assert.assertEquals(expectedTitle, actualTitle );
	}	
	
	
	@When("User clicks on List Accounts tab")
	 public void user_clicks_on_List_Accounts_tab() 
	 {
		 loginPage.clickListAccount();
	 }

	 @When("User clicks on Add Account tab")
	 public void user_clicks_on_Add_Account_tab() 
	 {
	     loginPage.clickAddAccount();
	 }

	 @When("User enters Account Name as {string}")
	 public void user_enters_Account_Name_as(String accountName) 
	 {
	    loginPage.insertAccountName(accountName); 
	 }

	 @When("User enters Initial Balance as {string}")
	 public void user_enters_Initial_Balance_as(String initialBalance) 
	 {
	     loginPage.insertInitialBalance(initialBalance);
	 }

	 @When("User enters Account Number as {string}")
	 public void user_enters_Account_Number_as(String accountNumber) 
	 {
	     loginPage.insertAccountNumber(accountNumber);
	 }

	 @When("User clicks the Save button")
	 public void user_clicks_the_Save_button() 
	 {
	     loginPage.clickSaveButton();
	 }

	 @Then("New account is saved successfully")
	 public void new_account_is_saved_successfully() 
	 {
	    String expectedMessage = "Account Added Successfully.";
	    String actualMsg = loginPage.getToastMessage();
	    System.out.println("Actual message -->"+actualMsg);
	    Assert.assertEquals(expectedMessage, actualMsg);
	 }
	 

}