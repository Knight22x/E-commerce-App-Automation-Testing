package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.Authentication;
import pages.Home;

import static stepdefinitions.Hooks.driver;

public class CurrencyChangeStep {

    Authentication auth = new Authentication();
    Home home = new Home();
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));  //Explicit waiting

    @Given("The user logs in to the website")
    public void theUserLogsInToTheWebsite() {
        auth.loginFlow();
    }

    @When("The user clicks on the currency dropdown menu")
    public void theUserClicksOnTheCurrencyDropdownMenu() {
        home.currencyChangeOption().click();
    }

    @And("The user changes the currency from USD to EURO")
    public void theUserChangesTheCurrencyFromUSDToEURO() throws InterruptedException {
        Select currencySelect = new Select(home.currencyChangeOption());
        currencySelect.selectByVisibleText("Euro");
    }

    @Then("The user will have EURO as the new currency")
    public void theUserWillHaveEUROAsTheNewCurrency() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.className("prices")).getText().contains("€"));
    }
}
