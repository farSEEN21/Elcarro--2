import manag.ApplicationManager;
import manag.HelperCar;
import manag.HelperUser;
import models.Car;
import models.User;
import models.User_Cor_Data;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.security.auth.Subject;

import static sun.security.jgss.GSSUtil.login;

public class AddNewCar  implements ApplicationManager, HelperCar, HelperUser, User_Cor_Data {

    @BeforeMethod
    public void precondition() {

        if (isLogged() == false) {
            User_Cor_Data user;
            login(user);

        }
    }

    @Test
    public void addNewCarPositive() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        Car car = Car.builder()
                .locat("Tel Aviv")
                .make("KIA")
                .Model("Sportage")
                .year("2023")
                .fuel("Petrol")
                .seat("5")
                .carClass("B")
                .serialNumberPlate("100-200-" + i)
                .price("150")
                .about("")
                .build();
        openCarForm();
        fillCarForm(car);
        submitLogin();

    }
}