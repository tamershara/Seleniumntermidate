import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class FrameTest {

    @Test
    public void windowTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\Frames.html");
        WebElement frame = driver.findElement(By.cssSelector("[data-testID=frame]"));
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().frame(frame);
        driver.findElement(By.cssSelector("[data-testid=\"submit\"]")).click();
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());

    }
}
