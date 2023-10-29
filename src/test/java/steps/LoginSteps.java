package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.Login;
import utility.SeleniumUtility;

public class LoginSteps extends SeleniumUtility {
    @When("Click on Login button")
    public void clickOnLogInButton() {
        clickOnButton(Login.logInButton);
    }
    @When("Enter user name in user name filed as supervisor")
    public void enterUserName() {
        sendKeys(Login.userNameField, "supervisor");
    }
    @When("Enter password in password filed as tek_supervisor")
    public void enterPasswordInPassword()  {
        sendKeys(Login.passwordField, "tek_supervisor");
    }
    @When("Click on Sign In button")
    public void clickOnSignInButton() {
        clickOnButton(Login.signInButton);
    }

    @Then("Validate home page header title as {string}")
    public void validateHomePageHeaderTitle(String homePageHeaderTitle) throws InterruptedException {
        Thread.sleep(500);
        validateTitleHeader(Login.customerServicePortalHeader, homePageHeaderTitle);
    }
    @When("Enter userName as {string}")
    public void enterUsername(String userName) {
        sendKeys(Login.userNameField, userName);
    }
    @When("Enter password as {string}")
    public void enterPassword(String password) {
        sendKeys(Login.passwordField, password);
    }
    @Then("Validate error message as {string}")
    public void validateErrorMessage(String errorMessage) {
        validateTitleHeader(Login.errorMessage, errorMessage);
    }
}

