import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class TestBase implements Methods {


    @Override
    public void click(By locator) {
    wd.findElement(locator).click();
    }

    @Override
    public void type(By locator, User user) {
WebElement element =wd.findElement(locator);
element.clear();
element.click();
element.sendKeys((CharSequence) user);
    }

    @Override
    public void pause(int t) {
try{
    Thread.sleep(t);
}catch (InterruptedException e){

}
    }

    @Override
    public void tearsdown() {

    }
}
