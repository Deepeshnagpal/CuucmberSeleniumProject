package qa.com.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import qa.com.Context.TestContext;
import qa.com.factory.DriverManager;

public class LoginStepDef {
    TestContext testContext;
    Scenario scn;
    public LoginStepDef(TestContext testContext) {
        this.testContext = testContext;
    }
    @Given("open the browser")
    public void open_the_browser() {
        WebDriver driver = DriverManager.getdriver("edge");
        testContext.setDriver(driver);
        testContext.initializeObjects(driver);
        scn.log("open the browser");
    }
    @Given("enter the url as {string}")
    public void enter_the_url_as(String string) {
        testContext.getDriver().get(string);
    }
    @Given("enter the username as {string}")
    public void enter_the_username_as(String string) {
        testContext.getGetLoginPage().enterUserName(string);
    }
    @Given("enter the password as {string}")
    public void enter_the_password_as(String string) {
        testContext.getGetLoginPage().enterPassword(string);
    }
    @Given("click on the Login button")
    public void click_on_the_login_button() throws InterruptedException {
       testContext.getGetLoginPage().click_Login_Button();
    }

    @Then("verify the title of the homePage")
    public void verify_the_title_of_the_home_page() {
        String title = testContext.getDriver().getTitle();
        scn.log("Title of page is " + title);
    }

    @Before
    public void setUp(Scenario s) {
        this.scn = s;
    }

    @After
    public void tearDown() {
        testContext.getDriver().quit();
    }
}
