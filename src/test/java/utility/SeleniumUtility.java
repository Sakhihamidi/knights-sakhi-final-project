package utility;

import base.BaseSetup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Accounts;

import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetup {

    public String getElementText(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }

    public void clickOnButton(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }

    public void sendKeys(By locator, String key) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(key);
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }

    public void validateAccountTables(By locator, int expectedValue) {
        int actualSize = getListOfElements(locator).size();
        Assert.assertEquals("Validate Table Rows", expectedValue, actualSize);
   }


    public List<WebElement> getListOfElements(By locator) {
        return waitUntilVisibilityOfAllElement1(locator);
    }
    public List<WebElement> waitUntilVisibilityOfAllElement1(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void changeItemDropDown(By locator) {
        clickOnButton(Accounts.getDropDownOptions);
        clickOnButton(locator);
    }
}

