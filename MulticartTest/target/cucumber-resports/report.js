$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/multicartTest.feature");
formatter.feature({
  "name": "Home Page Test",
  "description": "As a Multicart user I should able to \nlaunch Multicart Web Page, see Home Page \nFeatures and Sign Up",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I open \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Background.i_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I browse to \"https://www.demo.iscripts.com/multicart/demo/index.php\"",
  "keyword": "And "
});
formatter.match({
  "location": "Background.i_browse_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should see \"SEARCH\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageFeature.i_should_see(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat homePageTest.HomePageFeature.i_should_see(HomePageFeature.java:49)\r\n\tat ✽.I should see \"SEARCH\"(file:src/test/resource/multicartTest.feature:15)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I open \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Background.i_open(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I browse to \"https://www.demo.iscripts.com/multicart/demo/index.php\"",
  "keyword": "And "
});
formatter.match({
  "location": "Background.i_browse_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Sign Up",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click logIn and signUp",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageFeature.i_click_logIn_and_signUp()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat homePageTest.HomePageFeature.i_click_logIn_and_signUp(HomePageFeature.java:56)\r\n\tat ✽.I click logIn and signUp(file:src/test/resource/multicartTest.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter all userInformation and click createAccount",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageFeature.i_enter_all_userInformation_and_click_createAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see \"Mr. AKM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageFeature.i_should_see(String)"
});
formatter.result({
  "status": "skipped"
});
});