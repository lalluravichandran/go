$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/preet/eclipse-workspace/Cucumber/src/test/java/com/feature/Google.feature");
formatter.feature({
  "line": 1,
  "name": "Google App Testing",
  "description": "",
  "id": "google-app-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "To Check The Mail",
  "description": "",
  "id": "google-app-testing;to-check-the-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Must Launch the \"chrome\" Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Must Launch the \"https://www.google.co.in/\" Url",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 22
    }
  ],
  "location": "Googlestep.user_Must_Launch_the_Browser(String)"
});
formatter.result({
  "duration": 4062389600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.co.in/",
      "offset": 22
    }
  ],
  "location": "Googlestep.user_Must_Launch_the_Url(String)"
});
formatter.result({
  "duration": 1067716900,
  "status": "passed"
});
});