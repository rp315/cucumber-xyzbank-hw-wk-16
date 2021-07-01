package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankMangerLoginButton;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginButton;



    public void clickOnBankManagerLoginButton (){
        clickOnElement(bankMangerLoginButton);
        log.info("Clicking on Bank Manager Login button" + bankMangerLoginButton.toString());
    }

    public void clickCustomerLoginButton (){
        clickOnElement(customerLoginButton);
        log.info("Clicking on Customer Login button" + customerLoginButton.toString());
    }

}
