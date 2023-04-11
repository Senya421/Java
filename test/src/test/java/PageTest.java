import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageTest {
    WebDriver driver;

    @BeforeEach
      void setupDriver(){
        driver = new ChromeDriver();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    }
    @AfterEach
      void quitDriver(){
        driver.quit();
    }
    @Test
    void test(){
        driver.get("https://e.mail.ru/login?from=portal ");
//        WebElement btn1 = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[2]/div/div[1]/button"));
//        btn1.click();
//        driver.switchTo().activeElement();
//        WebElement ewewewew = new WebDriverWait(driver, Duration.ofSeconds(15)).until(driver->driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[1]/div/h3")));
//        assertTrue (ewewewew.getText() != ";jgf");
//        WebElement input_mail = new WebDriverWait(driver, Duration.ofSeconds(15))
//                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")));
//        input_mail.sendKeys("FFFFFFFFFFFFFFFFFFF");

        WebElement cont = new WebDriverWait(driver, Duration.ofSeconds(60)).until(driver->driver.findElement(By.cssSelector("#root > div > div > div > div > div > div > form > div:nth-child(2) > div:nth-child(2) > div.login-row.username > div > div > div > div > div > div.base-0-2-56.first-0-2-62 > div > input")));
        cont.sendKeys("asjdkhsadb");
    }
}
