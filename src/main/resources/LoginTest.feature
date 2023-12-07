Feature: Parabank Login Test Cases

  Scenario: TC0001 Login Test Case
    Given Browser Open URL
    When Username is filled: "testusername"
    And Password is filled: "testpassword"
    And Click on the login button


  Scenario: TC0002 Login Failure Test Case
    Given Browser Open URL
    When Username is filled: "test2"
    And Password is filled: "test2"
    And Click on the login button
    Then Login Error text check: "The username and password could not be verified."