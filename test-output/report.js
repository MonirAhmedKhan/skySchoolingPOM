$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestCase_Login_Functionalities.feature");
formatter.feature({
  "name": "Login Functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid Id and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.TestCase_Login_Functionalies.i_am_in_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Longin Button Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.TestCase_Login_Functionalies.i_click_on_Longin_Button_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user Id",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TestCase_Login_Functionalies.i_enter_user_Id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.TestCase_Login_Functionalies.i_enter_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.TestCase_Login_Functionalies.click_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard Page will appear",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TestCase_Login_Functionalies.dashboard_Page_will_appear()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cWelcome Test[S]\u003e but was:\u003cWelcome Test[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.TestCase_Login_Functionalies.dashboard_Page_will_appear(TestCase_Login_Functionalies.java:53)\r\n\tat ✽.Dashboard Page will appear(file:///C:/java/WorkSpaceSDET/skySchoolingPOM/src/test/resources/features/TestCase_Login_Functionalities.feature:9)\r\n",
  "status": "failed"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", "Login with valid Id and password");
formatter.after({
  "status": "passed"
});
});