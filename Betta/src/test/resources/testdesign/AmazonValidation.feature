Feature: Amazon homepage validation

  @amzon @alpha
    #before
  Scenario: search funcationality

   # Given user navigates to Amazon Homepage
    When user enters the product name "ïPhone" in searchbox
    Then verify the search result
#after

  @multiple
  Scenario Outline: multiple
    When user enters the product name "<Search Product>" in searchbox
    Then verify the search result
    Examples:
      | Search Product |
      | iphone         |
      | laptop         |
      | powerbank      |
      | Toys           |


  @amzon01
  #before
    Scenario: handle the static dropdown

    #  Given user navigates to Amazon Homepage
      When user selects the required value from the category dropdown
      And the user extract the dropdown values
#after




  @amzon02

  Scenario: handle the mouse actions

    Given user selects the baby wishlist

    @drag01
    Scenario: drag and drop
      Given user drag and drops

