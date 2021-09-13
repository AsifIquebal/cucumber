package stepDef;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

public class BaseClass {

    private final WebDriver driver;

    public BaseClass(SharedClass sharedClass) {
        driver = sharedClass.setUp();
    }

    public HomePage launchApplication(String url) {
        driver.get(url);
        return new HomePage(driver);
    }

}
