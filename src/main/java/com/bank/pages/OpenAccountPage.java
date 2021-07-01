package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerDropDownMenu;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDownMenu;
    
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void selectCustomer(String value){
        clickOnElement(customerDropDownMenu);
        selectByVisibleTextFromDropDown(customerDropDownMenu,value);
        log.info("Selecting customer from drop down menu, who has added as customer before "+customerDropDownMenu.toString());
    }


    public void selectCurrency(String value){
        clickOnElement(currencyDropDownMenu);
        selectByValueFromDropDown(currencyDropDownMenu,value);
        log.info("Selecting currency from drop down menu "+currencyDropDownMenu.toString());
    }
    
    
    public void clickOnProcessButton (){
        log.info("Clicking on Process Button " + processButton.toString());
        clickOnElement(processButton);
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
}
