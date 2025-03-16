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
        WebElement oneClickButton = driver.findElement(By.cssSelector("[data-testID=\"onClick\"]"));
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
        WebElement doubleClick = driver.findElement(By.cssSelector("[data-testID=\"onDoubleClick\"]"));
        String beforeClickText = doubleClick.getText();
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        String afterClickText = doubleClick.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    @Test
    public void onRightClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement rightClick = driver.findElement(By.cssSelector("[data-testID=\"onRightClick\"]"));
        String beforeClickText = rightClick.getText();
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        String afterClickText = rightClick.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    /*
    <input type="button" data-testID="onMouseUp" value="Click on me" onmouseup="this.value='temu'">
<input type="button" data-testID="onMouseOver" value="Click on me" onmouseover="this.value='temu'">
<input type="button" data-testID="onMouseLeave" value="Click on me" onmouseleave="this.value='temu'">
<input type="button" data-testID="onMouseOut" value="Click on me" onmouseout="this.value='temu'">
     */

    @Test
    public void onMouseUp() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement onMouseOver = driver.findElement(By.cssSelector("[data-testID=\"onMouseOver\"]"));
        WebElement onMouseLeave = driver.findElement(By.cssSelector("[data-testID=\"onMouseLeave\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(onMouseOver).moveToElement(onMouseLeave).perform();
        String afterClickText = onMouseOver.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    @Test
    public void onMouseOver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement rightClick = driver.findElement(By.cssSelector("[data-testID=\"onRightClick\"]"));
        String beforeClickText = rightClick.getText();
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        String afterClickText = rightClick.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    @Test
    public void onMouseLeave() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement rightClick = driver.findElement(By.cssSelector("[data-testID=\"onRightClick\"]"));
        String beforeClickText = rightClick.getText();
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        String afterClickText = rightClick.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    @Test
    public void onMouseOut() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\actions.html");
        WebElement rightClick = driver.findElement(By.cssSelector("[data-testID=\"onRightClick\"]"));
        String beforeClickText = rightClick.getText();
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        String afterClickText = rightClick.getAttribute("value");
        Assert.assertEquals(afterClickText,"temu");
    }

    @Test
    public void dragAndDrop() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:\\C:\\Java training projects\\SeleniumIntermidate\\src\\main\\resources\\DragandDrop.html");
        WebElement box = driver.findElement(By.cssSelector("[data-testID=\"box\"]"));
        WebElement img = driver.findElement(By.cssSelector("[data-testID=\"img\"]"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(img).moveToElement(box).release().perform();

    }

}
