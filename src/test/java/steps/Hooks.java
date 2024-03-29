package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    @Before

    public void setUpTests(){
        openBrowser();
    }

    @After
    public void cleanUpTests(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] picture = takeScreenshot();
            //Step 2) Attached screenshot to Scenario
            scenario.attach(picture, "image/png", "failedScreenShot");
        }

        driverQuit();
    }
}
