package pages;


import org.openqa.selenium.By;

public class Accounts {
    public final static By AccountPageButton = By.xpath("//div/a[1]/span");
    public final static By AccountTableLocator = By.xpath("//div[2]/table/tbody/tr");

    public final static By getDropDownOptions = By.xpath("//div[3]/select");
    public final static By dropDown10 = By.xpath("//div[3]/select/option[2]");
    public final static By dropDown25 = By.xpath("//div[3]/select/option[3]");
    public final static By dropDown50 = By.xpath("//div[3]/select/option[4]");


}