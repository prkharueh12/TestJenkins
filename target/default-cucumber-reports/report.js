$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AP_verifyDressesPageFeatures.feature");
formatter.feature({
  "name": "Verify Dresses page elements and buttons",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is already on automation practice homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "AP_Login_StepDefinition.user_is_already_on_automation_practice_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify thre Subcategory buttons",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "name": "user clicks on dresses",
  "keyword": "When "
});
formatter.match({
  "location": "AP_verifyDressesPageFeatures.user_clicks_on_dresses()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[yello Dres]s\u003e but was:\u003c[Dresse]s\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.AP_verifyDressesPageFeatures.user_clicks_on_dresses(AP_verifyDressesPageFeatures.java:28)\n\tat ✽.user clicks on dresses(src/test/resources/AP_verifyDressesPageFeatures.feature:9)\n",
  "status": "failed"
});
formatter.step({
  "name": "successfully verifies three sub category buttons exist",
  "keyword": "Then "
});
formatter.match({
  "location": "AP_verifyDressesPageFeatures.successfully_verifies_three_sub_category_buttons_exist()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});