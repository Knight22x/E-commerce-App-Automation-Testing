package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ProductListing;

import java.util.Random;

import static stepdefinitions.Hooks.driver;

public class TagsSelectionStep {

    Random rand = new Random();
    int index = 0;
    ProductListing product = new ProductListing();

    @And("The user selects randomly a tag")
    public void theUserSelectsRandomlyATag() {
        index = rand.nextInt(product.tags().size());
        product.tags().get(index).click();

    }

    @Then("The user will be able to view the products related with that tag")
    public void theUserWillBeAbleToViewTheProductsRelatedWithThatTag() {
        String chosenTag = product.tags().get(index).getText();
        String tagKeyword = driver.findElement(product.pageTitle()).getText();
        if (tagKeyword.contains(chosenTag)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
