package tests;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Log4j2

public class CheckProject extends LoginTest {

    @Test(description = "opened peg when we created new project")
    public void projectShouldBeCreated() {
        log.info("login with valid user details");
        LoginPage.openLoginPage()
                .inputEmail()
                .inputPassword()
                .buttonLogin();
        log.info("checking that the page we need has opened");
        $(By.id("createButton")).shouldBe(Condition.visible);
        $(By.xpath("//a[@id='createButton']")).click();


        log.info("input information about project");
        projectPage
                .inputName()
                .inputCode()
                .inputDescription()
                .inputType()
                .checkButtonCreate();
        log.info("checking that the desired page has opened ");
        $(By.id("create-suite-button")).shouldBe(Condition.visible);

//        $(By.xpath("input[@id='inputTitle']")).setValue(titleText);
//        $(By.id("inputCode")).setValue(setCode);
//        $(By.id("inputDescription")).setValue("Self-testing of this project");
//        $(By.id("public-access-type")).click();
//        $("[type='submit']").submit();


    }
}
