package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());


    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement addCustomerbutton;

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;



    public void enterFirstName (String firstName){

        sendTextToElement(firstNameField,firstName);
        log.info("Enter first name "+ firstName + "  to first name filed"+firstNameField.toString());
    }

    public void enterLastName (String lastName){

        sendTextToElement(lastNameField,lastName);
        log.info("Enter last name "+ lastName + "  to last name filed"+lastNameField.toString());
    }

    public void enterPostCode (String postCode){

        sendTextToElement(postCodeField,postCode);
        log.info("Enter post code   "+ postCode + "  to post code filed  "+postCodeField.toString());
    }

    public void clickOnAddCustomerButton(){

        log.info("Clicking on Add Customer button "+addCustomerbutton.toString());
        clickOnElement(addCustomerbutton);
    }

    public String alertMessage(){
        log.info("Getting Alert Message " );
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void clickOnAlertMessage(){
        log.info("Clicking OK on Alert ");
        Alert alert =driver.switchTo().alert();
        alert.accept();
    }

    public void clickOnHomeButton(){
        clickOnElement(homeButton);
        log.info("Clicking on Home button "+homeButton.toString());
    }
}
