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
    @Then("Validate home page header title is Customer Service Portal")
    public void validateHomePageHeaderTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actualHeaderTitle = getDriver().findElement(Login.customerServicePortalHeader).getText();
        Assert.assertEquals("Customer Service Portal", actualHeaderTitle);
    }
    @When("Enter Wrong user name in user name field")
    public void enterWrongUserName() {
        sendKeys(Login.userNameField, " Wrong UserName");
    }
    @Then("Validate error message is User not found")
    public void validateErrorMessage() {
        String actualErrorMessage = getDriver().findElement(Login.WrongUserErrorMessage).getText();
        Assert.assertEquals("User Wrong User Name not found", actualErrorMessage);
    }
    @When("Enter wrong  password in password field")
    public void enterWrongPassword() {
        sendKeys(Login.passwordField, "Wrong Password");
    }
}

