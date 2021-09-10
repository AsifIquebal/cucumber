package pageObjects.applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MyWrapper;

public class HomePage {

    private WebDriver driver;

    private final By searchBox = By.id("search_query_top");
    private final By searchButton = By.name("submit_search");

    public HomePage(WebDriver driver) {
        System.out.println("driver received by home page");
        this.driver = driver;
    }

    public HomePage enterSearchQuery(String string) {
        MyWrapper.sendKeys(driver, searchBox, string);
        return this;
    }

    public HomePage clickOnSearchInButton() {
        MyWrapper.click(driver, searchButton);
        return this;
    }

    By signInLink = By.xpath("//a[normalize-space()='Sign in']");

    public LoginPage clickOnSignInLink() {
        System.out.println("clicking on sign in link");
        MyWrapper.click(driver, signInLink);
        return new LoginPage(driver);
    }

}
