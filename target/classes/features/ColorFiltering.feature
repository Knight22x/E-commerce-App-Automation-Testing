Feature: ColorFiltering

  #SC7- Logged user could filter with color
  Scenario:The logged in user could filter products results by color
    Given The user logs in to the website
    When The user navigates to the Shoes SubCategory from the Apparel MainCategory
    And The user selects randomly a color to filter the products by such
    Then The user will be able to view the products according to the filtered color
