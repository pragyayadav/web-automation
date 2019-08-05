@test
Feature: Update personal information of user

  Scenario: Update Personal Information (First Name) in My Account
    Given I access the Automation Practice homepage
    And I click on SignIn button
    And I fill in login name "someone1@example.com" and password "example"
    And I click on Submit button
    And I click on My Personal Information
    When I updated user first name to "Automation"
    And I enter password "example"
    Then I click on Save button
    And The success message is "Your personal information has been successfully updated."
    And I verified updated name is "Automation Example"
    And I logout
