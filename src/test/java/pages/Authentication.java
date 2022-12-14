package pages;

import org.openqa.selenium.By;

import static stepdefinitions.Hooks.driver;


public class Authentication {


    //Login
    public By loginRedirectionLink() {
        return By.linkText("Log in");
    }

    public By customerEmail() {
        return By.id("Email");
    }

    public By customerPassword() {
        return By.id("Password");

    }

    // Using Custom Method
    public void loginInput() {
        driver.findElement(customerEmail()).sendKeys(Register.email);
        driver.findElement(customerPassword()).sendKeys(Register.password);
    }

    public void loginFlow() {
        driver.findElement(loginRedirectionLink()).click();
        // For running all the tests at once every time ( Random Generation )
        driver.findElement(customerEmail()).sendKeys((Register.email));
        driver.findElement(customerPassword()).sendKeys(Register.password);

        // For running each test separately every time ( Random Generation )

        driver.findElement(customerPassword()).submit();
    }

    //Reset Password
    public By forgotPasswordRedirectionLink() {
        return By.linkText("Forgot password?");
    }

    public By emailAddressField() {
        return By.id("Email");
    }

    public By recoverPasswordButton() {
        return By.className("password-recovery-button");
    }
}

