package pages;


import org.openqa.selenium.By;

public class Accounts {
    public final static By AccountPageButton = By.xpath("//div[1]/div/div[2]/div/div/a[1]/span");
    public final static By AccountTableLocator = By.xpath("//div/div/div[2]/table/tbody/tr");

    public final static By DropDownItems = By.xpath("//div[3]/div/div/div/div[2]/div/div/div[3]/select/option");
    public final static By getDropDownOptions = By.xpath("//div/div[3]/div/div/div/div[2]/div/div/div[3]/select");
    public final static By dropDown10 = By.xpath("//div/div/div/div[2]/div/div/div[3]/select/option[2]");
    public final static By dropDown25 = By.xpath("//div[3]/select/option[3]");
    public final static By dropDown50 = By.xpath("//div[3]/select/option[4]");


}