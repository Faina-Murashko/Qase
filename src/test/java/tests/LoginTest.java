package tests;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2
public class LoginTest extends BaseTest {

    @Test(description = "Login in qase.io")
    public void Login() {
        log.info("login with valid user details");
        LoginPage.openLoginPage()
                .inputEmail()
                .inputPassword()
                .buttonLogin();
        log.info("checking that the page we need has opened");
        $(By.id("createButton")).shouldBe(Condition.visible);
        $(By.xpath("//a[@id='createButton']")).click();



    }
}

