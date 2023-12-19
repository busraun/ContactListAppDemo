package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddUserPage;
import pages.ContactListPage;
import pages.LoginPage;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    AddUserPage addUserPage=new AddUserPage();

    ContactListPage contactListPage=new ContactListPage();
    @When("user enters valid credentials  {string} {string}")
    public void userEntersValidCredentials(String email, String password) {
        loginPage.login(email,password);
    }

    @And("clicks submit button")
    public void clicksSubmitButton() {
        addUserPage.submitButton.click();
    }

    @Then("sees the Contact List page")
    public void seesTheContactListPage() {
        contactListPage.verifyContactListHeader();
    }
}
