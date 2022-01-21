package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CasePage;
import pages.LoginPage;
import pages.ProjectPage;
import utils.PropertyReader;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    WebDriver driver;
    String titleText, setCode;
    LoginPage loginPage;
    ProjectPage projectPage;
    CasePage casePage;
    @BeforeClass
    public void setUp() {
        loginPage = new LoginPage();
        projectPage = new ProjectPage();
        casePage = new CasePage();



//        Configuration.headless = true;

        Configuration.browser = "chrome";
        //   Configuration.clickViaJs = true;
        Configuration.savePageSource = false;
        Configuration.timeout = 10000;

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);

//        chromeOptions.addArguments("headless");
//        Configuration.browserCapabilities = chromeOptions;
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        getWebDriver().quit();
    }
}