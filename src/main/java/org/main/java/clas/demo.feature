@tag
Feature: To Test Login function

  @tag1
  Scenario: Verify the login with valid credentials
    Given The user is in guru page
    When The user enters valid username and password
    And The user clicks the submit button
    Then The user should be in managers home page
    
 @tag2
 Scenario: Enter the new user information
  Given The user clicks the new user button
  When   The user enters the mandatory fields
  And The user clicks the submit new registration button
   |customername |Sindhu|
   |gender| Female|
   |Address| Chennai|
   |Date of Birth|14/06/1994|
   |city |madurai|
   |State |Tamilnadu|
   |Pin |600125|
   |Mobile Number| 45454545|
   |E-mail|   sindhuviji@gmail.com|
   |Password| 505050|
   Then  The user should be registered sucessfully

@tag3
Scenario: Edit the customer information
Given The user get the customer ID
When The user click on Edit customer button
When The user gives the customer ID
When The user clicks on Submit button
Then The user should be in edit customer page
Then user validate the details and does the change in the details
Then clicks on submit
