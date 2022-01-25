package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2

public class CheckProject extends LoginTest {

    @Test(description = "opened peg when we created new project")
    @Step("Enter information about our project")
    public void projectShouldBeCreated() {
        log.info("login with valid user details");
        LoginPage.openLoginPage()
                .inputEmail()
                .inputPassword()
                .buttonLogin()
                .buttonCreateShouldBeVisible();
        log.info("checking that the page we need has opened");



        log.info("input information about project");
        projectPage
                .clickOnCreateButtonCase()
                .inputName()
                .inputCode()
                .inputDescription()
                .inputType()
                .checkButtonCreate()
                .buttonCaseShouldBeVisible();
        log.info("checking that the desired page has opened ");




    }
}
