package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepdefinitions.Hooks.driver;
import static utility.Constants.PASSWORD;
import static utility.Constants.USERNAME;

public class Register {

    public static StringBuilder email = new StringBuilder(USERNAME);
    public static StringBuilder password = new StringBuilder(PASSWORD);

    public Register() {
        email = new StringBuilder(randomTextGeneration() + "@gmail.com");
        password = randomTextGeneration();
        System.out.println("asdasfgfsagassg");
    }

    public By registerRedirectionLink() {
        return By.linkText("Register");
    }

    // Using By on the required fields # Locating by id is the best practice.

    public By firstName() {
        return By.id("FirstName");
    }

    public By lastName() {
        return By.id("LastName");
    }

    public By email() {
        return By.id("Email");
    }

    public By password() {
        return By.id("Password");
    }

    public By confirmPassword() {
        return By.id("ConfirmPassword");
    }

    public By registerButton() {
        return By.id("register-button");
    }

    // Using WebElement with different selectors on the optional fields


    public WebElement company() {
        return driver.findElement(By.name("Company"));
    }

    public WebElement newsletter() {
        return driver.findElement(By.cssSelector("input[type=\"checkbox\"]"));
    }

    /* Date of Birth */

    public WebElement day() {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement month() {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement year() {
        return driver.findElement(By.name("DateOfBirthYear"));
    }


    public StringBuilder randomTextGeneration() {
        StringBuilder result = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int charactersLength = characters.length();
        for (int i = 0; i < 10; i++) {
            result.append(characters.charAt((int) Math.floor(Math.random() * charactersLength)));
        }
        return result;
    }
}
