package manag;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.*;

public interface ApplicationManager {


//    WebDriver wd =new ChromeDriver();
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
    EventFiringWebDriver wd=new EventFiringWebDriver(new ChromeDriver());

    @BeforeSuite
      default void init() {
      //        users = new HelperUser(wd);
        wd.register(new WebDriverListener());
        wd.manage().window().maximize();
        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @AfterSuite
      default void tearsdown() {
//        wd.quit();
    }
}

