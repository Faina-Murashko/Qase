package tests;

import com.codeborne.selenide.Condition;
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

        log.info("input data for check list");
        casePage
                .buttonCase()
                .inputCaseTitle()
                .inputDescription()
                .stepLogin()
                .stepLogin()
                .action()
                .inputData()
                .result()
                .buttonSave();
        $(By.xpath("//div[@id='suite-0']//span[@class='style_titleText-3QMtk']")).shouldBe(Condition.visible);

//                .priority()
//                .type()
//                .layer()
//                .behavior()
//                .status()
//                .stepLogin()
//                .buttonSave();
//        $(By.xpath("//div[@id='suite-0']/div[@class='rah-static rah-static--height-auto']//form[@class='style_form-ABVGq']/input"))



    }
}
