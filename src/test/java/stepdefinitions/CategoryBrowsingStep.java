package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductListing;


public class CategoryBrowsingStep {

    ProductListing category = new ProductListing();

    @When("The user clicks on any random category or subcategory")
    public void theUserClicksOnAnyRandomCategorySubcategory() throws InterruptedException {
        category.viewRandomCategoryAndSubcategory();
    }

    @Then("The user will be able to view the products of that category or subcategory")
    public void theUserWillBeAbleToViewTheProductsOfThatCategorySubcategory() {
    }
}
