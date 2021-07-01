package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerNameDropDownMenu;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutButton;

    @FindBy(xpath = "//span[contains(text(),'Neville Longbottom')]")
    WebElement nameText;


    public void selectCustomer(String value){
        clickOnElement(customerNameDropDownMenu);
        selectByValueFromDropDown(customerNameDropDownMenu,value);
        log.info("Selecting customer from drop down menu, who has added as customer before "+customerNameDropDownMenu.toString());
    }

    public void clickCustomerLoginButton (){
        clickOnElement(loginButton);
        log.info("Clicking on Customer Login button" + loginButton.toString());
    }

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

}
