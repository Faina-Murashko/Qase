package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
    public static final By INPUT_EMAIL = By.cssSelector("#inputEmail");
    public static final By INPUT_PASSWORD = By.xpath("//*[@id='inputPassword']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@id='btnLogin']");

   public static LoginPage openLoginPage(){
       open("/login");
       return new LoginPage();
   }

   public LoginPage inputEmail(){
       $(INPUT_EMAIL).setValue(email);
       return new LoginPage();
   }
   public LoginPage inputPassword(){
       $(INPUT_PASSWORD).setValue(password);
       return new LoginPage();
   }
   public LoginPage buttonLogin(){
       $(LOGIN_BUTTON).click();
       return new LoginPage();
   }
}
