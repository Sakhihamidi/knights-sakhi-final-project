package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.GeneralSteps;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup extends GeneralSteps {
    //private no other clasess can directly access to instance variable
    //for encapsulation to only read not set only set in this class other class only acses to read
    private static WebDriver driver;
    //public String browserType = "chrome";
    //for readinf propery file we config the path where the file is in bas setup
//finding path ,dir means in current dile we are then going to read
    //  String configPath = System.getProperty("user.dir")+"/src/test/resources/configs/DEV_ApplicationConfig.properties";
    //for reading property class we need objest of properties
    //this class in java will read the properties
//Properties properties = new Properties();
    //other class file inputstream is also a java class fileeput stream with properties will read
    //to reading inside the file but file inputstream should work with an other class of java to read a file


// this will read url
    // String devURL = properties.getProperty("ui.url");
    //this one will read browser type
    //   String browserType = properties.getProperty("ui.browser.type");
    //if file don;t exsit exception file not fount the other one if time run for reading
    //get mesage show exactly what the error is



    // I can passing a new variable for URL as well and pass it to driver.get
// private final String APP_URL = "https://dev.insurance.tekschool-students.com/"
    public void openBrowser() {
        //step to read a property file
        //step 1) the absolute file path the property file.
        String configPath = System.getProperty("user.dir")+"/src/test/resources/configs/DEV_App_Config.properties";
        //step 2) create object from properties class in java library.
        Properties properties = new Properties();
        //step 3) LOAD OBJECT FROM PROPERTIES CLASS IN JAVA Library.
        //we need fileinputstream file java.

        try {
            FileInputStream devConfigFile = new FileInputStream(configPath);
            properties.load(devConfigFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        //step 4) read a value from property file using property key.
        String devURL = properties.getProperty("ui.url");
        String browserType = properties.getProperty("ui.browser.type");

        if (browserType.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Wrong Browser Type");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(devURL);


    }


//this one will read browser type

//if file don;t exsit exception file not fount the other one if time run for reading
//get mesage show exactly what the error is


    // I can passing a new variable for URL as well and pass it to driver.get
    // private final String APP_URL = "https://dev.insurance.tekschool-students.com/"



    public WebDriver getDriver() {
        return driver;
    }

    public void driverQuit() {
        if (driver != null) {
           getDriver().quit();
        }
    }
}