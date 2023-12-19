package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AddUserPage;
import pages.ContactListPage;
import pages.LoginPage;



public class SignUpStep {

    LoginPage loginPage = new LoginPage();
    AddUserPage addUserPage=new AddUserPage();

    ContactListPage contactListPage=new ContactListPage();



    @Given("user navigates base page")
    public void user_navigates_base_page() {
        loginPage.openURL();

    }

    @When("click sign up button")
    public void click_sign_up_button() {

        loginPage.clickSignUpButton();
    }


    @And("view add user page")
    public void viewAddUserPage() {
        addUserPage.verifyAddUserHeader();
    }

    @And("fill the mandatory blanks {string} {string} {string} {string}")
    public void fillTheMandatoryBlanks(String firstName, String lastName , String email, String password) {
        addUserPage.typeFirstName(firstName);
        addUserPage.typeLastName(lastName);
        addUserPage.typeEmail(email);
        addUserPage.typePassword(password);
        addUserPage.clickSubmit();
    }


    @Then("see the Contact List header")
    public void seeTheContactListHeader() {
       contactListPage.verifyContactListHeader();
    }

}

