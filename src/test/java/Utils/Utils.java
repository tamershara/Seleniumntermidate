package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {

    public static void takeScreenShot(WebDriver driver, String name) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshots  = screenshot.getScreenshotAs(OutputType.FILE);
        File file = new File("C:\\Java training projects\\SeleniumIntermidate\\screenshots\\"+ name + ".png");
        FileUtils.copyFile(screenshots,file);
    }
}
