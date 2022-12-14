Feature: TagsSelection

  #SC8- Logged user could select different tags
  Scenario:The logged in user could filter products results by tags
    Given The user logs in to the website
    When The user clicks on any random category or subcategory
    And The user selects randomly a tag
    Then The user will be able to view the products related with that tag
