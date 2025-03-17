import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitTest {

    @Test
    public void waitTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\index.html");
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement primary = driver.findElement(By.cssSelector("[data-testID=primary]"));
        wait.until(ExpectedConditions.visibilityOf(primary));
        primary.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-testID=div]")));
        WebElement secondary = driver.findElement(By.cssSelector("[data-testID=secondary]"));
        secondary.click();


    }
}
