package manag;

import org.openqa.selenium.*;

public interface Locators {


    By NEGATIVREGISTRATION_ASSERT =By.xpath("//div[@class='input-container']//div[2]");
    By REGISTNEGATIVPASSWORD =By.xpath("//mat-dialog-container[@id='id=mat-dialog-0']");
    By SIGNUPELEM =By.xpath("//*[.=' Sign up ']");
    By EMAIL_INPUT =By.xpath("//input[@id='email']");
    By PASSWORD_INPUT =By.xpath("//input[@id='password']");
    By CHECK_BOX_CLICK_CSSSelector =By.cssSelector("div.checkbox-container");
    By REGIST_FORMA_NAME =By.xpath("//input[@id='name']");
    By REGIST_FORMA_lAST_NAME =By.xpath("//input[@id='lastName']");
    By SUBMIT_BTT_LOGIN =By.xpath("//button[@type='submit']");
    By LOGOUT_BTT =By.xpath("//*[.=' Logout ']");
    By OK_BTT =By.xpath("//button[@type='button']");
    By LOGIN_LOCKAT =By.xpath("//*[.=' Log in ']");
    By REGISTNEGATIVPASSWORD =By.xpath("//mat-dialog-container[@id='id=mat-dialog-0']");
    By REGISTNEGATIVPASSWORD =By.xpath("//mat-dialog-container[@id='id=mat-dialog-0']");




}
