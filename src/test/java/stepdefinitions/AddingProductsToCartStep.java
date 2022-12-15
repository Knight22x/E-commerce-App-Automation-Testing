package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Home;
import pages.ProductListing;

public class AddingProductsToCartStep {


    ProductListing product = new ProductListing();
    int numberOfProductsToBeAdded = 3;
    Home cart = new Home();


    @And("adsd")
    public void asda() {

    }

    @And("The user selects and adds random products to the cart")
    public void theUserSelectsAndAddsRandomProductsToTheCart() throws InterruptedException {
        for (int i = 0; i < numberOfProductsToBeAdded; i++) {
            product.addDifferentProductToTheCart();
        }


    }

    @Then("The shopping cart of that user will have all the added products")
    public void theShoppingCartOfThatUserWillHaveAllTheAddedProducts() {
        if (ProductListing.successfulCartAdditions == cart.cartCount() - ProductListing.currentCartCount) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
