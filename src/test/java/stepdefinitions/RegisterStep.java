package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Register;

import static stepdefinitions.Hooks.driver;


public class RegisterStep {

    static Register register = new Register();
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  //Explicit waiting

    // I autogenerated these from the feature file

    @Given("The user navigates to the Registration webpage")
    public void theUserNavigatesToTheRegistrationWebpage() {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(register.RegisterRedirectionLink()));
        driver.findElement(register.registerRedirectionLink()).click();

    }

    @When("The user enters their first name")
    public void theUserEntersTheirFirstName() {

        driver.findElement(register.firstName()).sendKeys(register.randomTextGeneration());
    }

    @And("The user enters their last name")
    public void theUserEntersTheirLastName() {
        driver.findElement(register.lastName()).sendKeys(register.randomTextGeneration());
    }

    @And("The user enters their email")
    public void theUserEntersTheirEmail() {
        driver.findElement(register.email()).sendKeys(Register.email);
    }

    @And("The user enters their chosen password")
    public void theUserEntersTheirChosenPassword() {
        driver.findElement(register.password()).sendKeys((Register.password));
    }

    @And("The user enters their password again for confirmation")
    public void theUserEntersTheirPasswordAgainForConfirmation() {
        driver.findElement(register.confirmPassword()).sendKeys((register.password));
    }

    @And("The user clicks on the registration button")
    public void theUserClicksOnTheRegistrationButton() {
        driver.findElement(register.registerButton()).click();
    }

    @Then("The user will have an account created successfully")
    public void theUserWillHaveAnAccountCreatedSuccessfully() {
        Assert.assertTrue(driver.findElement(By.className("result")).getText().
                contains("Your registration completed"));
    }

}