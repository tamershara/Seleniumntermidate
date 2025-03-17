import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptTest {
    @Test
    public void javaScriptTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://help.instagram.com/581066165581870/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.linkText("here"));
        js.executeScript("arguments[0].scrollIntoView(true)",element);




    }
}
