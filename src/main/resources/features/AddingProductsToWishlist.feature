Feature: AddingProductsToWishlist

  #SC10- Logged user could add different products to Wishlist
  Scenario:The logged in user lands on the homepage,chooses and adds random products to their WishList
    Given The user logs in to the website
    When The user clicks on any random category or subcategory
    And The user selects and adds random products to the wishlist
    Then The wishlist of that user will have all the added products
