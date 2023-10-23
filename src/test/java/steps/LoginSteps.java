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
    public void click_on_log_in_button() {
        getDriver().findElement(Login.logInButton).click();
    }
    @When("Enter user name in user name filed as supervisor")
    public void enter_user_name_in_user_name_filed_as_supervisor() {
        getDriver().findElement(Login.userNameField).sendKeys("supervisor");

    }
    @When("Enter password in password filed as tek_supervisor")
    public void enter_password_in_password_filed_as_tek_supervisor()  {
        getDriver().findElement(Login.passwordField).sendKeys("tek_supervisor");
    }
    @When("Click on Sign In button")
    public void click_on_sign_in_button() {
        getDriver().findElement(Login.SignInButton).click();
    }

    @Then("Validate home page header title is Customer Service Portal")
    public void validate_home_page_header_title_is_customer_service_portal() throws InterruptedException {
        Thread.sleep(1000);
        String actualHeaderTitle = getDriver().findElement(Login.customerServicePortalHeader).getText();
        Assert.assertEquals("Customer Service Portal", actualHeaderTitle);
    }

    @When("Enter Wrong user name in user name field")
    public void enter_wrong_user_name_in_user_name_filed() {
        getDriver().findElement(Login.userNameField).sendKeys("Wrong User Name");

    }
    @Then("Validate error message is User not found")
    public void validate_error_message_is_user_not_found() {
        String actualErrorMessage = getDriver().findElement(Login.WrongUserErrorMessage).getText();
        Assert.assertEquals("User Wrong User Name not found", actualErrorMessage);
    }
    @When("Enter wrong  password in password field")
    public void enter_wrong_password_in_password_field() {
        getDriver().findElement(Login.userNameField).sendKeys("Wrong Password");
    }
}

