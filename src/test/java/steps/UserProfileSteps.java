package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateAccount;
import pages.HomePage;
import pages.UserProfile;
import utility.SeleniumUtility;

public class UserProfileSteps extends SeleniumUtility {

    @When("Click on Profile button")
    public void click_on_profile_button() throws InterruptedException {
        getDriver().findElement(UserProfile.userProfileButton).click();
        Thread.sleep(8000);

    }

    @Then("Validate Name as Supervisor")
    public void validate_name_as_supervisor() throws InterruptedException {
       String actualProfileName = getDriver().findElement(UserProfile.profileName).getText();
        Assert.assertEquals("Supervisor", actualProfileName);
        Thread.sleep(1000);
    }
    @Then("Validate Username as supervisor")
    public void validate_username_as_supervisor() {
        String actualProfileUserName = getDriver().findElement(UserProfile.profileUserName).getAccessibleName();
        Assert.assertEquals("supervisor", actualProfileUserName);
    }


    @When("Click on Logout button")
    public void click_on_logout_button() {
        getDriver().findElement(UserProfile.profileLogoutButton).click();
    }
    @Then("Validate navigation to homepage")
    public void validate_navigation_to_homepage() {
        String actualPageTitleHeader = getDriver().findElement(HomePage.pageTitleHeader).getText();
        Assert.assertEquals("TEK Insurance App", actualPageTitleHeader);
    }

}


