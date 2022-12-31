@smoke
Feature: Placing Order

  #SC12- Create successful Order
  Scenario:The logged in user lands on the homepage,experiences the checkout flow and places an order
    Given The user logs in to the website
    When The user clicks on any random category or subcategory
    And The user selects and adds random products to the cart
    And The user navigates to the cart page
    And The user  agrees on the terms of services
    And The user clicks on the checkout button
    And The user fills the required fields related to the address form and submits it
    And The user chooses the shipping method'
    And the user chooses the payment method
    And the user confirms the payment information
    And The user confirms the order
    Then The user will be redirected to the Thank you page
    And The user will have their order placed

