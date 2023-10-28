package pages;

import org.openqa.selenium.By;

public class Login {

    public final static By userNameField = By.xpath("//div/form/div/div[1]/input");

    public final static By passwordField = By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[2]/div/input");

    public final static By logInButton = By.xpath("//html/body/div[1]/div/div[1]/div/a[2]");

    public final static By signInButton = By.xpath("//div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public final static By customerServicePortalHeader = By.xpath("//div[1]/div/div[1]/div/h2");

    public final static By errorMessage = By.xpath("//div[1]/div/div[2]/div/div/div/div/div/div");


}


