Feature: Ebay homepage
  @ebay
  Scenario Outline: multi
   # Given user goes to ebay site
    When user enters the product name "<Search items>" in shop by category
    Then verify the search
    Examples:
      | Search items |
      | camera       |
      | doll house   |
      | motorola     |