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
        clickOnButton(HomePage.CreatePrimaryAccountButton);
    }

    @Then("Validate form title header is Create Primary Account Holder")
    public void validateFormTitleHeaderIs() {
        String actualHeaderTitle = getElementText(CreateAccount.CreateAccPageTitleHeader);
        Assert.assertEquals("Validate Pager Title Header", "Create Primary Account Holder", actualHeaderTitle);
    }
// Create Account and fill form steps

    @When("Enter email address")
    public void enterEmailAddress() {

        sendKeys(CreateAccount.emailField, generateRandomEmail());
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
        sendKeys(CreateAccount.emailField, "Ahmad@tekschool.us");
    }
    @Then("Validate create account error message is Account with email address is exist")
    public void validateCreateAccountErrorMessageIsAccountWithEmailIsExist() {
        String  elementText1;
        elementText1 = String.valueOf(getDriver().findElement(CreateAccount.CreateAccErrorMessage));
        //   String elementText = getElementText (CreateAccount.CreateAccErrorMessage);

        Assert.assertNull("any Message", elementText1);
    }
}
