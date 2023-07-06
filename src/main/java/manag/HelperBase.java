package manag;
import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import java.io.IOException;

import java.io.File;

public interface HelperBase extends ApplicationManager {


     default void type(By locator, String fill) {
        WebElement element = wd.findElement(locator);
        element.clear();
        element.sendKeys(fill);
    }

     default void click(By locator) {
        wd.findElement(locator).click();
    }

     default void pause(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {

        }
    }

     default boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;

    }
   default void takeScreenshot(String link){
        File tmp = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        File screenshot = new File(link);

        try {
            Files.copy(tmp, screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

