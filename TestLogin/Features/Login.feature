Feature: Login

  Scenario: Valid Login
    Given User navigates to login page
    When User enters a valid username and password
    Then User should be successfully logged in redirected to "Secure Area" page
