package pages;

import org.openqa.selenium.By;

public class Plans {
    int i;
    String xpath1;
    String xpath2;
    String xpath;
    public final static By plansLink = By.xpath("//html/body/div[1]/div/div[2]/div/div/a[2]");
    public final static By tableLocator = By.xpath("//div[3]/div/div/div/div/table/tbody/tr");
    public final static By dateCreated1 = By.xpath("//div/table/tbody/tr[1]/td[4]");
    public final static By dateCreated2 = By.xpath("//div/table/tbody/tr[2]/td[4]");
    public final static By dateCreated3 = By.xpath("//div/table/tbody/tr[3]/td[4]");
    public final static By dateCreated4 = By.xpath("//div/table/tbody/tr[3]/td[4]");

    public final static By dateExpired1 = By.xpath("//div/table/tbody/tr[1]/td[5]");
    public final static By dateExpired2 = By.xpath("//div/table/tbody/tr[2]/td[5]");
    public final static By dateExpired3 = By.xpath("//div/table/tbody/tr[3]/td[5]");
    public final static By dateExpired4 = By.xpath("//div/table/tbody/tr[4]/td[5]");






}
