package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Accounts;
import utility.SeleniumUtility;

public class AccountsStep extends SeleniumUtility {

    @When("Click on Accounts button")
    public void clickOnAccountsButton() {
        clickOnButton(Accounts.AccountPageButton);
    }

    @Then("Validate 5 rows as default")
    public void validateRowsAsDefault() {
        validateAccountTables(Accounts.AccountTableLocator, 5);
    }

    @When("Change item per page to 10")
    public void changeItemTo10(){
        changeItemDropDown(Accounts.dropDown10);
    }

    @Then("Validate accounts table have 10 rows")
    public void validateAccountsTableHave10Rows() {
        validateAccountTables(Accounts.AccountTableLocator, 10);

    }

    @When("Change item per page to 25")
    public void changeItemTo25() {
        changeItemDropDown(Accounts.dropDown25);

    }

    @Then("Validate accounts table have 25 rows")
    public void validateAccountsTableHave25Rows() {
        validateAccountTables(Accounts.AccountTableLocator, 25);

    }

    @When("Change item per page to 50")
    public void changeItemPerPageTo50() {
        changeItemDropDown(Accounts.dropDown50);
    }

    @Then("Validate accounts table have 50 rows")
    public void validateAccountsTableHave50Rows() {
        validateAccountTables(Accounts.AccountTableLocator, 50);
    }
}
