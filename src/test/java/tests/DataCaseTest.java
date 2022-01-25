package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CasePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
@Log4j2
public class DataCaseTest extends BaseTest {
    @Step("Input additional information about the test case")
    @Test(description = "opened peg when we created new project")
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

        log.info("input data for check list");

        casePage
                .clickButtonCase()
                .inputDataCaseTitle()
                .inputDescriptionAboutProject()
                .clickStepLogin()
                .inputActionInformation()
                .inputDataInformation()
                .expectedResult()
                .clickButtonSave()
                .inputSearchShouldBeVisible();
        log.info("checking that the element we need is on the page");


    }
}
