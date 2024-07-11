$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CodefiosLogin.feature");
formatter.feature({
  "name": "Codefios page login functionality validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on codefios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username as \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be landing on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on List Accounts tab",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Add Account tab",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Account Name as \"\u003caccountName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Initial Balance as \"\u003cinitialBalance\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Account Number as \"\u003caccountNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks the Save button",
  "keyword": "And "
});
formatter.step({
  "name": "New account is saved successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountName",
        "initialBalance",
        "accountNumber"
      ]
    },
    {
      "cells": [
        "demo@codefios.com",
        "abc123",
        "sk",
        "101",
        "101"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefinition.userIsOnCodefiosLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landing on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_should_be_landing_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on List Accounts tab",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_List_Accounts_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add Account tab",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_on_Add_Account_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Account Name as \"sk\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_Account_Name_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Initial Balance as \"101\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_Initial_Balance_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Account Number as \"101\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_enters_Account_Number_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Save button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.user_clicks_the_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New account is saved successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefinition.new_account_is_saved_successfully()"
});
formatter.result({
  "status": "passed"
});
});