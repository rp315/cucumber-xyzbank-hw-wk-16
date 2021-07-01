package com.bank.cucumber.stepDefs;

import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_old.Ac;
import gherkin.lexer.Th;
import org.junit.Assert;

public class BankStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Bank Manager login tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginButton();
    }

    @And("^I click on Add Customer tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter First name \"([^\"]*)\" to First Name field$")
    public void iEnterFirstNameToFirstNameField(String firstName) throws InterruptedException {
        Thread.sleep(1000);
        new AddCustomerPage().enterFirstName(firstName);
    }

    @And("^I enter Last Name \"([^\"]*)\" to Last Name Field$")
    public void iEnterLastNameToLastNameField(String lastName) throws InterruptedException {
        Thread.sleep(1000);
        new AddCustomerPage().enterLastName(lastName);
    }

    @And("^I enter Postcode \"([^\"]*)\" to Postcode Field$")
    public void iEnterPostcodeToPostcodeField(String postcode) throws InterruptedException {
        Thread.sleep(1000);
        new AddCustomerPage().enterPostCode(postcode);
    }

    @And("^I click on Add customer button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^I am able to see popup display with \"([^\"]*)\" message$")
    public void iAmAbleToSeePopupDisplayWithMessage(String expectedPopUpMessage)    {

        Assert.assertTrue(new AddCustomerPage().alertMessage().contains(expectedPopUpMessage));
    }

    @And("^I should be able to click OK button on popup$")
    public void iShouldBeAbleToClickOKButtonOnPopup() {
        new AddCustomerPage().clickOnAlertMessage();
    }

    @When("^I click on Open Account tab$")
    public void iClickOnOpenAccountTab() {

        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("^I select \"([^\"]*)\" customer name which added before$")
    public void iSelectCustomerNameWhichAddedBefore(String customerName)  {
        new OpenAccountPage().selectCustomer(customerName);

    }

    @And("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency)  {
        new OpenAccountPage().selectCurrency(currency);

    }

    @And("^I click on Process button$")
    public void iClickOnProcessButton() {

        new OpenAccountPage().clickOnProcessButton();
    }

    @When("^I click on home button$")
    public void iClickOnHomeButton() throws InterruptedException {

        Thread.sleep(2000);
        new AddCustomerPage().clickOnHomeButton();
    }

    @And("^I click on Customer Login button$")
    public void iClickOnCustomerLoginButton() {
        new HomePage().clickCustomerLoginButton();
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {

        new CustomerLoginPage().clickCustomerLoginButton();
    }

    @Then("^I should be able to verify \"([^\"]*)\" tab displayed$")
    public void iShouldBeAbleToVerifyTabDisplayed(String logOutTab) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(logOutTab,new AccountPage().gettingLogOutText());
    }

    @And("^I should be able able to verify customer name \"([^\"]*)\"$")
    public void iShouldBeAbleAbleToVerifyCustomerName(String expectedCustomerName) throws InterruptedException {
       Thread.sleep(1000);
        Assert.assertEquals(expectedCustomerName,new AccountPage().gettingCustomerNameText());
    }

    @And("^I should able to click logout button$")
    public void iShouldAbleToClickLogoutButton() {

        new AccountPage().clickOnLogOutButton();
    }


    @And("^I click on Deposit tab$")
    public void iClickOnDepositTab() throws InterruptedException {

        Thread.sleep(1000);
        new AccountPage().clickDepositButton();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount) throws InterruptedException {
        Thread.sleep(1000);
        new AccountPage().inputAmountToBeDeposited(amount);
    }

    @And("^I click on Deposit button$")
    public void iClickOnDepositButton() throws InterruptedException {

        Thread.sleep(1000);
        new AccountPage().clickDepositButtonAfterAmountEntered();
    }

    @Then("^I should able to verify message \"([^\"]*)\"$")
    public void iShouldAbleToVerifyMessage(String expectedMessage)  {

        Assert.assertEquals(expectedMessage,new AccountPage().gettingDepositConfirmationText());

    }

    @When("^I click on Withdraw tab$")
    public void iClickOnWithdrawTab() throws InterruptedException {

        Thread.sleep(1000);
        new AccountPage().clickWithdrawTab();
    }

    @And("^I enter amount \"([^\"]*)\" in amount to be withdrawn field$")
    public void iEnterAmountInAmountToBeWithdrawnField(String amount) throws InterruptedException {

        Thread.sleep(1000);
        new AccountPage().inputAmountToBeWithdrawn(amount);
    }

    @And("^I click Withdraw tab$")
    public void iClickWithdrawTab() {
        new AccountPage().clickWithdrawButtonAfterAmountEntered();
    }

    @Then("^I should able to verify withdrawn message \"([^\"]*)\"$")
    public void iShouldAbleToVerifyWithdrawnMessage(String expectedTransactionMessage) {
        Assert.assertEquals(expectedTransactionMessage,new AccountPage().gettingWithdrawConfirmationText());
    }
}
