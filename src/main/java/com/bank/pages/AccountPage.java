package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutButton;

    @FindBy(xpath = "//span[contains(text(),'Dipak Patel')]")
    WebElement nameText;

    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement depositButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountInputField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton1;

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement confirmationText;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement withdrawTab;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawButton1;

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement confirmationTextW;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;


    public String gettingLogOutText(){
        log.info("Getting LogOut text to confirm customer logged in successfully "+logOutButton.toString());
        return logOutButton.getText();
    }


    public String gettingCustomerNameText(){
        log.info("Getting Customer Name text to confirm customer logged in successfully "+nameText.toString());
        return nameText.getText();
    }

    public void clickOnLogOutButton (){
        clickOnElement(logOutButton);
        log.info("Clicking on Logout button" + logOutButton.toString());
    }

    public void clickDepositButton (){
        clickOnElement(depositButton);
        log.info("Clicking on Deposit button" + depositButton.toString());
    }

    public void inputAmountToBeDeposited(String amount){

        sendTextToElement(amountInputField,amount);
        log.info("Input amount to Amount To Be Deposited field "+ amountInputField.toString());
    }

    public void clickDepositButtonAfterAmountEntered (){
        clickOnElement(depositButton1);
        log.info("Clicking on Deposit button" + depositButton1.toString());
    }

    public void clickOnHomeButton (){
        clickOnElement(homeButton);
        log.info("Clicking on Home button" + homeButton.toString());
    }

    public String gettingDepositConfirmationText(){
        log.info("Getting confirmation text to confirm amount to be deposited successfully "+confirmationText.toString());
        return confirmationText.getText();
    }


    public void clickWithdrawTab (){
        clickOnElement(withdrawTab);
        log.info("Clicking on Withdraw button" + withdrawTab.toString());
    }

    public void inputAmountToBeWithdrawn(String amount){

        sendTextToElement(amountInputField,amount);
        log.info("Input amount to Amount To Be Withdraw field "+ amountInputField.toString());
    }

    public void clickWithdrawButtonAfterAmountEntered (){
        clickOnElement(withdrawButton1);
        log.info("Clicking on Deposit button" + withdrawButton1.toString());
    }

    public String gettingWithdrawConfirmationText(){
        log.info("Getting confirmation text to confirm amount to be Withdrawn successfully "+confirmationTextW.toString());
        return confirmationTextW.getText();
    }
    }


