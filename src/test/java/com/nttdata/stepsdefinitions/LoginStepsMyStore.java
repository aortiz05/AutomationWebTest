package com.nttdata.stepsdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsMyStore {

    private WebDriver driver;

    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
        screenShot();
    }

    @Cuando("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        com.nttdata.steps.LoginStepsMyStore loginSteps = new com.nttdata.steps.LoginStepsMyStore(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        screenShot();
        loginSteps.login();


    }

    @Entonces("valido autenticación correcta de {string}")
    public void validoAutenticacionCorrectade(String expectedTitle) {
        com.nttdata.steps.LoginStepsMyStore loginSteps = new com.nttdata.steps.LoginStepsMyStore(driver);
       String title = loginSteps.extracttextclosesesion();
        screenShot();
        Assertions.assertEquals(expectedTitle, title);

    }

    @Y("cierro sesion")
    public void cierroSesion() {
        com.nttdata.steps.LoginStepsMyStore loginSteps = new com.nttdata.steps.LoginStepsMyStore(driver);
        screenShot();
        loginSteps.closesesion();

    }
}
