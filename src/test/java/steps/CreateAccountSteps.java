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
    public static String email;


    @When("Click on Create Primary Account button")
    public void clickOnButton() {
        getDriver().findElement(HomePage.CreatePrimaryAccountButton).click();
    }

    @Then("Validate form title header is Create Primary Account Holder")
    public void validateFormTitleHeaderIs() {
        String actualHeaderTitle = getElementText(CreateAccount.CreateAccPageTitleHeader);
        Assert.assertEquals("Validate Pager Title Header", "Create Primary Account Holder", actualHeaderTitle);
    }
// Create Account and fill form steps

    @When("Enter email address")
    public void enterEmailAddress() {
        getDriver().findElement(CreateAccount.emailField).sendKeys(generateRandomEmail());
    }

    // Rando email
    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String domain = "tekschool.us";
        int usernameLength = 10;

        StringBuilder randomEmail = new StringBuilder();

        Random random = new Random();

        // Generate the username part
        for (int i = 0; i < usernameLength; i++) {
            int index = random.nextInt(allowedChars.length());
            randomEmail.append(allowedChars.charAt(index));
        }

        // Append the domain
        randomEmail.append("@").append(domain);

        email = randomEmail.toString();
        return email;

    }


    @When("Select title or prefix")
    public void selectTitleOrPrefix() {
        getDriver().findElement(CreateAccount.titleOrPrefixField).sendKeys("Mr.");
    }

    @When("Enter first name")
    public void enterFirstName() {
        getDriver().findElement(CreateAccount.firstNameField).sendKeys("Amir");
    }

    @When("Enter last name")
    public void enterLastName() {
        getDriver().findElement(CreateAccount.lastNameField).sendKeys("Amiri");
    }

    @When("Select gender")
    public void selectGender() {
        getDriver().findElement(CreateAccount.genderField).sendKeys("Male");
    }

    @When("Select marital status")
    public void selectMaritalStatus() {
        getDriver().findElement(CreateAccount.maritalStatusField).sendKeys("Male");
    }

    @When("Enter employment status")
    public void enterEmploymentStatus() {
        getDriver().findElement(CreateAccount.employmentStatusField).sendKeys("Employed");
    }

    @When("Enter date of birth")
    public void enterDateOfBirth() {
        getDriver().findElement(CreateAccount.dateOfBirthField).sendKeys("07/20/1986");
    }

    @When("Click on Create Account button")
    public void clickOnCreateButton() {
        getDriver().findElement(CreateAccount.createAccountButton).click();
    }

    @Then("Validate form title header is Sign up your account")

    public void validateFormTitleHeaderIsSignUpYourAccount() throws InterruptedException {
        Thread.sleep(1000);
        String actualFormHeaderTitle = getElementText(CreateAccount.formTitleHeader);
        System.out.println(actualFormHeaderTitle);
        Assert.assertEquals("Validate Pager Title Header", "Sign up your account", actualFormHeaderTitle);
    }

    @Then("Validate email address")
    public void validateEmailAddress() {
        String actualEmailAddress = getElementText(CreateAccount.emailAddValidation);
        Assert.assertEquals("Validate Pager Title Header", email, actualEmailAddress);
    }

    @When("Enter an existing email address")
    public void enterAnExistingEmailAddress() {
        getDriver().findElement(CreateAccount.emailField).sendKeys("Ahmad@tekschool.us");
    }

    @Then("Validate create account error message is Account with email address is exist")
    public void validateCreateAccountErrorMessageIsAccountWithEmailIsExist() {
        String elementText = getElementText (CreateAccount.CreateAccErrorMessage);

        Assert.assertNull("any Message", elementText);
    }
}
