package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static stepdefinitions.Hooks.driver;

public class ProductListing {

    static public int successfulCartAdditions = 0;
    static Home home = new Home();
    static public int currentCartCount = home.cartCount();
    Actions actions = new Actions(driver);

    public List<WebElement> color() {
        return driver.findElements(By.xpath("//li[@class='item color-item']"));
    }

    public List<WebElement> products() {
        return driver.findElements(By.cssSelector(".item-box .product-title a"));
    }

    public List<WebElement> tags() {
        return driver.findElements(By.xpath("//div[@class='tags']/ul/*"));
    }

    public By pageTitle() {
        return By.cssSelector(".page-title h1");
    }

    public List<WebElement> category() {
        return driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/*"));
    }

    public List<WebElement> subCategory(int index) {
        return driver.findElements(By.xpath
                (String.format("//ul[@class='top-menu notmobile']/li[%d]/ul[@class='sublist first-level']/*", index)));

    }

    public By addToCartButton() {
        return By.className("add-to-cart-button");
    }

    public By addToWishlistButton() {
        return By.className("add-to-wishlist-button");
    }

    public By addToCompareListButton() {
        return By.className("add-to-compare-list-button");
    }


    public void viewRandomCategoryAndSubcategory() throws InterruptedException {
        Random rand = new Random();
        List<WebElement> categories = category();
        int index = rand.nextInt(categories.size());
        WebElement selectedCategory = categories.get(index);
        actions.moveToElement(selectedCategory).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        List<WebElement> subcategories = subCategory(index + 1);
        if (subcategories.size() > 0) {
            int index2 = rand.nextInt(subcategories.size());
            selectedCategory = subcategories.get(index2);
        }
        Thread.sleep(2000);
        selectedCategory.click();
    }


    public void addDifferentProductToTheCart() throws InterruptedException {
        Thread.sleep(2000);

        Random rand = new Random();
        int index = rand.nextInt(products().size());
        Thread.sleep(2000);
        products().get(index).click();
        Thread.sleep(2000);
        driver.findElement(addToCartButton()).click();
        Thread.sleep(2000);
        if (home.successAlert() != null) {
            successfulCartAdditions++;
            System.out.println(successfulCartAdditions);
        }
        viewRandomCategoryAndSubcategory();

    }

    public void addDifferentProductToTheWishList() throws InterruptedException {
        Thread.sleep(2000);
        Random rand = new Random();
        int index = rand.nextInt(products().size());
        Thread.sleep(2000);
        products().get(index).click();
        Thread.sleep(2000);
        driver.findElement(addToWishlistButton()).click();
        Thread.sleep(2000);
        viewRandomCategoryAndSubcategory();

    }

    public void addDifferentProductToTheCompareList() throws InterruptedException {
        Thread.sleep(2000);
        Random rand = new Random();
        int index = rand.nextInt(products().size());
        Thread.sleep(2000);
        products().get(index).click();
        Thread.sleep(2000);
        driver.findElement(addToCompareListButton()).click();
        Thread.sleep(2000);
        viewRandomCategoryAndSubcategory();

    }
}
