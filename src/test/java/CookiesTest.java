import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static Utils.Utils.takeScreenShot;

public class CookiesTest {

    @Test
    public void cookiesTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://todo.qacart.com");

        Cookie access_token = new Cookie("access_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY3ZDg1NDQ3ZDk1MWU1MDAxNGE2N2EzNiIsImZpcnN0TmFtZSI6InRlc3QiLCJsYXN0TmFtZSI6ImF1dG9tYXRpb24iLCJpYXQiOjE3NDIyMzA1OTl9.uEDIu4gbQWL7lDw42aKSfBg8qMgH1E5YlEgvAbi3TIQ");
        Cookie firstName = new Cookie("firstName", "test");
        Cookie userID = new Cookie("userID", "j%3A%2267d85447d951e50014a67a36%22");
        driver.manage().addCookie(access_token);
        driver.manage().addCookie(firstName);
        driver.manage().addCookie(userID);
        driver.navigate().refresh();

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement welcomeMessage = driver.findElement(By.cssSelector("[data-testid=\"welcome\"]"));
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        Assert.assertTrue(welcomeMessage.isDisplayed());
        takeScreenShot(driver,"Welcome");

    }
}
