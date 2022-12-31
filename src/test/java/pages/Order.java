package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepdefinitions.Hooks.driver;

public class Order {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Explicit waiting

    public By termsOfServiceCheckbox() {
        return By.id("termsofservice");
    }


    public By checkoutButton() {
        return By.id("checkout");
    }

    public WebElement countryDropDownMenu() {
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }

    public By cityField() {
        return By.id("BillingNewAddress_City");
    }

    public By addressField() {
        return By.id("BillingNewAddress_Address1");
    }

    public By zipcodeField() {
        return By.id("BillingNewAddress_ZipPostalCode");
    }

    public By phoneNumberField() {
        return By.id("BillingNewAddress_PhoneNumber");
    }

    public By submitAddressButton() {
        return By.className("new-address-next-step-button");
    }

    public By submitShippingMethodButton() {
        return By.className("shipping-method-next-step-button");
    }

    public By shippingMethodsItems() {
        //return By.className("shipping-method-next-step-button");
        return null;
    }


    public By paymentMethodsItems() {
        //return By.className("shipping-method-next-step-button");
        return null;
    }

    public By submitPaymentMethodButton() {
        return By.className("payment-method-next-step-button");
    }

    public By paymentInfoButton() {
        return By.className("payment-info-next-step-button");
    }

    public By confirmOrderButton() {
        return By.className("confirm-order-next-step-button");
    }

    //order thank you title

    public void requiredAddressSubmissionFlow() throws InterruptedException {
        // Hard coded stuff
        Thread.sleep(2000);
        Select select = new Select(countryDropDownMenu());
        select.selectByVisibleText("Egypt");
        driver.findElement(cityField()).sendKeys("Hello City");
        driver.findElement(addressField()).sendKeys("Hello Address");
        driver.findElement(zipcodeField()).sendKeys("10101");
        driver.findElement(phoneNumberField()).sendKeys("000000000000000");
        driver.findElement(submitAddressButton()).click();

    }

}

