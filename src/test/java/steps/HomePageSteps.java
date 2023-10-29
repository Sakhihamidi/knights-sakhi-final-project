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

        /*String actualHeaderTitle = getElementText(HomePage.pageTitleHeader);

        Assert.assertEquals("Validate Pager Title Header", expectedPageTitle, actualHeaderTitle);*/

    }
    @Then("Validate {string} Button is exist")
    public void validateCreatePrimaryAccountButton(String buttonName){
        validateTitleHeader(HomePage.CreatePrimaryAccountButton, buttonName);

      /*  String createPrimaryAccountButton = getElementText(HomePage.CreatePrimaryAccountButton);
        Assert.assertEquals("Validate Create Primary Account Button", buttonName, createPrimaryAccountButton);*/

    }


    @Then("validate page title header is {string}")
    public void validatePageTitleHeaderIs(String expectedPageTitle) {
        String actualPageTitle = getDriver().getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }
}


