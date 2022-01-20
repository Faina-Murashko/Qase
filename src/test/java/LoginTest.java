import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @Test
    public void Login(){
        open("/login");
        $("#inputEmail").sendKeys("fainka18@gmail.com");
        $(By.xpath("//*[@id='inputPassword']")).setValue("kawasakizx636c1").submit();
        $(By.id("createButton")).shouldBe(Condition.visible);
    }
}
