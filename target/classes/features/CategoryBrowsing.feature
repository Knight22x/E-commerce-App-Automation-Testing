Feature: CategoryBrowsing

  #SC6- Logged user could select different Categories
  Scenario:The logged in user lands on the homepage and browses different categories
    Given The user logs in to the website
    When The user clicks on any random category or subcategory
    Then The user will be able to view the products of that category or subcategory
