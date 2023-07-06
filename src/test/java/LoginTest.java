
    import manag.ApplicationManager;
    import manag.HelperUser;
    import manag.Locators;
    import manag.TestNgListener;
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

    @Listeners(TestNgListener.class)
    public class LoginTests implements ApplicationManager, HelperUser, Locators  {

        @BeforeMethod
        public void precondition(){
            if(isLogged()) logout();
        }


        @Test
        public void loginPositive(){

           openLoginForm();
             fillLoginForm("$Asdf1234","asd@fgh.com");
           submitLogin();
            Assert.assertTrue( isLoggedSuccess());

        }
        @Test
        public void loginPositiveUser(){
//    User user = new User("asd@fgh.com","$Asdf1234");
//            User user = new User()
//                    .withEmail("asd@fgh.com")
//                    .withPassword("$Asdf1234")
//                    ;
//        user.setEmail("asd@fgh.com");
//        user.setPassword("$Asdf1234");
//        user.setEmail("");
            User user;
             openLoginForm();
           fillLoginForm(User.builder().email("asd@fgh.com").psw("$Asdf1234").build());
          submitLogin();
            Assert.assertTrue( isLoggedSuccess());
        }
        @Test
        public void loginPositiveUserData(){
            User user = User.builder().email("asd@fgh.com").psw("$Asdf1234").build()
                    ;

             openLoginForm();
             fillLoginForm(user);
             submitLogin();
            Assert.assertTrue( isLoggedSuccess());
        }

        @AfterMethod
        public void postcondition(){
             clickOkButton();
        }

}
