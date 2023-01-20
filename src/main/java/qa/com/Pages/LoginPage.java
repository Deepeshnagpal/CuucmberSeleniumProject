package qa.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUserName(String string) {
        driver.findElement(By.id("user_email_login")).sendKeys(string);
    }
    public void enterPassword(String string) {
        driver.findElement(By.id("user_password")).sendKeys(string);
    }
    public void click_Login_Button() throws InterruptedException {
        WebElement element = driver.findElement(By.id("user_submit"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        Thread.sleep(5000);
    }
}
