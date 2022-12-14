package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Authentication;

import java.time.Duration;

import static stepdefinitions.Hooks.driver;

public class LoginStep {

    Authentication login = new Authentication();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  //Explicit waiting

    @Given("The user navigates to the Login Page")
    public void theUserNavigatesToTheLoginPage() {
        driver.findElement(login.loginRedirectionLink()).click();
    }

    @When("The user enters their valid login credentials")
    public void theUserEntersTheirValidLoginCredentials() {
        login.loginInput();  // Custom Method
    }

    @And("The user clicks on the Login Button")
    public void theUserClicksOnTheLoginButton() {
        driver.findElement(login.customerPassword()).submit();
    }

    @Then("The user will be logged in successfully")
    public void theUserWillBeLoggedInSuccessfully() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ico-logout"))); //explicit wait
        Assert.assertTrue(driver.findElement(By.className("ico-logout")).isDisplayed());
    }

}
