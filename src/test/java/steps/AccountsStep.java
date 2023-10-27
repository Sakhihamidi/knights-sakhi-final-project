package steps;

import base.BaseSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.Accounts;
import pages.Plans;
import utility.SeleniumUtility;

import javax.swing.*;
import java.util.List;

public class AccountsStep extends SeleniumUtility {

    @When("Click on Accounts button")
    public void clickOnAccountsButton() {
        clickOnButton(Accounts.AccountPageButton);
    }

    @Then("Validate 5 rows as default")
    public void validate_rows_as_default() throws InterruptedException {
        int actualSize = getListOfElements(Accounts.AccountTableLocator).size();
        Assert.assertEquals("Validate Table Rows", 5, actualSize);
        Thread.sleep(6000);
    }

    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElement(locator);
    }

    public List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }


    @When("Change item per page to 10")
    public void changeItemTo10() throws InterruptedException {
        clickOnButton(Accounts.getDropDownOptions);
        clickOnButton(Accounts.dropDown10);
        Thread.sleep(5000);
    }

    @Then("Validate accounts table have 10 rows")
    public void validateAccountsTableHave10Rows() throws InterruptedException {
        int actualSize = getListOfElements(Accounts.AccountTableLocator).size();
        Assert.assertEquals("Validate Table Rows", 10, actualSize);
        Thread.sleep(6000);
    }

    @When("Change item per page to 25")
    public void changeItemTo25() {
        clickOnButton(Accounts.getDropDownOptions);
        clickOnButton(Accounts.dropDown25);
    }

    @Then("Validate accounts table have 25 rows")
    public void validateAccountsTableHave25Rows() throws InterruptedException {
        int actualSize = getListOfElements(Accounts.AccountTableLocator).size();
        Assert.assertEquals("Validate Table Rows", 25, actualSize);
        Thread.sleep(6000);

    }

    @When("Change item per page to 50")
    public void changeItemPerPageTo50() throws InterruptedException {
        clickOnButton(Accounts.getDropDownOptions);
        clickOnButton(Accounts.dropDown50);
        Thread.sleep(6000);
    }

    @Then("Validate accounts table have 50 rows")
    public void validateAccountsTableHave50Rows() throws InterruptedException {
        int actualSize = getListOfElements(Accounts.AccountTableLocator).size();
        Assert.assertEquals("Validate Table Rows", 50, actualSize);
        Thread.sleep(6000);
    }
}
