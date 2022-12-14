package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepdefinitions.Hooks.driver;

public class Home {

    //Search
    public By searchField() {
        return By.id("small-searchterms");
    }

    public By cartRedirectionLink()
    {return By.id("topcartlink");
    }

    //Currency Change
    public WebElement currencyChangeOption() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public By wishList() {
        return By.linkText("Wishlist");
    }

    public By compareList() {
        return By.linkText("Compare products list");
    }

    public WebElement successAlert()
    {
        try {
            return driver.findElement(By.cssSelector(".bar-notification.success"));
        }
        catch (Exception e)
        {
            return  null;
        }
    }


    public int cartCount() {
        String count =  driver.findElement(By.className("cart-qty")).getText();
        count = count.substring(1, count.length() - 1);
        return Integer.parseInt(count);
    }



}
