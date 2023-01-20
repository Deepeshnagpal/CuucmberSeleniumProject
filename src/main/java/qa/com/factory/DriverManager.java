package qa.com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

    public static WebDriver getdriver(String browser){
        WebDriver driver = null;

        if(browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
}
