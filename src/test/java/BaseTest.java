import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PropertyReader;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    String email, password;

    @BeforeClass
    public void setUp() {
        Configuration.headless = true;
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL", PropertyReader.getProperty("qase_url"));

        email = System.getenv().getOrDefault("QASE_EMAIL", PropertyReader.getProperty("qase_email"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", PropertyReader.getProperty("qase_password"));

        Configuration.browser = "chrome";
        Configuration.savePageSource = false;
        Configuration.timeout = 1000;

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        Configuration.browserCapabilities = chromeOptions;
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        getWebDriver().quit();
    }

}
