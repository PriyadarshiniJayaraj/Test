$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Item.feature");
formatter.feature({
  "line": 1,
  "name": "Create Item",
  "description": "",
  "id": "create-item",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11322013887,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create an Account",
  "description": "",
  "id": "create-item;create-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"AliExpress\" Dashboard is Launched",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Change the Currency to \"USD\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Search for Product \"Laptop\" in SearchBar",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Provide the Min Price as \"10000\" and Max Price as \"50000\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Validate that  Categories List \"Laptop\" and Shows Count of Product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.launch_the_Application()"
});
formatter.result({
  "duration": 113230282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AliExpress",
      "offset": 1
    }
  ],
  "location": "StepDefinitions.dashboard_is_Launched(String)"
});
formatter.result({
  "duration": 151086406,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USD",
      "offset": 24
    }
  ],
  "location": "StepDefinitions.change_the_Currency_to_INR(String)"
});
formatter.result({
  "duration": 6841449090,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptop",
      "offset": 20
    }
  ],
  "location": "StepDefinitions.search_for_Product_in_SearchBar(String)"
});
formatter.result({
  "duration": 4907281038,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 26
    },
    {
      "val": "50000",
      "offset": 51
    }
  ],
  "location": "StepDefinitions.provide_the_Min_Price_as_and_Max_Price_as(String,String)"
});
formatter.result({
  "duration": 2798959042,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Laptop",
      "offset": 32
    }
  ],
  "location": "StepDefinitions.validate_that_Categories_List_and_Shows_Count_of_Product(String)"
});
formatter.result({
  "duration": 96675,
  "status": "passed"
});
formatter.after({
  "duration": 26464,
  "status": "passed"
});
});