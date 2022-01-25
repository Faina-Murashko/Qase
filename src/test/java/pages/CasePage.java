package pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
@Log4j2

public class CasePage extends BasePage {
    public static final By BUTTON_CASE = By.xpath("//a[@id='create-case-button']");
    public static final By INPUT_CASE_TITLE = By.xpath("//input[@id='title']");
    public static final By INPUT_DESCRIPTION = By.xpath("//*[contains(@class,'ProseMirror toastui-editor-contents')]");
    public static final By STEPS_CLICK = By.xpath("//a[@id='add-step']");
    public static final By ACTION_INPUT = By.xpath("/html//div[@id='react-app']/div[@class='app']/div/div[@class='row']/div[@class='col-lg-12']/div[@class='mt-4']/form[@class='form-create-case']/div[14]//div[@class='suitecase-steps']/div[1]/div//div[@class='flex-fill w-100']/div[@class='form-group']//div[@class='auto-height']//div[@class='ProseMirror toastui-editor-contents']");
    public static final By DATA_INPUT = By.xpath("/html//div[@id='react-app']/div[@class='app']/div/div[@class='row']/div[@class='col-lg-12']/div[@class='mt-4']/form[@class='form-create-case']/div[14]//div[@class='suitecase-steps']/div[1]/div/div[@class='suitecase-rows']/div/div[2]/div[@class='form-group']//div[@class='auto-height']//div[@class='ProseMirror toastui-editor-contents']");
    public static final By RESULT_INPUT = By.xpath("/html//div[@id='react-app']/div[@class='app']/div/div[@class='row']/div[@class='col-lg-12']/div[@class='mt-4']/form[@class='form-create-case']/div[14]//div[@class='suitecase-steps']/div[1]/div/div[@class='suitecase-rows']/div/div[3]/div[@class='form-group']//div[@class='auto-height']//div[@class='ProseMirror toastui-editor-contents']");
    public static final By SAVE_BUTTON_CASE = By.xpath("//button[@id='save-case']");
    public static final By INPUT_SEARCH_FOR_CASES = By.xpath("/html//div[@id='react-app']/div[@class='app']//input[@name='title'");



    public CasePage clickButtonCase() {

        log.info("Click on button created new Case");
        $(BUTTON_CASE).click();
        return new CasePage();
    }

    public CasePage inputDataCaseTitle() {
        log.info("input data title in case");
        $(INPUT_CASE_TITLE).setValue("creating additional options");
        return new CasePage();
    }

    public CasePage inputDescriptionAboutProject() {
        log.info("input data description in case");
        $(INPUT_DESCRIPTION).setValue("check login, check new project, check case");
        return new CasePage();
    }

    public CasePage clickStepLogin() {
        log.info("Click on step and add more information about steps in testing case");
        $(STEPS_CLICK).click();
        return new CasePage();
    }

    public CasePage inputActionInformation() {
        log.info("input data information about steps");
        $(ACTION_INPUT).setValue("Open sign page");
        return new CasePage();
    }

    public CasePage inputDataInformation() {
        log.info("input information example login/password");
        $(DATA_INPUT).setValue("input valid email and password");
        return new CasePage();
    }

    public CasePage expectedResult() {
        log.info("input expected result");
        $(RESULT_INPUT).setValue("popup opened");
        return new CasePage();

    }

    public CasePage clickButtonSave() {
        log.info("Click on button save case");
        $(SAVE_BUTTON_CASE).click();
        return new CasePage();
    }
    public CasePage inputSearchShouldBeVisible() {
        log.info("Click on button save case");
        $(INPUT_SEARCH_FOR_CASES).shouldBe(Condition.visible);
        return new CasePage();
    }


}
