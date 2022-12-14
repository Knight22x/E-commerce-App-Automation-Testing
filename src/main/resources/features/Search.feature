Feature: Search

  #SC5- Logged User could search for any product
  Scenario:The logged in user lands on the homepage and searches for a product using the search bar
    Given The user logs in to the website
    When The user clicks on the search bar
    And The user searches for the keyword "shoes"
    And The user clicks on the search button
    Then Search results related to the keyword will be displayed