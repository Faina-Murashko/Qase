package pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertyReader;

public class BasePage {
    String email, password, titleText, setCode;
    WebDriver driver;


    {
    }
    public BasePage(){
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL", PropertyReader.getProperty("qase.url"));
        email = System.getenv().getOrDefault("QASE_EMAIL", PropertyReader.getProperty("qase.email"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", PropertyReader.getProperty("qase.password"));
        titleText = System.getenv().getOrDefault("QASE_TITLETEXT", PropertyReader.getProperty("qase.titleText"));
        setCode = System.getenv().getOrDefault("QASE_SETCODE", PropertyReader.getProperty("qase.setCode"));


    }
}
