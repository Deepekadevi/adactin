Feature: Hotel Booking In Adactin Application

  Scenario: User Login In Web Application
    Given User Launch the Adactin  Application
    When User Enter The Username In Username  Field
    And User Enter The Password In Password Field
    Then User Click The Login Button And It Navigates To Search Hotel Page

  Scenario: User select details in search Hotel Page
    When User select The Hotel Location
    And User Select The hotels Name
    And User Select The Room Type
    And User Select The Number Of Rooms
    And User Clear The Check In Date
    And User Enter The Date In Check In Date Field
    And User Clear The Check Out Date
    And User Enter The Date In Check Out Date Field
    And User Select The Adults per Room
    And User Select The Children per Room
    Then User Submit The Details

  Scenario: User Verify The Select Hotel Booking Details
    When User Click  The Conformation hotel booking details
    Then User Click The Continue Button And It Navigates To Hotel Book Page

  Scenario: User Given The Payment Details
    When User Enter The Firstname In Username  Field
    And User Enter The Lastname In Username Field
    And User Enter The Billing Address In Address Field
    And User Enter The Credit Card No In Credit Card Field
    And User Select The Credit Card Type
    And User Select The Expiry date In Selected Month
    And User Select The Expiry date In Selected Year
    And User Enter The CVV Number In CVV Number Field
    Then User Click The Book Now Button And It Navigates To Hotel Booking Conformation Page

  Scenario: User Get The Conformation In Hotel booking Details
    Then User Get The Booking Conformation And Click The Logout Butoon And It Navigates To Succesfuly Logout Page
