package pages;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactListPage {

    WebDriver driver= Driver.getDriver();

    public ContactListPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//h1[text()='Contact List']")
    WebElement contactListHeader;

    @FindBy(id ="add-contact")
    WebElement addContactButton;

    @SneakyThrows
    public void verifyContactListHeader() {
        String expectedContactListHeader= "Contact List";
        Thread.sleep(5000);
        String actualContactListHeader= contactListHeader.getText();
        System.out.println(contactListHeader.getText());
        Assert.assertEquals(expectedContactListHeader,actualContactListHeader);
        System.out.println("Contact List Header is visible");
    }


    @SneakyThrows
    public void clickAddContactButton() {
        Thread.sleep(5000);
        addContactButton.click();
    }
}
