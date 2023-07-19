$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("airline.feature");
formatter.feature({
  "line": 1,
  "name": "Ticket Booking Application",
  "description": "",
  "id": "ticket-booking-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7605770501,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "I am on the ticket booking website homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 17,
  "name": "Top menu test",
  "description": "",
  "id": "ticket-booking-application;top-menu-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I mouse hoover on support",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I mouse hoover and click on customer support",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I navigate that page and verify the contacts us text",
  "keyword": "Then "
});
formatter.match({
  "location": "AirlineSteps.iMouseHooverOnSupport()"
});
formatter.result({
  "duration": 1222805300,
  "status": "passed"
});
formatter.match({
  "location": "AirlineSteps.iMouseHooverAndClickOnCustomerSupport()"
});
formatter.result({
  "duration": 1985387499,
  "status": "passed"
});
formatter.match({
  "location": "AirlineSteps.iNavigateThatPageAndVerifyTheContactsUsText()"
});
formatter.result({
  "duration": 86864601,
  "status": "passed"
});
formatter.after({
  "duration": 104999,
  "status": "passed"
});
});