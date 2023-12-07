Feature: Parabank Register Test Cases

  Scenario: TC0001 Register test cases successful registration
    Given Browser Open URL
    When "Register" click on the element
    And "FirstName" Text is entered in the field: "testFirstname"
    And "LastName" Text is entered in the field: "test"
    And "Adress" Text is entered in the field: "test sokak test mahallesi udemig binası"
    And "City" Text is entered in the field: "Istanbul"
    And "State" Text is entered in the field: "TestQA"
    And "ZipCode" Text is entered in the field: "34000"
    And "PhoneNumber" Text is entered in the field: "0555555"
    And "SSN" Text is entered in the field: "145"
    And "Username" Text is entered in the field: "furkanY"
    And "Password" Text is entered in the field: "yldrm123"
    And "Confirm" Text is entered in the field: "yldrm123"
    Then "registerBtnRegister" click on the element


  Scenario: TC0002 Register test cases successful registration and text check
    Given Browser Open URL
    When "Register" click on the element
    And "FirstName" Text is entered in the field: "testFirstname"
    And "LastName" Text is entered in the field: "test"
    And "Adress" Text is entered in the field: "test sokak test mahallesi udemig binası"
    And "City" Text is entered in the field: "Istanbul"
    And "State" Text is entered in the field: "TestQA"
    And "ZipCode" Text is entered in the field: "34000"
    And "PhoneNumber" Text is entered in the field: "0555555"
    And "SSN" Text is entered in the field: "145"
    And "Username" Text is entered in the field: "furkanY6"
    And "Password" Text is entered in the field: "yldrm123"
    And "Confirm" Text is entered in the field: "yldrm123"
    When "registerBtnRegister" click on the element
    Then Successful register text check
    Then Browser Close




  Scenario: TC000999 Register click
    Given Browser Open URL
    When "Register" click on the element: "#loginPanel > p:nth-child(3) > a"
