package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

      WebDriver driver = Driver.getDriver();
      AddUserPage addUserPage=new AddUserPage();


    @SneakyThrows
    public void openURL() {
        System.out.println("Website is launching");
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        System.out.println("Website is launching 2 ");
        Thread.sleep(1000);

    }

    @SneakyThrows
    public void clickSignUpButton()  {
        By signUpButton = By.id("signup");
        WebElement signupButton=driver.findElement(signUpButton);
        Thread.sleep(1000);
        signupButton.click();
        System.out.println("signupButton is clicked ");
    }

    public void login(String email, String password){
        addUserPage.emailBox.sendKeys(email);
        addUserPage.passwordBox.sendKeys(password);

    }


}
