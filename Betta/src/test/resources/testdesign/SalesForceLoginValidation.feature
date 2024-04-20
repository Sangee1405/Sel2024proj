Feature: Login validation of Salesforce application

  @sc01 @lmti
  Scenario: login funcationality with valid combination
    #Given user navigates to salesforce login page
    When user enter the username "sangee" and password "abc"
    And user clicks on login button
    Then verify whether the user navigates to home page
    And verify the title

    @sc02 @lmti
  Scenario Outline: login funcationality with invalid combination
    #Given user navigates to salesforce login page
    When user enter the username "<Username>" and password "<Password>"
    And user clicks on login button
    Then verify the error message
      Examples:
        | Username | Password |
        | sangee   | abc      |
        | Akshara  | 123      |

      @excel
      Scenario: read Excel
        Given user enter the credentials


