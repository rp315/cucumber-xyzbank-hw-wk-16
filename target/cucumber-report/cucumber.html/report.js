$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featureFile/bank.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "\r\nAs a user I want to verify xyz bank account functionalities",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6724233400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User as a bank manager should able to add customer successfully",
  "description": "",
  "id": "bank-test;user-as-a-bank-manager-should-able-to-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    },
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Bank Manager login tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Add Customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter First name \"Rajendra\" to First Name field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Last Name \"Patel\" to Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Postcode \"SO16 4RJ\" to Postcode Field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I am able to see popup display with \"Customer added successfully\" message",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I should be able to click OK button on popup",
  "keyword": "And "
});
formatter.match({
  "location": "BankStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 301986200,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 288125500,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 469922600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rajendra",
      "offset": 20
    }
  ],
  "location": "BankStepdefs.iEnterFirstNameToFirstNameField(String)"
});
formatter.result({
  "duration": 1247867800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 19
    }
  ],
  "location": "BankStepdefs.iEnterLastNameToLastNameField(String)"
});
formatter.result({
  "duration": 1183723900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SO16 4RJ",
      "offset": 18
    }
  ],
  "location": "BankStepdefs.iEnterPostcodeToPostcodeField(String)"
});
formatter.result({
  "duration": 1197813600,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 156388300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully",
      "offset": 37
    }
  ],
  "location": "BankStepdefs.iAmAbleToSeePopupDisplayWithMessage(String)"
});
formatter.result({
  "duration": 19184100,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iShouldBeAbleToClickOKButtonOnPopup()"
});
formatter.result({
  "duration": 33436900,
  "status": "passed"
});
formatter.after({
  "duration": 1319705900,
  "status": "passed"
});
formatter.before({
  "duration": 3819447200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User as a bank manager should able to open account successfully",
  "description": "",
  "id": "bank-test;user-as-a-bank-manager-should-able-to-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Smoke"
    },
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I click on Bank Manager login tab",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I click on Add Customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter First name \"Rajendra\" to First Name field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter Last Name \"Patel\" to Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter Postcode \"SO16 4RJ\" to Postcode Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I am able to see popup display with \"Customer added successfully\" message",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I should be able to click OK button on popup",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on Open Account tab",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I select \"Rajendra Patel\" customer name which added before",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select currency \"Pound\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Process button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I am able to see popup display with \"Account created successfully\" message",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I should be able to click OK button on popup",
  "keyword": "And "
});
formatter.match({
  "location": "BankStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 54900,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 314189300,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 579887700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rajendra",
      "offset": 20
    }
  ],
  "location": "BankStepdefs.iEnterFirstNameToFirstNameField(String)"
});
formatter.result({
  "duration": 1216838800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 19
    }
  ],
  "location": "BankStepdefs.iEnterLastNameToLastNameField(String)"
});
formatter.result({
  "duration": 1178710000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SO16 4RJ",
      "offset": 18
    }
  ],
  "location": "BankStepdefs.iEnterPostcodeToPostcodeField(String)"
});
formatter.result({
  "duration": 1194595800,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 146109000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully",
      "offset": 37
    }
  ],
  "location": "BankStepdefs.iAmAbleToSeePopupDisplayWithMessage(String)"
});
formatter.result({
  "duration": 10961900,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iShouldBeAbleToClickOKButtonOnPopup()"
});
formatter.result({
  "duration": 21181600,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnOpenAccountTab()"
});
formatter.result({
  "duration": 158601900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rajendra Patel",
      "offset": 10
    }
  ],
  "location": "BankStepdefs.iSelectCustomerNameWhichAddedBefore(String)"
});
formatter.result({
  "duration": 584890400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pound",
      "offset": 19
    }
  ],
  "location": "BankStepdefs.iSelectCurrency(String)"
});
formatter.result({
  "duration": 394171500,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iClickOnProcessButton()"
});
formatter.result({
  "duration": 142665200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account created successfully",
      "offset": 37
    }
  ],
  "location": "BankStepdefs.iAmAbleToSeePopupDisplayWithMessage(String)"
});
formatter.result({
  "duration": 9049300,
  "status": "passed"
});
formatter.match({
  "location": "BankStepdefs.iShouldBeAbleToClickOKButtonOnPopup()"
});
formatter.result({
  "duration": 24994300,
  "status": "passed"
});
formatter.after({
  "duration": 1140841400,
  "status": "passed"
});
});