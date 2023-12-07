Feature: Parabank Login Test Cases

  Scenario: TC0001 Login Test Case
    Given Browser Open URL
    When Username is filled: "furkanY6"
    And Password is filled: "yldrm123"
    And Click on the login button
    Then Successful login text check
    Then Browser Close


  Scenario: TC0002 Login Failure Test Case
    Given Browser Open URL
    When Username is filled: "test2"
    And Password is filled: "test2"
    And Click on the login button
    Then Login Error text check: "The username and password could not be verified."
    Then Browser Close