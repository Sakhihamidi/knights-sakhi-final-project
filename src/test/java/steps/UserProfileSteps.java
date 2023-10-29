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
    public void clickOnProfileButton() throws InterruptedException {
        Thread.sleep(500);
        clickOnButton(UserProfile.userProfileButton);
        Thread.sleep(500);

    }
    @Then("Validate Name as {string}")
    public void validateNameInProfile(String expectedName) {
       String actualProfileName = getDriver().findElement(UserProfile.profileName).getText();
        Assert.assertEquals(expectedName, actualProfileName);
    }
    @Then("Validate Username as {string}")
    public void validateUsernameInProfile(String expectedUserName) {
        validate(UserProfile.profileUserName, expectedUserName);

    }
    @When("Click on Logout button")
    public void clickOnLogoutButton() {
        clickOnButton(UserProfile.profileLogoutButton);
    }

}


