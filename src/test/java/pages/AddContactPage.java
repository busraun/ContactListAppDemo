package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestDataGenerator;

public class AddContactPage {

    WebDriver driver= Driver.getDriver();

    public AddContactPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "firstName")
    WebElement firstNameBox;

    @FindBy(id = "lastName")
    WebElement lastNameBox;

    @FindBy(id="birthdate")
    WebElement birthDateBox;

    @FindBy(id="email")
    WebElement emailBox;

    @FindBy(id="phone")
    WebElement phoneBox;

    @FindBy(id="street1")
    WebElement streetAddress1Box;

    @FindBy(id="street2")
    WebElement streetAddress2Box;

    @FindBy(id="city")
    WebElement cityBox;

    @FindBy(id="stateProvince")
    WebElement stateProvinceBox;

    @FindBy(id="postalCode")
    WebElement postalCodeBox;

    @FindBy(id="country")
    WebElement countryBox;

    @FindBy(id="submit")
    WebElement submitButton;

    @SneakyThrows
    public void setContactInfo(){
        Thread.sleep(3000);
        firstNameBox.sendKeys(TestDataGenerator.generateRandomFirstName());
        lastNameBox.sendKeys(TestDataGenerator.generateRandomLastName());
        birthDateBox.sendKeys(TestDataGenerator.generateRandomDate());
        emailBox.sendKeys(TestDataGenerator.generateRandomEmail());
        phoneBox.sendKeys(TestDataGenerator.generateRandomPhoneNumber());
        streetAddress1Box.sendKeys(TestDataGenerator.generateRandomStreetAdress1());
        streetAddress2Box.sendKeys(TestDataGenerator.generateRandomStreetAdress2());
        cityBox.sendKeys(TestDataGenerator.generateRandomCity());
        stateProvinceBox.sendKeys(TestDataGenerator.generateRandomState());
        postalCodeBox.sendKeys(TestDataGenerator.generateRandomPostalCode());
        countryBox.sendKeys(TestDataGenerator.generateRandomCountry());
        submitButton.click();
    }
}
