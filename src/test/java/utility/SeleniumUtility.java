package utility;

import base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {

    public String getElementText(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }
    public void clickOnButton(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }

    public void sendKeys(By locator, String key){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMinutes(1));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(key);
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }



}



