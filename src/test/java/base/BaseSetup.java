package base;

import io.cucumber.core.internal.com.fasterxml.jackson.core.base.GeneratorBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.GeneralSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup extends GeneralSteps {
    private static WebDriver driver;
    public String typeOfDriver = "chrome";

    String configPath = System.getProperty("user.dir")+"/src/test/resources/configs/DEV_App_Config.properties";
    Properties properties = new Properties();
    FileInputStream devConfigFile;

    {
        try {
            devConfigFile = new FileInputStream(configPath);
            properties.load(devConfigFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    String devURL = properties.getProperty("App_URL");
    String browserType = properties.getProperty("browserType");


//this one will read browser type

//if file don;t exsit exception file not fount the other one if time run for reading
//get mesage show exactly what the error is


    // I can passing a new variable for URL as well and pass it to driver.get
    // private final String APP_URL = "https://dev.insurance.tekschool-students.com/"


    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://dev.insurance.tekschool-students.com");

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