package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddUserPage {

    public AddUserPage() {
        PageFactory.initElements(driver,this);
    }
    WebDriver driver = Driver.getDriver();


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



    public void verifyAddUserHeader() {
        String expectedAddUserHeader = "Add User";
        String actualAddUserHeader=addUserHeader.getText();
        Assert.assertEquals(expectedAddUserHeader,actualAddUserHeader);
        System.out.println("Add User Header is visible");
    }
}
