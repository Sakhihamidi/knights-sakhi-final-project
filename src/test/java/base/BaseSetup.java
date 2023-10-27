package base;

import io.cucumber.core.internal.com.fasterxml.jackson.core.base.GeneratorBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.GeneralSteps;

import java.time.Duration;

public class BaseSetup extends GeneralSteps {
    private static WebDriver driver;

    // I can passing a new variable for URL as well and pass it to driver.get
    // private final String APP_URL = "https://dev.insurance.tekschool-students.com/"
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://dev.insurance.tekschool-students.com/");

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void driverQuit() {
        if (driver != null) {
           getDriver().quit();
        }
    }
}