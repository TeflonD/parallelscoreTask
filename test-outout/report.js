$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/careers.feature");
formatter.feature({
  "line": 1,
  "name": "Careers",
  "description": "",
  "id": "careers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Check that a user can select a categoty and location",
  "description": "",
  "id": "careers;check-that-a-user-can-select-a-categoty-and-location",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user navigates to the URL \"https://parallelscore.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user selects Full time from the catory drop-down field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user selects Lagos from the Location drop-down field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the Careers – ParallelScore page should be displayed to the user",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "the user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launches_chrome_browser()"
});
formatter.result({
  "duration": 5586100200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://parallelscore.com",
      "offset": 27
    }
  ],
  "location": "Steps.user_navigates_to_the_URL(String)"
});
formatter.result({
  "duration": 11954160200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_user_selects_Full_time_from_the_catory_drop_down_field()"
});
formatter.result({
  "duration": 4180681500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_user_selects_Lagos_from_the_Location_drop_down_field()"
});
formatter.result({
  "duration": 274893000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 1977071500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_Careers_ParallelScore_page_should_be_displayed_to_the_user()"
});
formatter.result({
  "duration": 3368307300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_user_closes_the_browser()"
});
formatter.result({
  "duration": 969105200,
  "status": "passed"
});
});