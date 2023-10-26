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
    public void clickOnAccountsButton()   {
        clickOnButton(Accounts.AccountPageButton);
    }
    @Then("Validate 5 rows as default")
    public void validate_rows_as_default() throws InterruptedException {
        int actualSize = getListOfElements(Accounts.AccountTableLocator).size();
        Assert.assertEquals("Validate Table Rows",5, actualSize);
        Thread.sleep(6000);
    }
    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElement(locator);
    }
    public List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    @When("Change item per page to {string}")
    public void changeItemPerPage(String itemPerPage) throws InterruptedException {
        //Click to open the dropdown
        //clickOnButton(Accounts.AccountTableLocator);
        selectFromDropDown(Accounts.DropDownItems, itemPerPage);

    }
    public void selectFromDropDown(By locator, String option) throws InterruptedException {
        List<WebElement> items = getListOfElements(locator);
        for(WebElement element : items) {
            String text = element.getText();
            if (text.contains(option)) {
            element.click();
            Thread.sleep(3000);

            }gi
        }
    }

    @Then("Validate accounts table have {string} rows")
        public void validateAccountTableRows(String expectedRows) throws InterruptedException {
            List<WebElement>  tableRowsElements = getListOfElements(Accounts.AccountTableLocator);
            Assert.assertEquals("Validate Account Table row ",
                    expectedRows,
                    tableRowsElements.size());
            Thread.sleep(3000);

    }



}
