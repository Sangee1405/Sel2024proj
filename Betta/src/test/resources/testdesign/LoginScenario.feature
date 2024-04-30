Feature: PageObject


@LoginAmazon
  Scenario: Login Sc

    Given user enter the username and password
    Then verify the login status

