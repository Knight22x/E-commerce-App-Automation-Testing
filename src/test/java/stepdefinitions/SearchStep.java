package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Home;
import pages.ProductListing;

import static stepdefinitions.Hooks.driver;


public class SearchStep {

    ProductListing product = new ProductListing();
    Home home = new Home();

    @When("The user clicks on the search bar")
    public void theUserClicksOnTheSearchBar() {
        driver.findElement(home.searchField()).click();
    }

    @And("The user searches for the keyword {string}")
    public void theUserSearchesForTheKeyword(String arg0) {
        driver.findElement(home.searchField()).sendKeys(arg0);
    }

    @And("The user clicks on the search button")
    public void theUserClicksOnTheSearchButton() {
        driver.findElement(home.searchField()).submit();
    }

    @Then("Search results related to the keyword will be displayed")
    public void searchResultsRelatedToTheKeywordWillBeDisplayed() throws InterruptedException {
        Assert.assertTrue(product.products().size() > 0);

    }

}
