package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductListing;

public class AddingProductsToCompareListStep {

    ProductListing product = new ProductListing();
    int numberOfProductsToBeAdded = 2;

    @And("The user selects and adds random products to the CompareList")
    public void theUserSelectsAndAddsRandomProductsToTheCompareList() throws InterruptedException {
        for (int i = 0; i < numberOfProductsToBeAdded; i++) {
            product.addDifferentProductToTheCompareList();
        }
    }

    @Then("The CompareList of that user will have all the added products")
    public void theCompareListOfThatUserWillHaveAllTheAddedProducts() {

    }
}
