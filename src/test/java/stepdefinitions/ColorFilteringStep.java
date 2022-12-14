package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductListing;

import java.util.Random;

import static stepdefinitions.Hooks.driver;

public class ColorFilteringStep {

    Random rand = new Random();
    int index = 0;
    ProductListing product = new ProductListing();
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @When("The user navigates to the Shoes SubCategory from the Apparel MainCategory")
    public void theUserNavigatesToTheShoesSubCategoryFromTheApparelMainCategory() {
        driver.navigate().to("https://demo.nopcommerce.com/shoes");
    }


    @And("The user selects randomly a color to filter the products by such")
    public void theUserSelectsRandomlyAColorToFilterTheProductsBySuch() throws InterruptedException {
        index = rand.nextInt(product.color().size());
        product.color().get(index).click();
        Thread.sleep(2000);

    }

    @Then("The user will be able to view the products according to the filtered color")
    public void theUserWillBeAbleToViewTheProductsAccordingToTheFilteredColor() {
        String chosenColor = product.color().get(index).getText();
        if (chosenColor.equals("Grey") && product.products().size() == 3) {
            Assert.assertTrue(true);
        } else if ((chosenColor.equals("Red") || chosenColor.equals("Blue")) && product.products().size() == 1) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }


}