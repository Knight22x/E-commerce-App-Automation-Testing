@smoke
Feature: AddingProductsToCompareList

  #SC11- Logged user could add different products to compare list
  Scenario:The logged in user lands on the homepage,chooses and adds random products to their CompareList
    Given The user logs in to the website
    When The user clicks on any random category or subcategory
    And The user selects and adds random products to the CompareList
    Then The CompareList of that user will have all the added products
