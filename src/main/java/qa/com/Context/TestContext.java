package qa.com.Context;

import org.openqa.selenium.WebDriver;
import qa.com.Pages.LoginPage;

public class TestContext {
    private LoginPage getLoginPage;
    private WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage getGetLoginPage() {
        return getLoginPage;
    }
    public void initializeObjects(WebDriver driver){
        getLoginPage = new LoginPage(driver);
    }


}
