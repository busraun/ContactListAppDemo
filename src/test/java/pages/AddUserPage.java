package pages;

import org.junit.Assert;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddUserPage {

    WebDriver driver = Driver.getDriver();

    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }



    @FindBy (xpath = "//h1[text()='Add User']")
    WebElement addUserHeader;


    @FindBy(id = "firstName")
    WebElement firstNameBox;

    @FindBy(id ="lastName")
    WebElement lastNameBox;

    @FindBy(id="email")
    WebElement emailBox;

    @FindBy(id="password")
    WebElement passwordBox;

    @FindBy(id = "submit")
    public WebElement submitButton;



    public void verifyAddUserHeader() {
        String expectedAddUserHeader = "Add User";
        String actualAddUserHeader=addUserHeader.getText();
        Assert.assertEquals(expectedAddUserHeader,actualAddUserHeader);
        System.out.println("Add User Header is visible");
    }

    public void typeFirstName(String firstNameText){
        firstNameBox.sendKeys(firstNameText);
    }

    public void typeLastName(String lastNameText) {
        lastNameBox.sendKeys(lastNameText);
    }

    public void typeEmail(String emailText) {
        emailBox.sendKeys(emailText);
    }

    public void typePassword(String passwordText) {
        passwordBox.sendKeys(passwordText);
    }

    public void clickSubmit() {
        submitButton.click();
    }
}
