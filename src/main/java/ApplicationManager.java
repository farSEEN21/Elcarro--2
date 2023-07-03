import lombok.experimental.Helper;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.*;

public class ApplicationManager implements Methods{

HelperUser users;

    @BeforeSuite
    public void init() {

//        wd=new EventFiringWebDriver(new ChromeDriver());

        users = new HelperUser(wd);

        wd.manage().window().maximize();
        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    @Override
    public void tearsdown() {
        wd.quit();
    }
}
}
