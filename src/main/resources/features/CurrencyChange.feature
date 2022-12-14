Feature: CurrencyChange

  #SC4- Logged User could switch between currencies US-Euro
  Scenario:The logged in user lands on the homepage and changes the currency from USD to EURO
    Given The user logs in to the website
    When The user clicks on the currency dropdown menu
    And The user changes the currency from USD to EURO
    Then The user will have EURO as the new currency
