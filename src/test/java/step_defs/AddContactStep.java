package step_defs;

import io.cucumber.java.en.And;
import pages.AddContactPage;
import pages.AddUserPage;
import pages.ContactListPage;
import pages.LoginPage;
import utilities.TestDataGenerator;

public class AddContactStep {

    LoginPage loginPage = new LoginPage();
    AddUserPage addUserPage=new AddUserPage();

    AddContactPage addContactPage=new AddContactPage();

    ContactListPage contactListPage=new ContactListPage();

    @And("clicks Add a New Contact button")
    public void clicksAddANewContactButton() {
        contactListPage.clickAddContactButton();
    }


    @And("sends relevant info")
    public void sendsRelevantInfo() {
        addContactPage.setContactInfo();
    }
}
