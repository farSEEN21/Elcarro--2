package manag;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.interactions.Actions;



public interface HelperUser extends ApplicationManager, HelperBase,Locators {

    default void openLoginForm(){
        wd.findElement(LOGIN_LOCKAT).click();
    }
     default void openRegistationForm(){
        {
            wd.findElement(SIGNUPELEM).click();
        }
    }
     default void fillLoginForm(String psd, String email) {
        type(EMAIL_INPUT, email);
        type(PASSWORD_INPUT, psd);
    }

         default void fillLoginForm (User user){
            type(EMAIL_INPUT, user.getEmail());
            type(PASSWORD_INPUT , user.getPsw());


        }

//
          default void clickCheckbox() {

            Rectangle rect = (Rectangle) wd.findElement(By.cssSelector("div.checkbox-container")).getRect();
            int x = rect.getX() + 5;
            int y = rect.getY() + rect.getHeight() / 4;
            Actions actions = new Actions(wd);
            actions.moveByOffset(x, y).click().perform();

        }

         default void fillRegistrationForm(User user){
            type(REGIST_FORMA_NAME, user.getName());
            type(REGIST_FORMA_lAST_NAME, user.getLastname());
            type(EMAIL_INPUT, user.getEmail());
            type( PASSWORD_INPUT, user.getPsw());
            clickCheckbox();
        }


         default void submitLogin() {
            wd.findElement(SUBMIT_BTT_LOGIN).submit();

        }

          default void logout() {
            click(LOGOUT_BTT);
        }

          default boolean isLogged() {
            return isElementPresent(LOGOUT_BTT);
        }

          default void clickOkButton() {
            click(OK_BTT);
        }

          default boolean isLoggedSuccess() {
            return isElementPresent(By.xpath("//h2[contains(text(), 'success')]"));
        }

    }


