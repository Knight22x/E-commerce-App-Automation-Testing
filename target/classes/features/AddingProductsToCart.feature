@smoke
Feature: AddingProductsToCart

  #SC9- Logged user could add different products to Shopping cart
  Scenario:The logged in user lands on the homepage,chooses and adds random products to their cart
    Given The user logs in to the website
    When The user clicks on any random category or subcategory
    And The user selects and adds random products to the cart
    Then The shopping cart of that user will have all the added products
