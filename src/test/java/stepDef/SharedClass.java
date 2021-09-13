package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SharedClass {

    public WebDriver driver;

    @Before("@web")
    public WebDriver setUp() {
        if(driver==null){
            WebDriverManager.chromedriver().cachePath(System.getProperty("user.dir") + "/src/test/resources/drivers").setup();
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    @After("@web")
    public void cleanUp() {
        System.out.println("Quiting Browser...");
        driver.close();
        driver.quit();
    }

    @Before(order = 0)
    public void testBefore(Scenario scenario){
        System.out.println("Before Order is 0 here, default value for order is 10000");
        System.out.println("Starting: " + scenario.getName());
        System.out.println("ID: " + scenario.getId());
    }

    /*@Before
    public void setUp(Scenario scenario) {
        System.out.println("Starting: " + scenario.getName());
        System.out.println("ID: " + scenario.getId());
        System.out.println("====================================================================");
        //driver = SingleTonBase.getDriver();
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        //driver = new ChromeDriver();
        //driver = new DriverFactory().createDriver();
        //System.out.println("this will run before the actual scenario");
    }*/

    /*@BeforeStep
    public void beforeStep() {
        System.out.println("Call me before each step");
    }*/

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Ending: " + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());
        System.out.println("====================================================================");
    }



    /*@After
    public void embedScreenshot(Scenario scenario) throws IOException {

        if (scenario.isFailed()) {
            System.out.println("Scenarion Name: " + scenario.getName());
            System.out.println("Scenario Status: " + scenario.getStatus());
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }*/

}
