package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Home;
import pages.Order;

import java.time.Duration;

import static stepdefinitions.Hooks.driver;
import static utility.Constants.SUCCESS_URL;

public class PlacingOrderStep {
    Home home = new Home();
    Order order = new Order();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Explicit waiting

    @And("The user navigates to the cart page")
    public void theUserNavigatesToTheCartPage() {
        driver.findElement(home.cartRedirectionLink()).click();
    }

    @And("The user  agrees on the terms of services")
    public void theUserAgreesOnTheTermsOfServices() {
        driver.findElement(order.termsOfServiceCheckbox()).click();
        Assert.assertTrue(driver.findElement(order.termsOfServiceCheckbox()).isSelected());
    }

    @And("The user clicks on the checkout button")
    public void theUserClicksOnTheCheckoutButton() {
        driver.findElement(order.checkoutButton()).click();
    }

    @And("The user fills the required fields related to the address form and submits it")
    public void theUserFillsTheRequiredFieldsRelatedToTheAddressForm() throws InterruptedException {
        order.requiredAddressSubmissionFlow();
    }

    @And("The user chooses the shipping method'")
    public void theUserChoosesTheShippingMethod() {
        driver.findElement(order.submitShippingMethodButton()).click();
    }

    @And("the user chooses the payment method")
    public void theUserChoosesThePaymentMethod() {
        driver.findElement(order.submitPaymentMethodButton()).click();
    }

    @And("the user confirms the payment information")
    public void theUserConfirmsThePaymentInformation() {
        driver.findElement(order.paymentInfoButton()).click();
    }

    @And("The user confirms the order")
    public void theUserConfirmsTheOrder() {
        driver.findElement(order.confirmOrderButton()).click();
    }

    @Then("The user will be redirected to the Thank you page")
    public void theUserWillBeRedirectedToTheThankYouPage() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertEquals(driver.getCurrentUrl(), SUCCESS_URL);
    }

    @And("The user will have their order placed")
    public void theUserWillHaveTheirOrderPlaced() {
        //
    }
}
