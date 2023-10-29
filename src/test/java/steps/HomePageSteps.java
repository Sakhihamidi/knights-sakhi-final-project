package steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CreateAccount;
import pages.HomePage;
import utility.SeleniumUtility;

import static org.openqa.selenium.By.*;

public class HomePageSteps extends SeleniumUtility {

    @Then("Validate home page header title is {string}")
    public void validatePageTitleHeader(String expectedPageTitle){
        validateTitleHeader(HomePage.pageTitleHeader, expectedPageTitle);

    }
    @Then("Validate {string} Button is exist")
    public void validateCreatePrimaryAccountButton(String buttonName){
        validateTitleHeader(HomePage.CreatePrimaryAccountButton, buttonName);
    }
    @Then("validate page title is {string}")
    public void validatePageTitleHeaderIs(String expectedPageTitle) {
        String actualPageTitle = getDriver().getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }
}


