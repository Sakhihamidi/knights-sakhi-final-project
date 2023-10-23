package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.SeleniumUtility;

public class Hooks extends SeleniumUtility {

    @Before

    public void setUpTests(){
        openBrowser();
    }

    @After
    public void cleanUpTests(){
        driverQuit();

    }
}
