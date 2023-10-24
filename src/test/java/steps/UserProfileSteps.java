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
        clickOnButton(UserProfile.userProfileButton);
        Thread.sleep(8000);
    }
    @Then("Validate Name as Supervisor")
    public void validateNameInProfile() throws InterruptedException {
       String actualProfileName = getDriver().findElement(UserProfile.profileName).getText();
        Assert.assertEquals("Supervisor", actualProfileName);
        Thread.sleep(1000);
    }
    @Then("Validate Username as supervisor")
    public void validateUsernameInProfile() {
        String actualProfileUserName = getDriver().findElement(UserProfile.profileUserName).getAccessibleName();
        Assert.assertEquals("supervisor", actualProfileUserName);
    }
    @When("Click on Logout button")
    public void clickOnLogoutButton() {
        clickOnButton(UserProfile.profileLogoutButton);
    }
    @Then("Validate navigation to homepage")
    public void validateNavigationToHomepage() {
        String actualPageTitleHeader = getDriver().findElement(HomePage.pageTitleHeader).getText();
        Assert.assertEquals("TEK Insurance App", actualPageTitleHeader);
    }

}


