Feature: Ticket Booking Application

  Background: I am on the ticket booking website homepage

  @smoke
    Scenario: Test if the flights are available from any two destination
    When  I search for flights from Abu Dhabi
    And  I search for flights to Accra
    Then I click on show flights

  @smoke
    Scenario: Test availability of the flight tickets
    When I search for flights from Abu Dhabi
    And I search for flights to Accra
    And I select the passenger Adult 2
    And I select the Business class
    And I click on show flights
    Then I verify the availability of flights

  @smoke
    Scenario: Top menu test
    When I mouse hoover on support
    And I mouse hoover and click on customer support
    Then I navigate that page and verify the contacts us text





