import manag.ApplicationManager;
import manag.HelperUser;
import manag.Locators;
import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationHelper implements ApplicationManager, HelperUser, Locators {

    @BeforeTest
    public void precondition() {
        if (isLogged()) {
            logout();
        }
    }

    User user;

    @Test
    public void positiveRegist() {
        int i = (int) (System.currentTimeMillis() / 1000 % 3600);

        user = User.builder()
                .name("kdsfjg").lastname("dsjfhksdjhf")
                .email("dfsklj" + i + "@jdf.com").psw("@aAvse1234")
                .build();

        openRegistationForm();
       logger.info("openRegistationForm");
        fillRegistrationForm(user);
       logger.info("fillRegistrationForm");
        submitLogin();
      logger.info("positiveRegist Starts with credentials: login"+user.getEmail()+" Password:  "+ user.getPsw());
        Assert.assertTrue(isLoggedSuccess());

    }

    @Test
    public void NegRegist() {

        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        User user = User.builder().name("Johnny").lastname("shmitt").email("do" + i + "gmail.co").psw("$Asdf1234").build();
        openRegistationForm();
        fillRegistrationForm(user);
        submitLogin();
        Assert.assertTrue(isElementPresent(NEGATIVREGISTRATION_ASSERT));
    }

    @Test
    public void RegistNegativPassword() {

        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        User user = User.builder().name("Johnny").lastname("shmitt").email("do" + i + "@gmail.co").psw("$asdf1234").build();
        openRegistationForm();
        fillRegistrationForm(user);
        submitLogin();
        pause(5000);
        Assert.assertTrue(isElementPresent(REGISTNEGATIVPASSWORD));

    }
}