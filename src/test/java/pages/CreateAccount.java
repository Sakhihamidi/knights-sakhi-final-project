package pages;

import org.openqa.selenium.By;

public class CreateAccount {

    public final static By CreateAccPageTitleHeader = By.xpath("//html/body/div[1]/div/div[2]/div/div/div/h2");

    public final static By emailField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[1]/input");
    public final static By titleOrPrefixField = By.xpath("//div/div[2]/div/div/div/form/div/div[1]/div[2]/div/select");
    public final static By firstNameField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[3]/input");
    public final static By lastNameField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[4]/input");
    public final static By genderField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select");
    public final static By maritalStatusField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[6]/div/select");
    public final static By employmentStatusField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[7]/input");
    public final static By dateOfBirthField = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[1]/div[8]/input");

    public final static By createAccountButton = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");
    public final static By emailAddValidation = By.xpath("//html/body/div[1]/div/div[2]/div/div/div/h2[3]");
    public final static By formTitleHeader = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[1]");
    public final static By CreateAccErrorMessage = By.xpath("//div[contains(text(), 'ERROR')]");







}
