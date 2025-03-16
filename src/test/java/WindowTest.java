import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class WindowTest {

    @Test
    public void windowTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\window.html");
        System.out.println(driver.getWindowHandle());

        driver.findElement(By.linkText("about")).click();

        ArrayList<String> windowHandles = new ArrayList<>(driver.getWindowHandles());

        String windowAbout = driver.switchTo().window(windowHandles.get(1)).getWindowHandle();

        Assert.assertEquals(driver.getWindowHandle(), windowAbout );
    }
}
