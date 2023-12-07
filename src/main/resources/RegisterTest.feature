Feature: Parabank Register Test Cases

  Scenario: TC0001 Register test cases
    Given Browser Open URL
    When "Register" click on the element
    And "FirstName" Text is entered in the field: "testFirstname"
    And "LastName" Text is entered in the field: "test"
    And "Adress" Text is entered in the field: "test sokak test mahallesi udemig binası"
    And "City" Text is entered in the field: "Istanbul"
    And "State" Text is entered in the field: "TestQA"
    And "ZipCode" Text is entered in the field: "34000"






  Scenario: TC0002 Register click
    Given Browser Open URL
    When "Register" click on the element: "#loginPanel > p:nth-child(3) > a"
