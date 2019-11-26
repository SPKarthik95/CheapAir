
Feature: Validate the Flight Booking functionality of ClearAir

  Scenario: Flight Booking Functionality 
    Given User is in Home page
    And User selecting the valid credentials
        |Chennai Intl. Airport (MAA) Madras, India|Miami, FL|
    And User click search flights button
    When User selecting the cheapest departure and return flights
    And User click the continue button
    Then User is in payment page
    
    
    

