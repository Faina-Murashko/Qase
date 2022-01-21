package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectPage extends BasePage {
    public static final By INPUT_PROJECT_NAME = By.id("inputTitle");
    public static final By INPUT_PROJECT_CODE = By.id("inputCode");
    public static final By INPUT_DESCRIPTION = By.id("inputDescription");
    public static final By TYPE = By.id("public-access-type");
    public static final By BUTTON_SUBMIT = By.cssSelector("[type='submit']");



    public ProjectPage inputName() {
        $(INPUT_PROJECT_NAME).setValue(titleText);
        return new ProjectPage();
    }

    public ProjectPage inputCode() {
        $(INPUT_PROJECT_CODE).setValue(setCode);
        return new ProjectPage();
    }

    public ProjectPage inputType() {
        $(TYPE).click();
        return new ProjectPage();
    }

    public ProjectPage checkButtonCreate() {
        $(BUTTON_SUBMIT).click();
        return new ProjectPage();
    }

    public ProjectPage inputDescription() {
        $(INPUT_DESCRIPTION).setValue("verification of this project");
        return new ProjectPage();
    }
}