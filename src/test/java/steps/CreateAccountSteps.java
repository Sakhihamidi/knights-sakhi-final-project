package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CreateAccount;
import pages.HomePage;
import utility.SeleniumUtility;

import java.util.Random;

public class CreateAccountSteps extends SeleniumUtility {

    @When("Click on Create Primary Account button")
    public void clickOnButton() {
        clickOnButton(HomePage.CreatePrimaryAccountButton);
    }

    @Then("Validate form title header is Create Primary Account Holder")
    public void validateFormTitleHeaderIs() {
        validateTitleHeader(CreateAccount.CreateAccPageTitleHeader, "Create Primary Account Holder");
        /*String actualHeaderTitle = getElementText(CreateAccount.CreateAccPageTitleHeader);
        Assert.assertEquals("Validate Pager Title Header", "Create Primary Account Holder", actualHeaderTitle);*/
    }
// Create Account and fill form steps

    @When("Enter email address")
    public void enterEmailAddress() throws InterruptedException {
        sendKeys(CreateAccount.emailField, generateRandomEmail());
    }

    @When("Select title or prefix")
    public void selectTitleOrPrefix() {
        sendKeys(CreateAccount.titleOrPrefixField, "Mr.");
    }
    @When("Enter first name")
    public void enterFirstName() {
        sendKeys(CreateAccount.firstNameField, "Amir");
    }

    @When("Enter last name")
    public void enterLastName() {
        sendKeys(CreateAccount.lastNameField, "Amiri");
    }

    @When("Select gender")
    public void selectGender() {
        sendKeys(CreateAccount.genderField, "Male");
    }

    @When("Select marital status")
    public void selectMaritalStatus() {
        sendKeys(CreateAccount.maritalStatusField,"Married");
    }
    @When("Enter employment status")
    public void enterEmploymentStatus() {
        sendKeys(CreateAccount.employmentStatusField, "Employed");
    }
    @When("Enter date of birth")
    public void enterDateOfBirth() {
        sendKeys(CreateAccount.dateOfBirthField, "07/15/1990");
    }
    @When("Click on Create Account button")
    public void clickOnCreateButton() {
        clickOnButton(CreateAccount.createAccountButton);
    }
    @Then("Validate form title header is Sign up your account")
    public void validateFormTitleHeaderIsSignUpYourAccount() throws InterruptedException {
        Thread.sleep(500);
        validateTitleHeader(CreateAccount.CreateAccPageTitleHeader, "Sign up your account");
       /* String actualFormHeaderTitle = getElementText(CreateAccount.formTitleHeader);
        System.out.println(actualFormHeaderTitle);
        Assert.assertEquals("Validate Pager Title Header", "Sign up your account", actualFormHeaderTitle);*/
    }
    @Then("Validate email address")
    public void validateEmailAddress() {
        validateTitleHeader(CreateAccount.emailAddValidation, email);
       /* String actualEmailAddress = getElementText(CreateAccount.emailAddValidation);
        Assert.assertEquals("Validate Pager Title Header", email, actualEmailAddress);*/
    }
    @When("Enter an existing email address")
    public void enterAnExistingEmailAddress() {
        sendKeys(CreateAccount.emailField, "Ahmad@tekschool.us");
    }
    @Then("Validate create account error message as ERROR")
    public void validateCreateAccountErrorMessageIsAccountWithEmailIsExist() {
        //String  elementText1;
        //elementText1 = String.valueOf(getDriver().findElement(CreateAccount.CreateAccErrorMessage));
       String elementText = getDriver().findElement(CreateAccount.CreateAccErrorMessage).getText().trim();
        System.out.println(elementText);


        Assert.assertEquals("ERROR", elementText);
    }
}
