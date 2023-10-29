package steps;

import dev.failsafe.internal.util.Lists;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Plans;
import utility.SeleniumUtility;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PlansSteps extends SeleniumUtility {
    String formattedDate1;

    @When("Click on Plans")
    public void clickOnPlans() throws InterruptedException {
        clickOnButton(Plans.plansLink);
        Thread.sleep(3000);
    }
    @Then("Validate 4 row of data is present")
    public void validateRowsOfData()  {
        int actualSize = getListOfElements(Plans.tableLocator).size();
        Assert.assertEquals("Validate Table Rows",4, actualSize);
    }
    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElement(locator);
    }
    public List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }
    @Then("Validate Create Date is today's date in EST Time zone")
    public void validateCreateDateIsToday() {

        String actualDate1 = getElementText(Plans.dateCreated1);
        Assert.assertEquals(formattedDate, actualDate1);
        /*String actualDate2 = getElementText(Plans.dateCreated2);
        Assert.assertEquals(formattedDate, actualDate2);
        String actualDate3 = getElementText(Plans.dateCreated3);
        Assert.assertEquals(formattedDate, actualDate3);
        String actualDate4 = getElementText(Plans.dateCreated4);
        Assert.assertEquals(formattedDate, actualDate4);*/

    }
    @Then("Validate Date Expire is a day after EST Time Zone")
    public void validateDate_Expired() {
        String actualDate1 = getElementText(Plans.dateExpired1);
        Assert.assertEquals(GeneralSteps.CreateTomorrowDate(), actualDate1);
       /* String actualDate2 = getElementText(Plans.dateExpired1);
        Assert.assertEquals(expiredDate, actualDate2);
        String actualDate3 = getElementText(Plans.dateExpired3);
        Assert.assertEquals(expiredDate, actualDate3);
        String actualDate4 = getElementText(Plans.dateExpired4);
        Assert.assertEquals(formatter1, actualDate4);*/

        }

            LocalDate currentDate = LocalDate.now();

            // Define a custom date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");


            // Format the current date as a string
            String formattedDate = currentDate.format(formatter);



}
