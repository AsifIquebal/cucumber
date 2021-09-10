package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.applicationPages.HomePage;
import pageObjects.applicationPages.LoginPage;
import pageObjects.applicationPages.MyAccount;
import pageObjects.base.BaseClass;
import pageObjects.base.SharedClass;

public class AutomationPracticeSteps extends BaseClass {

    LoginPage loginPage;
    MyAccount myAccount;
    HomePage homePage;

    public AutomationPracticeSteps(SharedClass sharedClass) {
        super(sharedClass);
    }

    @Given("User open browser and  navigates to {string}")
    public void user_navigate_to_the_application_URL(String url) {
        homePage = launchApplication(url);
    }

    @Then("^user opens Login Page$")
    public void user_opens_Login_Page() {
        loginPage = homePage.clickOnSignInLink();
    }

    @Then("user enters {string} on Username")
    public void user_enters_on_Username(String arg1) {
        loginPage.enterEmail(arg1);
    }

    @Then("user enters {string} on Password")
    public void user_enters_on_Password(String arg1) {
        loginPage.enterPassword(arg1);
    }

    @Then("^user clicks on SignIn button$")
    public void user_clicks_on_SignIn_button() {
        myAccount = loginPage.clickOnSignInButton();
    }

    @Then("^user clicks on My Address section$")
    public void user_clicks_on_My_Address_section() {
        myAccount.ClickOnMyAddress();
    }

    @Then("^user create a new address$")
    public void user_create_a_new_address() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user delete the address$")
    public void user_delete_the_address() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user log out of the application$")
    public void user_log_out_of_the_application() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user search for(.*)$")
    public void user_search_for_(String string) {
        homePage
                .enterSearchQuery(string)
                .clickOnSearchInButton();

    }

    //@Then("^user get \"([^\"]*)\" product as result$")
    @Then("^user get (\\d.*) product as result$")
    public void user_get_product_as_result(String arg1) {
        System.out.println("Received value: " + arg1);
        // Write code here that turns the phrase above into concrete actions
    }


    @Then("go to {string}")
    public void goTo(String arg0) {
    }


}
