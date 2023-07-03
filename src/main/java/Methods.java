import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Methods {

   WebDriver wd = new ChromeDriver();

    public void click(By locator);

    public void type(By locator, User user);
public void pause(int t);
    public void tearsdown();

}
