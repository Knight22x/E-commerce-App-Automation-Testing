package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductListing;

public class AddingProductsToWishlistStep {

    ProductListing product = new ProductListing();
    int numberOfProductsToBeAdded = 3;

    @And("The user selects and adds random products to the wishlist")
    public void theUserSelectsAndAddsRandomProductsToTheWishlist() throws InterruptedException {
        for (int i = 0; i < numberOfProductsToBeAdded; i++) {
            product.addDifferentProductToTheWishList();
        }
    }

    @Then("The wishlist of that user will have all the added products")
    public void theWishlistOfThatUserWillHaveAllTheAddedProducts() {

    }
}
