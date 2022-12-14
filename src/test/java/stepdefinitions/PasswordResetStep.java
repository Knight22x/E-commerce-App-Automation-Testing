package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Authentication;
import pages.Register;

import java.time.Duration;

import static stepdefinitions.Hooks.driver;

public class PasswordResetStep {

    Authentication reset = new Authentication();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  //Explicit waiting

    @And("The user clicks on the Forgot password? button")
    public void theUserProceedsWithResettingTheirPassword() {
        driver.findElement(reset.forgotPasswordRedirectionLink()).click();
    }

    @When("The user enters an existing valid email")
    public void theUserEntersAnExistingValidEmail() {
        driver.findElement(reset.emailAddressField()).sendKeys(Register.email);
    }

    @And("The user clicks on the Recover button")
    public void theUserClicksOnTheRecoverButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(reset.recoverPasswordButton())); //explicit wait
        driver.findElement(reset.recoverPasswordButton()).click();
    }

    @Then("The user will be sent an email with instructions to reset their password")
    public void theUserWillBeSentAnEmailWithInstructionToResetTheirPassword() {
        Assert.assertTrue(driver.findElement(By.id("bar-notification")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.tagName("p")).getText().
                contains("Email with instructions has been sent to you."));
    }


}
