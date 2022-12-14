package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.remote.Augmenter;
import pages.Register;

import java.time.Duration;

import static utility.Constants.MAIN_URL;

public class Hooks {
    public static WebDriver driver;

    @Before
    public static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //better than thread.sleep ~ best practice
        driver.get(MAIN_URL);
        driver.manage().window().maximize();
    }


    @After
    public static void terminateDriver() {
        driver.quit();
    }
}
