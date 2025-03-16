import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsTest {

    @Test
    public void onClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement oneClickButton = driver.findElement(By.cssSelector("[data-testID=\"onclick\"]"));
        String beforeClickText = oneClickButton.getText();
        Actions actions = new Actions(driver);
        actions.click(oneClickButton).perform();
        String afterClickText = oneClickButton.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    @Test
    public void onDoubleClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement oneClickButton = driver.findElement(By.cssSelector("[data-testID=\"onclick\"]"));
        String beforeClickText = oneClickButton.getText();
        Actions actions = new Actions(driver);
        actions.doubleClick(oneClickButton).perform();
        String afterClickText = oneClickButton.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }
}
